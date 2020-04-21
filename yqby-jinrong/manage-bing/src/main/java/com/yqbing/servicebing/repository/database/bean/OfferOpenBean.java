package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class OfferOpenBean {
    private Long id;

    private Byte offerisopen;

    private Date updatetime;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getOfferisopen() {
        return offerisopen;
    }

    public void setOfferisopen(Byte offerisopen) {
        this.offerisopen = offerisopen;
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