package databinding;

public class Guests {
	private int adults, children, babies, is_repeated_guest, previous_cancellations,previous_bookings_not_canceled;
	private String country, deposit_type;

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public int getBabies() {
		return babies;
	}

	public void setBabies(int babies) {
		this.babies = babies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIs_repeated_guest() {
		return is_repeated_guest;
	}

	public void setIs_repeated_guest(int is_repeated_guest) {
		this.is_repeated_guest = is_repeated_guest;
	}

	public int getPrevious_cancellations() {
		return previous_cancellations;
	}

	public void setPrevious_cancellations(int previous_cancellations) {
		this.previous_cancellations = previous_cancellations;
	}

	public int getPrevious_bookings_not_canceled() {
		return previous_bookings_not_canceled;
	}

	public void setPrevious_bookings_not_canceled(int previous_bookings_not_canceled) {
		this.previous_bookings_not_canceled = previous_bookings_not_canceled;
	}

	public String getDeposit_type() {
		return deposit_type;
	}

	public void setDeposit_type(String deposit_type) {
		this.deposit_type = deposit_type;
	}
	
	

}
