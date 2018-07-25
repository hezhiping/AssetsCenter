var data_none_html = '<div style="text-align:center;color:red">无记录</div>';//无数据显示
var power_modify = false;//编辑权限
var where1 = '';//已执行的查询条件
/*日期格式化*/
function DateToStr(date) {
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    var d = date.getDate();
    return y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d);
}
/*时间格式化*/
function DateTimeToStr(date) {
    var y = date.getFullYear();
    var mo = date.getMonth() + 1;
    var d = date.getDate();
    var h = date.getHours();
    var mi = date.getMinutes();
    return y + '-' + (mo < 10 ? ('0' + mo) : mo) + '-' + (d < 10 ? ('0' + d) : d) + ' ' + (h < 10 ? ('0' + h) : h) + ':' + (mi < 10 ? ('0' + mi) : mi);
}
/*字符转日期*/
function StrToDate(s) {
    if (!s) return new Date();
    //var ss = (s.split('-'));
    //var y = parseInt(ss[0], 10);
    //var m = parseInt(ss[1], 10);
    //var d = parseInt(ss[2], 10);
    //if (!isNaN(y) && !isNaN(m) && !isNaN(d)) {
    //    return new Date(y, m - 1, d);
    //} else {
    //    return new Date();
    //}
    var t = Date.parse(s);
    if (!isNaN(t)) {
        return new Date(t);
    } else {
        return new Date();
    }
}

//日期(字符串)相加，返回字符串
function StrDateAdd(s, n) {
    var f = StrToDate(s);
    var t = f.setDate(f.getDate() + n);
    return DateToStr(new Date(t));
}
//日期相加，返回日期
function DateAdd(d, n) {
    var t = d.setDate(d.getDate() + n);
    return new Date(t);
}
//本月第一天
function MonthFirstDate(d) {
    var f = d.setDate(1);
    return new Date(f);
}
//转换json日期
function renderDate(jsondate) {
    var d = new Date(parseInt(jsondate.replace("/Date(", "").replace(")/", "").split("+")[0]));
    return DateToStr(d);
}
//转换json时间
function renderDateTime(jsondate) {
    var d = new Date(parseInt(jsondate.replace("/Date(", "").replace(")/", "").split("+")[0]));
    return DateTimeToStr(d);
}
////开始日期
//function STonSelect(date) {
//    var ymd = "";
//    var y = date.getFullYear();
//    var m = date.getMonth() + 1;
//    var d = date.getDate();
//    ymd = y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d);
//    return document.getElementById("staday").value = ymd;
//}
////结束日期
//function ETonSelect(date) {
//    var ymd = "";
//    var y = date.getFullYear();
//    var m = date.getMonth() + 1;
//    var d = date.getDate();
//    ymd = y + '-' + (m < 10 ? ('0' + m) : m) + '-' + (d < 10 ? ('0' + d) : d);
//    return document.getElementById("enday").value = ymd;
//}
/*查询1*/
function doSearch1(dgid, where, value, name, url) {
    where1 = where;
    if (name != "all") {
        if (value != "") {
            if (where1 != "") {
                where1 += " and ";
            }
            where1 += name + " like  '%" + value + "%'";

            if (url) {
                $(dgid).datagrid({ url: url + '?sw=' + encodeURIComponent(where1) });
            }
            else {
                $(dgid).datagrid('load', { sw: where1 });
            }
        }
        else {
            $.messager.alert('提示', '请输入关键字！', 'warning');
        }
    }
    else {
        if (value == "") {
            if (url) {
                $(dgid).datagrid({ url: url + '?sw=' + encodeURIComponent(where1) });
            }
            else {
                $(dgid).datagrid('load', { sw: where1 });
            }
        }
        else {
            $.messager.alert('提示', '请选择条件！', 'warning');
        }
    }
}
/*查询2*/
function doSearch2(dgid, where, sb1, sb2, url) {
    where1 = where;
    if (sb1) {
        var name1 = $(sb1).searchbox('getName');
        var value1 = $(sb1).searchbox('getValue');
        value1 = String(value1).trim();
        if (value1 != '') {
            if (where1 != "") {
                where1 += " and ";
            }
            where1 += name1 + " like '%" + value1 + "%'";
        }
    }
    if (sb2) {
        var name2 = $(sb2).searchbox('getName');
        var value2 = $(sb2).searchbox('getValue');
        value2 = String(value2).trim();
        if (value2 != '') {
            if (where1 != "") {
                where1 += " and ";
            }
            where1 += name2 + " like '%" + value2 + "%'";
        }
    }
    if (url) {
        $(dgid).datagrid({ url: url + '?sw=' + encodeURIComponent(where1) });
    }
    else {
        $(dgid).datagrid('load', { sw: where1 });
    }
}

/*刷新数据列表*/
function CallBack1(dgid) {
    $(dgid).datagrid('reload');
}
/*保存记录*/
function doSave1(dlgid, fmid, url, dgid, bnid) {
    var bnname = '确定';
    if (bnid) {
        $('#' + bnid).linkbutton('disable');
        bnname = $('#' + bnid + ' span[class=l-btn-text]').html();
        $('#' + bnid + ' span[class=l-btn-text]').html('正在执行,请稍后...')
    }
    $(fmid).form('submit', {
        url: url,
        onSubmit: function () {
            return $(this).form('validate');
        },
        success: function (result) {
            if (result == "保存成功!") {
                $(dlgid).dialog('close');
                //$.messager.alert("提示", result);
                CallBack1(dgid);//重载记录  
            }
            else {
                $.messager.alert("提示", result);
            }
            if (bnid) {
                $('#' + bnid + ' span[class=l-btn-text]').html(bnname)
                $('#' + bnid).linkbutton('enable');
            }
        }
    });
}
/*删除记录*/
function doDelete1(url, ids, dgid) {
    if (ids.length != 0) {
        $.messager.confirm('提示', '确认要删除所选记录吗？', function (r) {
            if (r) {
                $.post(url, { ids: ids }, function (result) {
                    if (result == "删除成功!") {
                        //$.messager.alert("提示", result);
                        CallBack1(dgid);//重载记录 
                    } else {
                        $.messager.alert("提示", result);
                    }
                });
            }
        });
    }
    else {
        $.messager.alert("提示", "请选择一条或多条记录！", "warning");
    }
}

/*审核记录*/
function doAffirm1(url, ids, dgid) {
    if (ids.length != 0) {
        $.messager.confirm('提示', '确认要审核所选记录吗？', function (r) {
            if (r) {
                $.post(url, { ids: ids }, function (result) {
                    if (result == "审核成功!") {
                        //$.messager.alert("提示", result);
                        CallBack1(dgid);//重载记录 
                    } else {
                        $.messager.alert("提示", result);
                    }
                });
            }
        });
    }
    else {
        $.messager.alert("提示", "请选择一条或多条记录！", "warning");
    }
}
/*撤销审核记录*/
function doAffirm2(url, ids, dgid) {
    if (ids.length != 0) {
        $.messager.confirm('提示', '确认要撤销审核所选记录吗？', function (r) {
            if (r) {
                $.post(url, { ids: ids }, function (result) {
                    if (result == "撤销审核成功!") {
                        //$.messager.alert("提示", result);
                        CallBack1(dgid);//重载记录 
                    } else {
                        $.messager.alert("提示", result);
                    }
                });
            }
        });
    }
    else {
        $.messager.alert("提示", "请选择一条或多条记录！", "warning");
    }
}
/*加载默认值,打开编辑窗口:新增*/
function loadData1(dlgid, fmid, data, title) {
    $(fmid).form('clear');//清空from
    var title1 = "新建";
    if (title) {
        title1 = title;
    }
    if (data) {
        $(fmid).form('load', data);
    }
    $(dlgid).dialog('open').dialog('setTitle', title1).dialog('center');
}
/*加载实体,打开编辑窗口:修改*/
function loadData2(dlgid, fmid, getmodel_url, id, title) {
    $(fmid).form('clear');//清空from
    var title1 = '修改[' + id + ']';
    if (title) {
        title1 = title;
    }   
    if (getmodel_url && id != "") {
        if (!power_modify) { //如果角色权限没有勾选编辑权限这里就为false
            //$.messager.alert("提示", "你没有编辑权限！", "warning");
            return;
        }
        //$.getJSON(getmodel_url, { id: id }, function (data) {
        //    if (data) {
        //        $(fmid).form('load', data);
        //    }
        //});
        //解决getJSON缓存问题      
        $.ajax({
            type: 'get',
            url: getmodel_url,
            data: { 'id': id },
            dataType: 'json',
            cache: false,//不去缓存中取数据，强制去后台取数据
            success: function (data) {
                if (data) {
                    $(fmid).form('load', data);
                }
            }
        });
    }
    else {
        $.messager.alert("提示", "请选择一条记录！", "warning");
        return;
    }
    $(dlgid).dialog('open').dialog('setTitle', title1).dialog('center');
}
/*datagird数据绑定调整*/
function fitDatagirdBind(dgid, data_none, field, colspan, ck) {
    $(dgid).datagrid({
        onLoadSuccess: function (data) {
            if (data.total == 0) {
                $(this).datagrid('appendRow', data_none);
                $(this).datagrid('mergeCells', { index: 0, field: field, colspan: colspan });
                if (ck) {
                    $(this).datagrid('hideColumn', ck);
                }
                $(this).closest('div.datagrid-wrap').find('div.datagrid-pager').hide();
            }
            else {
                if (ck) {
                    $(this).datagrid('showColumn', ck);
                }
                $(this).closest('div.datagrid-wrap').find('div.datagrid-pager').show();
            }
        },
    });
}

/*joson返回数据库的时间格式为/Date(...),转换函数*/
function ChangeDateFormat(val) {
    if (val != null) {
        var date = new Date(parseInt(val.replace("/Date(", "").replace(")/", ""), 10)); //月份为0-11，所以+1，月份小于10时补个0 
        var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
        var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
        return date.getFullYear() + "-" + month + "-" + currentDate;
    }
    return "";
}

//鼠标悬停效果
function overformater(value, row, index) {
    return '<span title=' + value + '>' + value + '</span>';
}



String.prototype.PadLeft = function (totalWidth, paddingChar) {

    if (paddingChar != null) {

        return this.PadHelper(totalWidth, paddingChar, false);

    } else {

        return this.PadHelper(totalWidth, ' ', false);

    }

}

String.prototype.PadRight = function (totalWidth, paddingChar) {

    if (paddingChar != null) {

        return this.PadHelper(totalWidth, paddingChar, true);

    } else {

        return this.PadHelper(totalWidth, ' ', true);

    }



}

String.prototype.PadHelper = function (totalWidth, paddingChar, isRightPadded) {


    if (this.length < totalWidth) {

        var paddingString = new String();

        for (i = 1; i <= (totalWidth - this.length) ; i++) {

            paddingString += paddingChar;

        }



        if (isRightPadded) {

            return (this + paddingString);

        } else {

            return (paddingString + this);

        }

    } else {

        return this;

    }

}




//---------------------其他辅助JS脚本------------------------------------------//



function ReadOnlyTrue(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25) {
    $(A1).textbox({ readonly: true });
    $(A2).textbox({ readonly: true });
    $(A3).textbox({ readonly: true });
    $(A4).textbox({ readonly: true });
    $(A5).textbox({ readonly: true });
    $(A6).textbox({ readonly: true });
    $(A7).textbox({ readonly: true });
    $(A8).textbox({ readonly: true });
    $(A9).textbox({ readonly: true });
    $(A10).textbox({ readonly: true });
    $(A11).textbox({ readonly: true });
    $(A12).textbox({ readonly: true });
    $(A13).textbox({ readonly: true });
    $(A14).textbox({ readonly: true });
    $(A15).textbox({ readonly: true });
    $(A16).textbox({ readonly: true });
    $(A17).textbox({ readonly: true });
    $(A18).textbox({ readonly: true });
    $(A19).textbox({ readonly: true });
    $(A20).textbox({ readonly: true });
    $(A21).textbox({ readonly: true });
    $(A22).textbox({ readonly: true });
    $(A23).textbox({ readonly: true });
    $(A24).textbox({ readonly: true });
    $(A25).textbox({ readonly: true });

};
function ReadOnlyFalse(A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25) {
    $(A1).textbox({ readonly: false });
    $(A2).textbox({ readonly: false });
    $(A3).textbox({ readonly: false });
    $(A4).textbox({ readonly: false });
    $(A5).textbox({ readonly: false });
    $(A6).textbox({ readonly: false });
    $(A7).textbox({ readonly: false });
    $(A8).textbox({ readonly: false });
    $(A9).textbox({ readonly: false });
    $(A10).textbox({ readonly: false });
    $(A11).textbox({ readonly: false });
    $(A12).textbox({ readonly: false });
    $(A13).textbox({ readonly: false });
    $(A14).textbox({ readonly: false });
    $(A15).textbox({ readonly: false });
    $(A16).textbox({ readonly: false });
    $(A17).textbox({ readonly: false });
    $(A18).textbox({ readonly: false });
    $(A19).textbox({ readonly: false });
    $(A20).textbox({ readonly: false });
    $(A21).textbox({ readonly: false });
    $(A22).textbox({ readonly: false });
    $(A23).textbox({ readonly: false });
    $(A24).textbox({ readonly: false });
    $(A25).textbox({ readonly: false });

};

//重写datagrid
var myview = $.extend({}, $.fn.datagrid.defaults.view, {
    renderFooter: function (target, container, frozen) {
        var opts = $.data(target, 'datagrid').options;
        var rows = $.data(target, 'datagrid').footer || [];
        var fields = $(target).datagrid('getColumnFields', frozen);
        var table = ['<table class="datagrid-ftable" cellspacing="0" cellpadding="0" border="0"><tbody>'];

        for (var i = 0; i < rows.length; i++) {
            var styleValue = opts.rowStyler ? opts.rowStyler.call(target, i, rows[i]) : '';
            var style = styleValue ? 'style="' + styleValue + '"' : '';
            table.push('<tr class="datagrid-row" datagrid-row-index="' + i + '"' + style + '>');
            table.push(this.renderRow.call(this, target, fields, frozen, i, rows[i]));
            table.push('</tr>');
        }
        table.push('</tbody></table>');
        $(container).html(table.join(''));
    }
});



//格式化单元格提示信息  
function formatCellTooltip(value) {
    return "<span title='" + value + "'>" + value + "</span>";
}


//日期的扩展方法，调用格式：date.format（时间格式）eg:
Date.prototype.format = function (format) {
    if (isNaN(this.getMonth())) {
        return '';
    }
    if (!format) {
        format = "yyyy-MM-dd hh:mm:ss";
    }
    var o = {
        /* month */
        "M+": this.getMonth() + 1,
        /* day */
        "d+": this.getDate(),
        /* hour */
        "h+": this.getHours(),
        /* minute */
        "m+": this.getMinutes(),
        /* second */
        "s+": this.getSeconds(),
        /* quarter */
        "q+": Math.floor((this.getMonth() + 3) / 3),
        /* millisecond */
        "s": this.getMilliseconds()
    };
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};


$.extend($.fn.textbox.defaults.rules, {
    number: {
        validator: function (value, param) {
            return /^[0-9]*$/.test(value);
        },
        message: "请输入数字"
    },
    intOrFloat: {// 验证整数或小数
        validator: function (value) {
            return /^\d+(\.\d+)?$/i.test(value);
        },
        message: '请输入数字，并确保格式正确'
    },
    chinese: {
        validator: function (value, param) {
            var reg = /^[\u4e00-\u9fa5]+$/i;
            return reg.test(value);
        },
        message: "请输入中文"
    },
    checkLength: {
        validator: function (value, param) {
            return param[0] >= get_length(value);
        },
        message: '请输入最大{0}位字符'
    },
    specialCharacter: {
        validator: function (value, param) {
            var reg = new RegExp("[`~!@#$^&*()=|{}':;'\\[\\]<>~！@#￥……&*（）——|{}【】‘；：”“'、？]");
            return !reg.test(value);
        },
        message: '不允许输入特殊字符'
    },
    englishLowerCase: {// 验证英语小写  
        validator: function (value) {
            return /^[a-z]+$/.test(value);
        },
        message: '请输入小写字母'
    }

    //---------------------其他JS脚本------------------------------------------//
});
