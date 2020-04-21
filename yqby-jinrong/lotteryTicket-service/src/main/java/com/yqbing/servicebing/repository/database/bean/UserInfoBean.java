package com.yqbing.servicebing.repository.database.bean;

import java.util.Date;

public class UserInfoBean {
    private Long id;
  
    private String openId;
    
    private String token;

    private String name;

    private String phone;

    private String adress;

    private Integer ral;

    private Short sex;

    private Integer age;

    private String image;

    private String type;

    private String password;

    private String brith;

    private String firstInviteCode;

    private String firstStoreName;

    private Integer firstStoreId;

    private Integer firstStoreUserId;

    private Long storeId;

    private String storeName;

    private Integer storeUserId;

    private String inviteCode;

    private String provinceName;

    private Integer provinceId;

    private String cityName;

    private Integer cityId;

    private String areaName;

    private Integer areaId;

    private String pushKey;

    private String device;

    private Integer getWealth;

    private Integer wealth;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Integer getRal() {
        return ral;
    }

    public void setRal(Integer ral) {
        this.ral = ral;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPassword() {
    	if(password == null){
    		password = "";
    	} 
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith == null ? null : brith.trim();
    }

    public String getFirstInviteCode() {
        return firstInviteCode;
    }

    public void setFirstInviteCode(String firstInviteCode) {
        this.firstInviteCode = firstInviteCode == null ? null : firstInviteCode.trim();
    }

    public String getFirstStoreName() {
        return firstStoreName;
    }

    public void setFirstStoreName(String firstStoreName) {
        this.firstStoreName = firstStoreName == null ? null : firstStoreName.trim();
    }

    public Integer getFirstStoreId() {
        return firstStoreId;
    }

    public void setFirstStoreId(Integer firstStoreId) {
        this.firstStoreId = firstStoreId;
    }

    public Integer getFirstStoreUserId() {
        return firstStoreUserId;
    }

    public void setFirstStoreUserId(Integer firstStoreUserId) {
        this.firstStoreUserId = firstStoreUserId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getStoreUserId() {
        return storeUserId;
    }

    public void setStoreUserId(Integer storeUserId) {
        this.storeUserId = storeUserId;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getPushKey() {
        return pushKey;
    }

    public void setPushKey(String pushKey) {
        this.pushKey = pushKey == null ? null : pushKey.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Integer getGetWealth() {
        return getWealth;
    }

    public void setGetWealth(Integer getWealth) {
        this.getWealth = getWealth;
    }

    public Integer getWealth() {
        return wealth;
    }

    public void setWealth(Integer wealth) {
        this.wealth = wealth;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
}