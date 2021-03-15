package main;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import databinding.Booking;
import databinding.Guests;
import databinding.Requests;
import databinding.Reservation;

public class CreateJson {
	public static void CreateJson() {
		try {
			
			FileReader filereader=new FileReader("/home/marinija/NoSql/dataset" + "/hotel_bookings.csv");
			CSVReader csvReader=new CSVReaderBuilder(filereader).withSkipLines(1).build();
			
			String[] nextRecord;
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			
			int i=1;
			
			List<Booking> bookings=new ArrayList<Booking>();
			while((nextRecord=csvReader.readNext())!=null) {
				System.out.println("Linija " +i);
				System.out.println("Duzina" + nextRecord.length);
				Booking b=new Booking();
				
				b.setHotel(nextRecord[0]);
				Integer is_canceled=Integer.parseInt(nextRecord[1]);
				b.setIs_canceled(is_canceled);
				//System.out.println(b.getIs_canceled());
				Integer lead_time=Integer.parseInt(nextRecord[2]);
				b.setLead_time(lead_time);
				Reservation r=new Reservation();
				r.setArrival_date_year(Integer.parseInt(nextRecord[3]));
				r.setArrival_date_month(nextRecord[4]);
				r.setArrival_date_week_number(Integer.parseInt(nextRecord[5]));
				r.setArrival_date_day_of_month(Integer.parseInt(nextRecord[6]));
				r.setStays_in_weekend_nights(Integer.parseInt(nextRecord[7]));
				r.setStays_in_week_nights(Integer.parseInt(nextRecord[8]));
				b.setReservation(r);
				Guests g=new Guests();
					g.setAdults(Integer.parseInt(nextRecord[9]));
					g.setChildren(Integer.parseInt(nextRecord[10]));
					g.setBabies(Integer.parseInt(nextRecord[11]));
					b.setGuests(g);
					b.setMeal(nextRecord[12]);
					g.setCountry(nextRecord[13]);
					b.setGuests(g);
					b.setMarket_segment(nextRecord[14]);
					b.setDistribution_channel(nextRecord[15]);
					g.setIs_repeated_guest(Integer.parseInt(nextRecord[16]));
					g.setPrevious_cancellations(Integer.parseInt(nextRecord[17]));
					g.setPrevious_bookings_not_canceled(Integer.parseInt(nextRecord[18]));
					b.setGuests(g);
					
					r.setReserved_room_type(nextRecord[19]);
					r.setAssigned_room_type(nextRecord[20]);
					b.setReservation(r);
					b.setBooking_changes(Integer.parseInt(nextRecord[21]));
					g.setDeposit_type(nextRecord[22]);
					b.setGuests(g);
					//b.setAgent(Integer.parseInt(nextRecord[23]));
					//b.setCompany(Integer.parseInt(nextRecord[24]));
					b.setDays_in_waiting_list(Integer.parseInt(nextRecord[25]));
					b.setCustomer_type(nextRecord[26]);
					b.setAdr(Double.parseDouble(nextRecord[27]));
					Requests req=new Requests();
					req.setRequired_car_parking_spaces(Integer.parseInt(nextRecord[28]));
					req.setTotal_of_special_requests(Integer.parseInt(nextRecord[29]));
					b.setRequests(req);
					r.setReservation_status(nextRecord[30]);
					try {
					r.setReservation_status_date(sdf.parse(nextRecord[31]));
					}catch(ParseException ex) {
						r.setReservation_status_date(null);
					}
					b.setReservation(r);
					bookings.add(b);
					
					i++;
				
				
			}
			
			
			
		}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	/*	public static void readJson() {
			ObjectMapper mapper=new ObjectMapper();
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}*/
		public static void main(String[]args) {
			CreateJson();
		}
}
