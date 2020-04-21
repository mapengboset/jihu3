package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class TUserMessageBean {
    private Integer messageId;

    private Integer userId;

    private String messageTitle;

    private Short messageState;

    private Short messageType;

    private Short messageLink;

    private String messageText;

    private String pushKey;

    private String errorText;

    private String messagePic;

    private Integer createTime;

    private Integer getTime;

    private Date recTime;

    private Byte isnotread;

    private Short back1;

    private Short back2;

    private Integer back3;

    private Integer back4;

    private String back5;

    private String back6;

    private String back7;

    private String back8;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public Short getMessageState() {
        return messageState;
    }

    public void setMessageState(Short messageState) {
        this.messageState = messageState;
    }

    public Short getMessageType() {
        return messageType;
    }

    public void setMessageType(Short messageType) {
        this.messageType = messageType;
    }

    public Short getMessageLink() {
        return messageLink;
    }

    public void setMessageLink(Short messageLink) {
        this.messageLink = messageLink;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
    }

    public String getPushKey() {
        return pushKey;
    }

    public void setPushKey(String pushKey) {
        this.pushKey = pushKey == null ? null : pushKey.trim();
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText == null ? null : errorText.trim();
    }

    public String getMessagePic() {
        return messagePic;
    }

    public void setMessagePic(String messagePic) {
        this.messagePic = messagePic == null ? null : messagePic.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getGetTime() {
        return getTime;
    }

    public void setGetTime(Integer getTime) {
        this.getTime = getTime;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Byte getIsnotread() {
        return isnotread;
    }

    public void setIsnotread(Byte isnotread) {
        this.isnotread = isnotread;
    }

    public Short getBack1() {
        return back1;
    }

    public void setBack1(Short back1) {
        this.back1 = back1;
    }

    public Short getBack2() {
        return back2;
    }

    public void setBack2(Short back2) {
        this.back2 = back2;
    }

    public Integer getBack3() {
        return back3;
    }

    public void setBack3(Integer back3) {
        this.back3 = back3;
    }

    public Integer getBack4() {
        return back4;
    }

    public void setBack4(Integer back4) {
        this.back4 = back4;
    }

    public String getBack5() {
        return back5;
    }

    public void setBack5(String back5) {
        this.back5 = back5 == null ? null : back5.trim();
    }

    public String getBack6() {
        return back6;
    }

    public void setBack6(String back6) {
        this.back6 = back6 == null ? null : back6.trim();
    }

    public String getBack7() {
        return back7;
    }

    public void setBack7(String back7) {
        this.back7 = back7 == null ? null : back7.trim();
    }

    public String getBack8() {
        return back8;
    }

    public void setBack8(String back8) {
        this.back8 = back8 == null ? null : back8.trim();
    }
}