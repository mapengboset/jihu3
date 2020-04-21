package com.yqbing.servicebing.webapp.request;

public class StoreInfoReq{
	
	private Long storeId ;
	public String token;
	public String address;
	public String storeName ;
	public String certName;
	public String phone;
	public String storeLicense;
	public String cardFace;
	public Short storeState;//门店状态:-2:锁定;-1;拒绝;1.正常;2.审核中;-11.二次拒绝;22.二次审核中',
	public String level;//级别 2.店员 3.店长
	public String cardBack;
	public Long categoryId;//1.门店-公司（租用） 2.门店-代理（代理）3.门店-自营（门店)
	public String refuseReason;
	public String citys;//地址(省,市,区,省编码,市编码,区编码,详细地址)全部用逗号分隔
	public Byte idCardCheckStatus;//身份证认证状态（0：未认证 1：认证中 2：已认证 3：认证失败)
	public Byte licenseCheckStatus;//营业执照认证状态（0：未认证 1：认证中 2：已认证 3：认证失败）
	public String idcardRefusedReason;//身份证认证状态
	public String licenseRefusedReason;//营业执照认证状态
	public String getToken() {
		if(token == null){
			token = "";
    	} 
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getAddress() {
		
		if(address == null){
			address = "";
    	} 
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStoreName() {
		
		if(storeName == null){
			storeName = "";
    	} 
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCertName() {
		
		if(certName == null){
			certName = "";
    	} 
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getPhone() {
		
		if(phone == null){
			phone = "";
    	} 
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStoreLicense() {
		if(storeLicense == null){
			storeLicense = "";
    	}
		return storeLicense;
	}
	public void setStoreLicense(String storeLicense) {
		this.storeLicense = storeLicense;
	}
	public String getCardFace() {
		if(cardFace == null){
			cardFace = "";
    	}
		
		return cardFace;
	}
	public void setCardFace(String cardFace) {
		this.cardFace = cardFace;
	}
	public String getCardBack() {
		if(cardBack == null){
			cardBack = "";
    	}
		
		return cardBack;
	}
	public void setCardBack(String cardBack) {
		this.cardBack = cardBack;
	}
	public String getCitys() {
		
		if(citys == null){
			citys = "";
    	}
		return citys;
	}
	public void setCitys(String citys) {
		this.citys = citys;
	}
	public Long getStoreId() {
		if(storeId == null){
			storeId = -1L;
    	} 
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getLevel() {
		if(level == null){
			level = "";
    	}
		
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Short getStoreState() {
		
		if(storeState == null){
			storeState = 0;
    	}
		
		return storeState;
	}
	public void setStoreState(Short storeState) {
		this.storeState = storeState;
	}
	public String getRefuseReason() {
		
		if(refuseReason == null){
			refuseReason = "";
    	}
		return refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public Long getCategoryId() {
		
		if(categoryId == null){
			categoryId = 0L;
    	} 
		
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		
		
		
		this.categoryId = categoryId;
	}
	public Byte getIdCardCheckStatus() {
		
		if(idCardCheckStatus == null){
			idCardCheckStatus = 0;
    	} 
		
		return idCardCheckStatus;
	}
	public void setIdCardCheckStatus(Byte idCardCheckStatus) {
		this.idCardCheckStatus = idCardCheckStatus;
	}
	public Byte getLicenseCheckStatus() {
		
		if(licenseCheckStatus == null){
			licenseCheckStatus = 0;
    	} 
		return licenseCheckStatus;
	}
	public void setLicenseCheckStatus(Byte licenseCheckStatus) {
		
		
		
		this.licenseCheckStatus = licenseCheckStatus;
	}
	public String getIdcardRefusedReason() {
		if(idcardRefusedReason == null){
			idcardRefusedReason = "";
    	}
		
		return idcardRefusedReason;
	}
	public void setIdcardRefusedReason(String idcardRefusedReason) {
		
		
		this.idcardRefusedReason = idcardRefusedReason;
	}
	public String getLicenseRefusedReason() {
		
		if(licenseRefusedReason == null){
			licenseRefusedReason = "";
    	}
		return licenseRefusedReason;
	}
	public void setLicenseRefusedReason(String licenseRefusedReason) {
		this.licenseRefusedReason = licenseRefusedReason;
	}
    
	
}
