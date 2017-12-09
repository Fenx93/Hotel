/**
 * The HotelConfigure class implements an application that
 * provides simple user interface, which allows to choose hotel name,
 * number of rooms, and for each room choose the number and size of beds.
 *
 * @author David Smirnov
 */

import java.util.Scanner;
public class HotelConfigure {

	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			Bed b = new Bed(0);
			Room r = new Room(b);
			Hotel h = new Hotel(r);
			//The user chooses hotel name
			System.out.println("Insert hotel`s name: ");
			h.setHotelName(k.nextLine());
			//The user chooses the number of rooms
			System.out.println("Insert number of rooms: ");
			h.setRoomNumber(k.nextInt());
			//For each room the user chooses the number of beds
			for(int i = 0; i < h.getRoomNumber(); i++) {
				
				System.out.println("Insert number of beds in room "+(i+1)+": ");
				Bed bd = new Bed(k.nextInt());
				r.add(bd);
				
				//the user chooses size for each  bed
				/*for(int j = 0; j < h.getBedNumber(); j++) {
					System.out.println("Insert bed`s number "+(j+1)+" size: ");
					h.setBedSize(k.next());
				}*/
			}
			System.out.println(r.getBedNumber(1));
			HotelReport hr = new HotelReport();
			//the user is given a report about the created hotel
			hr.giveReport(h, r, b);
	}
}
