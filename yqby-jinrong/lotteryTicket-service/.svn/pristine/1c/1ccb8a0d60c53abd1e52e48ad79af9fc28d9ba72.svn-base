package com.yqbing.servicebing.repository.database.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TicketGoodsWithBLOBs extends TicketGoods {
    private String content;

    private String pictures;

    private Date createTime;

    private  List<TicketGoodsStandard> standards;

    public List<TicketGoodsStandard> getStandards() {
		return standards;
	}

	public void setStandards(List<TicketGoodsStandard> standards) {
		this.standards = standards;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures == null ? null : pictures.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}