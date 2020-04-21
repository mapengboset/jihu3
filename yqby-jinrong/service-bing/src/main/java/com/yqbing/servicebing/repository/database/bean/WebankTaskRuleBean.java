package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class WebankTaskRuleBean {
    private Long id;

    private Byte taskisopen;

    private Integer awardwealth;

    private Date updatetime;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getTaskisopen() {
        return taskisopen;
    }

    public void setTaskisopen(Byte taskisopen) {
        this.taskisopen = taskisopen;
    }

    public Integer getAwardwealth() {
        return awardwealth;
    }

    public void setAwardwealth(Integer awardwealth) {
        this.awardwealth = awardwealth;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}