package Model;

public class Stadium {
	private String stadiumName;
	private String address;
	private int numOfSeats;

	public Stadium(String stadiumName, String address, int numOfSeats) {
		setStadiumName(stadiumName);
		this.address = address;
		setNumOfSeats(numOfSeats);
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getAddress() {
		return address;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	@Override
	public String toString() {
		return  "stadiumName : " + stadiumName  + ", address : " + address  + ", numOfSeats: " + numOfSeats +'.';
	}
}