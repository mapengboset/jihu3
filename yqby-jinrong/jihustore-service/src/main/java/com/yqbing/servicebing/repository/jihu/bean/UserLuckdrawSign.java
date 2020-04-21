package com.yqbing.servicebing.repository.jihu.bean;

import java.util.Date;

public class UserLuckdrawSign {
    private Integer id;

    private Integer userId;

    private Date signInTime;

    private String signDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }

    public String getSignDay() {
        return signDay;
    }

    public void setSignDay(String signDay) {
        this.signDay = signDay == null ? null : signDay.trim();
    }
}