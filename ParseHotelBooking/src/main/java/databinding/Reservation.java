package databinding;

import java.util.Date;


public class Reservation {
	private int arrival_date_year;
	private String arrival_date_month;
	private int arrival_date_week_number;
	private int arrival_date_day_of_month;
	private int stays_in_weekend_nights;
	private int stays_in_week_nights;
	private String market_segment, reserved_room_type, assigned_room_type;
	private String reservation_status;
	private Date reservation_status_date;
	
	
	public int getArrival_date_year() {
		return arrival_date_year;
	}
	public void setArrival_date_year(int arrival_date_year) {
		this.arrival_date_year = arrival_date_year;
	}
	public String getArrival_date_month() {
		return arrival_date_month;
	}
	public void setArrival_date_month(String arrival_date_month) {
		this.arrival_date_month = arrival_date_month;
	}
	public int getArrival_date_week_number() {
		return arrival_date_week_number;
	}
	public void setArrival_date_week_number(int arrival_date_week_number) {
		this.arrival_date_week_number = arrival_date_week_number;
	}
	public int getArrival_date_day_of_month() {
		return arrival_date_day_of_month;
	}
	public void setArrival_date_day_of_month(int arrival_date_day_of_month) {
		this.arrival_date_day_of_month = arrival_date_day_of_month;
	}
	public int getStays_in_weekend_nights() {
		return stays_in_weekend_nights;
	}
	public void setStays_in_weekend_nights(int stays_in_weekend_nights) {
		this.stays_in_weekend_nights = stays_in_weekend_nights;
	}
	public int getStays_in_week_nights() {
		return stays_in_week_nights;
	}
	public void setStays_in_week_nights(int stays_in_week_nights) {
		this.stays_in_week_nights = stays_in_week_nights;
	}
	public String getMarket_segment() {
		return market_segment;
	}
	public void setMarket_segment(String market_segment) {
		this.market_segment = market_segment;
	}
	public String getReserved_room_type() {
		return reserved_room_type;
	}
	public void setReserved_room_type(String reserved_room_type) {
		this.reserved_room_type = reserved_room_type;
	}
	public String getAssigned_room_type() {
		return assigned_room_type;
	}
	public void setAssigned_room_type(String assigned_room_type) {
		this.assigned_room_type = assigned_room_type;
	}
	public String getReservation_status() {
		return reservation_status;
	}
	public void setReservation_status(String reservation_status) {
		this.reservation_status = reservation_status;
	}
	public Date getReservation_status_date() {
		return reservation_status_date;
	}
	public void setReservation_status_date(Date reservation_status_date) {
		this.reservation_status_date = reservation_status_date;
	}
	
	

}
