package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class TicketGoodsLuckdrawExt {
    private Integer id;

    private Integer goodsId;

    private Double ratio;

    private Integer number;

    private Integer seat;

    private Date createTime;

    private Date updateTime;

    private String goodsicon;
    private String goodsName;
    
  
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public String getGoodsicon() {
		return goodsicon;
	}

	public void setGoodsicon(String goodsicon) {
		this.goodsicon = goodsicon;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
    
}