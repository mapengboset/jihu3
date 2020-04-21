package com.yqbing.servicebing.repository.database.bean;

public class NotifyLogWithBLOBs extends NotifyLog {
    private String notifyMsg;

    private String receiveMsg;

    public String getNotifyMsg() {
        return notifyMsg;
    }

    public void setNotifyMsg(String notifyMsg) {
        this.notifyMsg = notifyMsg == null ? null : notifyMsg.trim();
    }

    public String getReceiveMsg() {
        return receiveMsg;
    }

    public void setReceiveMsg(String receiveMsg) {
        this.receiveMsg = receiveMsg == null ? null : receiveMsg.trim();
    }
}