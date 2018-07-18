package com.assets.pojo;

import java.math.BigDecimal;

public class ConstDictionary extends ConstDictionaryKey {
    private String enUsCaption;

    private String zhTwCaption;

    private String zhCnCaption;

    private BigDecimal seqNo;

    private String levelNo;

    private String constType;

    public String getEnUsCaption() {
        return enUsCaption;
    }

    public void setEnUsCaption(String enUsCaption) {
        this.enUsCaption = enUsCaption == null ? null : enUsCaption.trim();
    }

    public String getZhTwCaption() {
        return zhTwCaption;
    }

    public void setZhTwCaption(String zhTwCaption) {
        this.zhTwCaption = zhTwCaption == null ? null : zhTwCaption.trim();
    }

    public String getZhCnCaption() {
        return zhCnCaption;
    }

    public void setZhCnCaption(String zhCnCaption) {
        this.zhCnCaption = zhCnCaption == null ? null : zhCnCaption.trim();
    }

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    public String getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(String levelNo) {
        this.levelNo = levelNo == null ? null : levelNo.trim();
    }

    public String getConstType() {
        return constType;
    }

    public void setConstType(String constType) {
        this.constType = constType == null ? null : constType.trim();
    }
}