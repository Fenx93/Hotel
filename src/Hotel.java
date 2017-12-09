/**
 * The Hotel class stores the name of hotel and number of the rooms.
 * 
 * @author David Smirnov
 */

public class Hotel {
	
	private String hotelName;
	private int roomNumber;
	private Room room;
	
	public Hotel(Room room) {
		this.room = room; 
	}
	//get/set methods for the hotel name
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	//get/set methods for the number of the rooms
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
