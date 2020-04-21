package com.yqbing.servicebing.webapp.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.yqbing.servicebing.repository.database.bean.AppBanner;
@ApiModel(value = "游戏")
public class GameTypeRes implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2403699982814210780L;
	

    @ApiModelProperty(value = "热门大图", name = "pic")
	private List<AppBanner> pic;//热门大图
    @ApiModelProperty(value = "所有app", name = "apps")
    private List<GameAppRes> apps;
    @ApiModelProperty(value = "所有ban", name = "types")
    private List<GameType> types;
	
	
	public List<GameAppRes> getApps() {
		return apps;
	}
	public void setApps(List<GameAppRes> apps) {
		this.apps = apps;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFidkey() {
		return fidkey;
	}
	public void setFidkey(String fidkey) {
		this.fidkey = fidkey;
	}*/
	public List<AppBanner> getPic() {
		return pic;
	}
	public void setPic(List<AppBanner> pic) {
		this.pic = pic;
	}
	public List<GameType> getTypes() {
		return types;
	}
	public void setTypes(List<GameType> types) {
		this.types = types;
	}
    
}
