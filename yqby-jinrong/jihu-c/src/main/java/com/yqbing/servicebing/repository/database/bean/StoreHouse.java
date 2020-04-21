package com.yqbing.servicebing.repository.database.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StoreHouse {
    private Integer id;

    private String appName;

    private String appSize;
    
    private Double appSizeLong;
                                                                                                                                                                                                  
    private String appVersion;

    private String downTimes;

    private String appUrlImg;

    private String appUrl;

    private Short appType;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String appDesc;
    
    
    private String appPack;
    
    private String appDetailsPng;
    
    private Integer isSelf;
    private Short isPay;
    private Integer businessSubType;

    private BigDecimal price;

    private Integer firstBindRate;

    private Integer nowBindRate;

    
    private Integer status;
    private String isExist;
    
    
    public Short getIsPay() {
		return isPay;
	}

	public void setIsPay(Short isPay) {
		this.isPay = isPay;
	}

	public Integer getBusinessSubType() {
		return businessSubType;
	}

	public void setBusinessSubType(Integer businessSubType) {
		this.businessSubType = businessSubType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getFirstBindRate() {
		return firstBindRate;
	}

	public void setFirstBindRate(Integer firstBindRate) {
		this.firstBindRate = firstBindRate;
	}

	public Integer getNowBindRate() {
		return nowBindRate;
	}

	public void setNowBindRate(Integer nowBindRate) {
		this.nowBindRate = nowBindRate;
	}

	public String getIsExist() {
		return isExist;
	}

	public void setIsExist(String isExist) {
		this.isExist = isExist;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsSelf() {
		return isSelf;
	}

	public void setIsSelf(Integer isSelf) {
		this.isSelf = isSelf;
	}

	public Double getAppSizeLong() {
        return appSizeLong;
    }

    public void setAppSizeLong(Double appSizeLong) {
        this.appSizeLong = appSizeLong;
    }
    public String getAppPack() {
		return appPack;
	}

	public void setAppPack(String appPack) {
		this.appPack = appPack;
	}

	

	public String getAppDetailsPng() {
		return appDetailsPng;
	}

	public void setAppDetailsPng(String appDetailsPng) {
		this.appDetailsPng = appDetailsPng;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize == null ? null : appSize.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getDownTimes() {
        return downTimes;
    }

    public void setDownTimes(String downTimes) {
        this.downTimes = downTimes == null ? null : downTimes.trim();
    }

    public String getAppUrlImg() {
        return appUrlImg;
    }

    public void setAppUrlImg(String appUrlImg) {
        this.appUrlImg = appUrlImg == null ? null : appUrlImg.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    public Short getAppType() {
        return appType;
    }

    public void setAppType(Short appType) {
        this.appType = appType;
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

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }
}