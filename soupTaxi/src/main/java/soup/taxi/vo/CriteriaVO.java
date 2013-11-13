package soup.taxi.vo;

public class CriteriaVO {

	private String departure;
	private String destination;
	private int except;
	private String appoint;
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getExcept() {
		return except;
	}
	public void setExcept(int except) {
		this.except = except;
	}
	public String getAppoint() {
		return appoint;
	}
	public void setAppoint(String appoint) {
		this.appoint = appoint;
	}
	@Override
	public String toString() {
		return "CriteriaVO [departure=" + departure + ", destination="
				+ destination + ", except=" + except + ", appoint=" + appoint
				+ "]";
	}
	
	
}
