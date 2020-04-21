package com.yqbing.servicebing.repository.database.bean;

public class StoreUserBean extends StoreUserBeanKey {
    private Short userState;

    private Integer createTime;

    private Short back1;

    private Short back2;

    private Integer back3;

    private Integer back4;

    private String back5;

    private String back6;

    private String back7;

    private String back8;

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
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