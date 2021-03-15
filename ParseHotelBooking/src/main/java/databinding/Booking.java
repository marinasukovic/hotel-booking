package databinding;

public class Booking {
	private String hotel;
	private int is_canceled;
	private int lead_time;
	private Reservation reservation;
	private Guests guests;
	private String meal; //Type of meal booked. Categories are presented in standard hospitality meal packages:
	private String market_segment,distribution_channel;
	private int booking_changes;
	private int agent;
	private int company;
	private int days_in_waiting_list;
	private String customer_type;
	private Double adr;
	private Requests requests;
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getIs_canceled() {
		return is_canceled;
	}
	public void setIs_canceled(int nextRecord) {
		this.is_canceled = nextRecord;
	}
	public int getLead_time() {
		return lead_time;
	}
	public void setLead_time(int lead_time) {
		this.lead_time = lead_time;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Guests getGuests() {
		return guests;
	}
	public void setGuests(Guests guests) {
		this.guests = guests;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getMarket_segment() {
		return market_segment;
	}
	public void setMarket_segment(String market_segment) {
		this.market_segment = market_segment;
	}
	public String getDistribution_channel() {
		return distribution_channel;
	}
	public void setDistribution_channel(String distribution_channel) {
		this.distribution_channel = distribution_channel;
	}
	public int getBooking_changes() {
		return booking_changes;
	}
	public void setBooking_changes(int booking_changes) {
		this.booking_changes = booking_changes;
	}
	public int getAgent() {
		return agent;
	}
	public void setAgent(int agent) {
		this.agent = agent;
	}
	public int getCompany() {
		return company;
	}
	public void setCompany(int company) {
		this.company = company;
	}
	public int getDays_in_waiting_list() {
		return days_in_waiting_list;
	}
	public void setDays_in_waiting_list(int days_in_waiting_list) {
		this.days_in_waiting_list = days_in_waiting_list;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public Double getAdr() {
		return adr;
	}
	public void setAdr(Double adr) {
		this.adr = adr;
	}
	public Requests getRequests() {
		return requests;
	}
	public void setRequests(Requests requests) {
		this.requests = requests;
	}
	
	
}
