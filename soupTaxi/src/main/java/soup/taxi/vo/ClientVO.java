package soup.taxi.vo;

public class ClientVO {

	private String userid;
	private String userpw;
	private String username;
	private int cellnumber;
	
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
	public int getCellnumber() {
		return cellnumber;
	}
	public void setCellnumber(int cellnumber) {
		this.cellnumber = cellnumber;
	}
	@Override
	public String toString() {
		return "ClientVO [userid=" + userid + ", userpw=" + userpw
				+ ", username=" + username + ", cellnumber=" + cellnumber + "]";
	}
	
}
