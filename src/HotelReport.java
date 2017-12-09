/**
 * The HotelReport class implements an application that
 * produces short textual report about the created Hotel:
 * it shows the name of the hotel, the number of rooms and, for each room,lists the number  and size of the beds.
 * 
 * 
 */
public class HotelReport {
	public void giveReport(Hotel h, Room r, Bed b) {
		//Prints the hotel name and number of the rooms
		System.out.format("Hotel Name: %s%n Number of rooms: \t%d %n ", h.getHotelName(), h.getRoomNumber() );
		
		//For each room prints the number of beds and their sizes
		System.out.println(r.getList());
		for(int i = 0; i < h.getRoomNumber(); i++) 
		{
			//checks if the number of beds is plural or not
			if(r.getBedNumber(i)<2 ) {
				System.out.println(" Room "+(i+1)+" has "+ r.getBedNumber(i) +" bed:");
			}
			else System.out.println(" Room "+(i+1)+" has "+ r.getBedNumber(i) +" beds:");
			/*for(int j = 0; j < h.getBedNumber(); j++) 
			{
				System.out.println("  *Bed nr."+(j+1)+" is "+ h.getBedSize()+"-sized");
			}*/
		}
	}
}
