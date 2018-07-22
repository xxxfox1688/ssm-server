package com.ssmweb.common.menu.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Menu {

	private int id;
	private int cd_dj;
	private int sjcd_id;
	private String menu_name;
	private String menu_jc;
	private String menu_url;
	private String yx_bz;
	private String xy_bz;
	private String czy_dm;
	private Date cz_sj;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_url() {
		return menu_url;
	}
	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
	public String getYx_bz() {
		return yx_bz;
	}
	public void setYx_bz(String yx_bz) {
		this.yx_bz = yx_bz;
	}
	public String getXy_bz() {
		return xy_bz;
	}
	public void setXy_bz(String xy_bz) {
		this.xy_bz = xy_bz;
	}
	public String getCzy_dm() {
		return czy_dm;
	}
	public void setCzy_dm(String czy_dm) {
		this.czy_dm = czy_dm;
	}
	public Date getCz_sj() {
		return cz_sj;
	}
	public void setCz_sj(Date cz_sj) {
		this.cz_sj = cz_sj;
	}
	public int getCd_dj() {
		return cd_dj;
	}
	public void setCd_dj(int cd_dj) {
		this.cd_dj = cd_dj;
	}
	public int getSjcd_id() {
		return sjcd_id;
	}
	public void setSjcd_id(int sjcd_id) {
		this.sjcd_id = sjcd_id;
	}
	public String getMenu_jc() {
		return menu_jc;
	}
	public void setMenu_jc(String menu_jc) {
		this.menu_jc = menu_jc;
	}
	
	
}
