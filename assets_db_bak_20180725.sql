/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - asset
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`asset` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `asset`;

/*Table structure for table `asset_incom` */

DROP TABLE IF EXISTS `asset_incom`;

CREATE TABLE `asset_incom` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `json_data` text,
  `daily_incom` decimal(18,2) DEFAULT NULL,
  `daily_pay` decimal(18,2) DEFAULT NULL,
  `non_daily_incom` decimal(18,2) DEFAULT NULL,
  `non_daily_pay` decimal(18,2) DEFAULT NULL,
  `add_profit` decimal(18,2) DEFAULT NULL,
  `tag_status` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_11` (`psn_code`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_incom` */

/*Table structure for table `asset_out` */

DROP TABLE IF EXISTS `asset_out`;

CREATE TABLE `asset_out` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `json_data` text,
  `original_capital` decimal(18,2) DEFAULT NULL,
  `income_surplus` decimal(18,2) DEFAULT NULL,
  `ratained_profit` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_12` (`psn_code`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `asset_out` */

/*Table structure for table `const_category` */

DROP TABLE IF EXISTS `const_category`;

CREATE TABLE `const_category` (
  `category` varchar(10) NOT NULL COMMENT '类型编码',
  `cdescription` varchar(50) NOT NULL COMMENT '中文名称',
  `edescription` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `query_sql` varchar(2000) DEFAULT NULL COMMENT '特殊情况下数据来源于动态的sql语句，则在此编写数据来源规则',
  PRIMARY KEY (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `const_category` */

/*Table structure for table `const_dictionary` */

DROP TABLE IF EXISTS `const_dictionary`;

CREATE TABLE `const_dictionary` (
  `category` varchar(30) NOT NULL COMMENT '代码种类',
  `cost_code` varchar(30) NOT NULL COMMENT '代码值',
  `en_us_caption` varchar(200) DEFAULT NULL COMMENT '英文描述',
  `zh_tw_caption` varchar(200) DEFAULT NULL COMMENT '繁体中文描述',
  `zh_cn_caption` varchar(200) DEFAULT NULL COMMENT '简体中文描述',
  `seq_no` decimal(38,0) DEFAULT NULL COMMENT '排序使用，优先级为本字段，其次为code字段',
  `level_no` varchar(10) DEFAULT NULL COMMENT '等级，职称需用',
  `const_type` varchar(6) DEFAULT NULL COMMENT '判断属性类型',
  PRIMARY KEY (`category`,`cost_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `const_dictionary` */

/*Table structure for table `currency_fund` */

DROP TABLE IF EXISTS `currency_fund`;

CREATE TABLE `currency_fund` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `opening_balance` decimal(18,2) DEFAULT NULL,
  `period_incom` decimal(18,2) DEFAULT NULL,
  `period_pay` decimal(18,2) DEFAULT NULL,
  `ending_balance` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_9` (`psn_code`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `currency_fund` */

/*Table structure for table `fixed_asset` */

DROP TABLE IF EXISTS `fixed_asset`;

CREATE TABLE `fixed_asset` (
  `id` int(11) NOT NULL,
  `current_month_date` date DEFAULT NULL,
  `asset_name` varchar(200) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `asset_money` decimal(18,2) DEFAULT NULL,
  `asset_remark` text,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`,`asset_name`),
  KEY `FK_Reference_5` (`psn_code`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fixed_asset` */

/*Table structure for table `fund_change` */

DROP TABLE IF EXISTS `fund_change`;

CREATE TABLE `fund_change` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `consume_date` date DEFAULT NULL,
  `item` varchar(500) DEFAULT NULL,
  `money` decimal(18,2) DEFAULT NULL,
  `profit_loss_sort` varchar(100) DEFAULT NULL,
  `pay_mode` varchar(100) DEFAULT NULL,
  `pay_money` decimal(18,2) DEFAULT NULL,
  `incom_mode` varchar(100) DEFAULT NULL,
  `incom_money` decimal(18,2) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_10` (`psn_code`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fund_change` */

/*Table structure for table `invest_bank` */

DROP TABLE IF EXISTS `invest_bank`;

CREATE TABLE `invest_bank` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `invest_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `invest_name` varchar(200) DEFAULT NULL,
  `invest_date` date DEFAULT NULL,
  `invest_type` varchar(20) DEFAULT NULL,
  `invest_money` decimal(18,2) DEFAULT NULL,
  `invest_profit` decimal(18,2) DEFAULT NULL,
  `invest_profit_date` date DEFAULT NULL,
  `annualized_rate_return` varchar(50) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_4` (`psn_code`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invest_bank` */

/*Table structure for table `pay_collection` */

DROP TABLE IF EXISTS `pay_collection`;

CREATE TABLE `pay_collection` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `receipt_item` varchar(500) DEFAULT NULL,
  `receipt_date` date DEFAULT NULL,
  `person` varchar(200) DEFAULT NULL,
  `receipt_pay` decimal(18,2) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_6` (`psn_code`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pay_collection` */

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `psn_code` int(11) NOT NULL,
  `cname` varchar(100) DEFAULT NULL,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `title_no` varchar(100) DEFAULT NULL,
  `org_code` decimal(18,0) DEFAULT NULL,
  `org_ename` varchar(300) DEFAULT NULL,
  `org_cname` varchar(600) DEFAULT NULL,
  `pos_in_org` varchar(2000) DEFAULT NULL,
  `dept` varchar(200) DEFAULT NULL,
  `eaddress` varchar(1000) DEFAULT NULL,
  `caddress` varchar(1000) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `fax` varchar(100) DEFAULT NULL,
  `email` varchar(300) DEFAULT NULL,
  `http` varchar(400) DEFAULT NULL,
  `highest_degree` varchar(400) DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `person` */

/*Table structure for table `personal_loan` */

DROP TABLE IF EXISTS `personal_loan`;

CREATE TABLE `personal_loan` (
  `id` int(11) NOT NULL,
  `psn_code` int(11) DEFAULT NULL,
  `current_month_date` date DEFAULT NULL,
  `lend_person` varchar(100) DEFAULT NULL,
  `lend_date` date DEFAULT NULL,
  `lend_money` decimal(18,2) DEFAULT NULL,
  `accumulate_profit` decimal(18,2) DEFAULT NULL,
  `going` varchar(500) DEFAULT NULL,
  `remark` text,
  `create_date` datetime DEFAULT NULL,
  `tag_status` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_7` (`psn_code`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`psn_code`) REFERENCES `person` (`psn_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `personal_loan` */

/*Table structure for table `sys_authoritie` */

DROP TABLE IF EXISTS `sys_authoritie`;

CREATE TABLE `sys_authoritie` (
  `AUTHORITY_ID` decimal(8,0) NOT NULL COMMENT '自动序列',
  `NAME` varchar(400) DEFAULT NULL COMMENT '权限代码名',
  `DISPLAY_NAME` varchar(400) DEFAULT NULL COMMENT '权限描述',
  `PARENT_ID` decimal(8,0) DEFAULT NULL COMMENT ' 上级id',
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

/*Data for the table `sys_authoritie` */

/*Table structure for table `sys_log` */

DROP TABLE IF EXISTS `sys_log`;

CREATE TABLE `sys_log` (
  `log_code` decimal(18,0) NOT NULL,
  `psn_code` decimal(18,0) DEFAULT NULL,
  `log_type` varchar(40) DEFAULT NULL,
  `key_code` varchar(200) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `log_action` varchar(2000) DEFAULT NULL,
  `log_detail` text,
  `client_ip` varchar(30) DEFAULT NULL,
  `server_ip` varchar(300) DEFAULT NULL,
  `exception` text,
  `user_agent` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`log_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_log` */

/*Table structure for table `sys_resource` */

DROP TABLE IF EXISTS `sys_resource`;

CREATE TABLE `sys_resource` (
  `RESOURCE_ID` decimal(18,0) NOT NULL COMMENT '主键',
  `RESOURCE_TYPE` varchar(20) NOT NULL COMMENT '菜单、还是页面menu、url',
  `VALUE` varchar(255) DEFAULT NULL COMMENT 'URL',
  `ORDER_NUM` decimal(4,0) DEFAULT NULL COMMENT '顺序(权限控制按顺序匹配URL)',
  `PARENT_ID` decimal(18,0) DEFAULT NULL COMMENT '父菜单',
  `TARGET` varchar(20) DEFAULT NULL COMMENT '显示窗名称(mainFrame , _blank,_parent)',
  `ZH_CN_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，简体中文',
  `STATUS` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '是否启用状态',
  `LAVELS` decimal(1,0) DEFAULT '0' COMMENT '层次，用于菜单等级',
  `REMARK` varchar(400) DEFAULT NULL COMMENT '备注',
  `IMG_URL` varchar(50) DEFAULT NULL COMMENT '快捷菜单图片的url',
  `TOTAL_SQL` varchar(4000) DEFAULT NULL COMMENT '快捷菜单图片上的统计数',
  `NAV_IMG_URL` varchar(200) DEFAULT NULL COMMENT 'Nav 菜单图片的url',
  `NAV_ENABLED` decimal(1,0) DEFAULT '0' COMMENT 'Nav enable',
  `OLD_TOTAL_SQL` varchar(4000) DEFAULT NULL COMMENT '快捷菜单图片上的统计数(查询老系统)',
  `ZH_TW_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，中文繁体',
  `EN_US_NAME` varchar(200) DEFAULT NULL COMMENT '菜单名，英文',
  `FLAG_LAN` char(2) DEFAULT '01' COMMENT '内网标示 (01：外网，10：内网，11：内外网)',
  `STMS_MENU_ID` decimal(38,0) DEFAULT NULL COMMENT '关联stms系统sys_menu.menu_id',
  `CLASS_NAME` varchar(50) DEFAULT NULL COMMENT '快捷通道的class名字',
  PRIMARY KEY (`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='web资源表';

/*Data for the table `sys_resource` */

insert  into `sys_resource`(`RESOURCE_ID`,`RESOURCE_TYPE`,`VALUE`,`ORDER_NUM`,`PARENT_ID`,`TARGET`,`ZH_CN_NAME`,`STATUS`,`LAVELS`,`REMARK`,`IMG_URL`,`TOTAL_SQL`,`NAV_IMG_URL`,`NAV_ENABLED`,`OLD_TOTAL_SQL`,`ZH_TW_NAME`,`EN_US_NAME`,`FLAG_LAN`,`STMS_MENU_ID`,`CLASS_NAME`) values ('1000','sysmenu','/assets/menulist',NULL,'0',NULL,'菜单管理','1','0','菜单管理',NULL,NULL,NULL,'0',NULL,NULL,NULL,'01',NULL,NULL),('1010','sysmenu','/assets/userlist',NULL,'0',NULL,'用户管理','1','0','用户管理',NULL,NULL,NULL,'0',NULL,NULL,NULL,'01',NULL,NULL),('1011','sysmenu','/assets/constCategory',NULL,'0',NULL,'数据字典类别','0',NULL,'数字字典类别',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),('1012','sysmenu','/assets/constDictionary',NULL,'0',NULL,'数据字典信息','1',NULL,'数据字典，存储一些基本数据信息',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `sys_resource_authoritie` */

DROP TABLE IF EXISTS `sys_resource_authoritie`;

CREATE TABLE `sys_resource_authoritie` (
  `AUTHORITY_ID` decimal(9,0) NOT NULL COMMENT '权限表主键',
  `RESOURCE_ID` decimal(9,0) NOT NULL COMMENT '资源表主键',
  PRIMARY KEY (`AUTHORITY_ID`,`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源功能集关联表';

/*Data for the table `sys_resource_authoritie` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色标识',
  `NAME` varchar(120) DEFAULT NULL COMMENT '角色名称',
  `PARENT_ID` decimal(3,0) DEFAULT NULL COMMENT '父角色标识',
  `DESCRIPTION` varchar(200) DEFAULT NULL COMMENT '简要描述角色',
  `STATE` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '描述角色状态：0无效  1有效',
  `TYPE` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '角色类型 , 1授予 ，2下发 ，3授予下发',
  `MANAGE_ROLES` varchar(400) DEFAULT NULL COMMENT '管理的角色，角色ID之间以逗号分隔',
  `CLASS_NAME` varchar(400) DEFAULT 'reg_peo' COMMENT '角色样式图标',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色数据表';

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_authoritie` */

DROP TABLE IF EXISTS `sys_role_authoritie`;

CREATE TABLE `sys_role_authoritie` (
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色ID',
  `AUTHORITY_ID` decimal(8,0) NOT NULL COMMENT '资源集ID',
  `TYPE` decimal(1,0) NOT NULL DEFAULT '0' COMMENT '类型',
  PRIMARY KEY (`ROLE_ID`,`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

/*Data for the table `sys_role_authoritie` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `USERID` decimal(18,0) NOT NULL COMMENT '关键字，同psn_code',
  `LOGIN_NAME` varchar(400) NOT NULL COMMENT '登录名',
  `PASSWORD` varchar(300) NOT NULL COMMENT '密码',
  `ENABLED` decimal(1,0) NOT NULL DEFAULT '1' COMMENT '帐号状态 0 禁用,1正常,2-删除用户',
  `TOKEN_CHANGED` decimal(1,0) DEFAULT '0' COMMENT '标记是否已确认忘记密码邮件 0-未做忘记密码操作 1-未确认邮件  2-已确认邮件',
  `NODE_ID` decimal(2,0) NOT NULL DEFAULT '1' COMMENT '用户数据存储区域位置（未使用）',
  `EMAIL` varchar(400) DEFAULT NULL COMMENT '首选通信邮件地址(默认同登录名)',
  `MOBILE` decimal(30,0) DEFAULT NULL COMMENT '手机号码登录',
  `UKEYSN` varchar(80) DEFAULT NULL COMMENT 'ukey序列号',
  `UKEYPWD` varchar(128) DEFAULT NULL COMMENT 'ukey的pin密码,与用户表密码一致',
  `ISUKEY` char(1) DEFAULT NULL COMMENT '是否对此用户启用(1启用 ,null 不启用,启用的在外网不能登陆)',
  `ISINTERNAL` char(1) DEFAULT NULL COMMENT '是否基金委内用户(1是 ,0不是，是基金委用户的，不允许在外网登录)',
  `PLAIN_PWD` varchar(128) DEFAULT NULL COMMENT '不知道',
  `ADD_USER_ID` decimal(18,0) DEFAULT NULL COMMENT '邀请专家,添加人id',
  `AUTH_LOGIN_IP` varchar(200) DEFAULT NULL COMMENT '登录的ip范围控制',
  `LAST_ACCESS_IP` varchar(100) DEFAULT NULL COMMENT '最后一次登录的ip地址',
  `LOCALE` varchar(10) DEFAULT NULL COMMENT '不知道',
  `PASSWORD_UPDATE_TIME` date DEFAULT NULL COMMENT '密码更新时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='能够登录的 人员信息表';

/*Data for the table `sys_user` */

insert  into `sys_user`(`USERID`,`LOGIN_NAME`,`PASSWORD`,`ENABLED`,`TOKEN_CHANGED`,`NODE_ID`,`EMAIL`,`MOBILE`,`UKEYSN`,`UKEYPWD`,`ISUKEY`,`ISINTERNAL`,`PLAIN_PWD`,`ADD_USER_ID`,`AUTH_LOGIN_IP`,`LAST_ACCESS_IP`,`LOCALE`,`PASSWORD_UPDATE_TIME`,`LAST_LOGIN_TIME`) values ('1','sa','202cb962ac59075b964b07152d234b70','1','0','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `USER_ID` decimal(18,0) NOT NULL COMMENT '用户ID',
  `ROLE_ID` decimal(3,0) NOT NULL COMMENT '角色ID',
  `INS_ID` decimal(9,0) NOT NULL DEFAULT '0' COMMENT '单位ID',
  PRIMARY KEY (`USER_ID`,`ROLE_ID`,`INS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

/*Data for the table `sys_user_role` */

/*Table structure for table `user_const_dic` */

DROP TABLE IF EXISTS `user_const_dic`;

CREATE TABLE `user_const_dic` (
  `category` varchar(30) DEFAULT NULL,
  `psn_code` decimal(18,0) DEFAULT NULL,
  `cost_code` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_const_dic` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
