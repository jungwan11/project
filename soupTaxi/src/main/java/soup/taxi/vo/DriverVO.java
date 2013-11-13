package soup.taxi.vo;

public class DriverVO {

	private String driverid;
	private String driverpw;
	private String drivername;
	private String taxinumber;
	private int cellnumber;
	private String except;
	private boolean mov;
	
	public String getDriverid() {
		return driverid;
	}
	public void setDriverid(String driverid) {
		this.driverid = driverid;
	}
	public String getDriverpw() {
		return driverpw;
	}
	public void setDriverpw(String driverpw) {
		this.driverpw = driverpw;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getTaxinumber() {
		return taxinumber;
	}
	public void setTaxinumber(String taxinumber) {
		this.taxinumber = taxinumber;
	}
	public int getCellnumber() {
		return cellnumber;
	}
	public void setCellnumber(int cellnumber) {
		this.cellnumber = cellnumber;
	}
	public String getExcept() {
		return except;
	}
	public void setExcept(String except) {
		this.except = except;
	}
	public boolean isMov() {
		return mov;
	}
	public void setMov(boolean mov) {
		this.mov = mov;
	}
	@Override
	public String toString() {
		return "DriverVO [driverid=" + driverid + ", driverpw=" + driverpw
				+ ", drivername=" + drivername + ", taxinumber=" + taxinumber + ", cellnumber=" + cellnumber
				+ ", except=" + except + ", mov=" + mov + "]";
	}
	


}
