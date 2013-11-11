package soup.taxi.vo;

import java.util.Date;

public class Driver {

	private String userid;
	private String userpw;
	private String username;
	private int phonenumber;
	private Long lat;
	private Long lon;
	private boolean smoke;
	private boolean weak;
	private boolean baby;
	private boolean gender;
	private boolean pack;
	private boolean pet;
	private Date regdate;
	private Date updatedate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Long getLat() {
		return lat;
	}
	public void setLat(Long lat) {
		this.lat = lat;
	}
	public Long getLon() {
		return lon;
	}
	public void setLon(Long lon) {
		this.lon = lon;
	}
	public boolean isSmoke() {
		return smoke;
	}
	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}
	public boolean isWeak() {
		return weak;
	}
	public void setWeak(boolean weak) {
		this.weak = weak;
	}
	public boolean isBaby() {
		return baby;
	}
	public void setBaby(boolean baby) {
		this.baby = baby;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean isPack() {
		return pack;
	}
	public void setPack(boolean pack) {
		this.pack = pack;
	}
	public boolean isPet() {
		return pet;
	}
	public void setPet(boolean pet) {
		this.pet = pet;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
}
