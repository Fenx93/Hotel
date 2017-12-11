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
	
	//method for testing whether the input is not negative
	public static void testInput(int z) {
		if(z < 0) {
			System.out.println("The input is incorrect");
			System.exit(0);
		}
	}
	//method for testing the input which can be only single or double
	public static void testBedSize(String s) {
		if((s.toLowerCase() != "single")||(s.toLowerCase() != "double")||(s.toLowerCase() != "s")||(s.toLowerCase() != "d")||(s.toLowerCase() != "1")||(s.toLowerCase() != "2")) {
			System.out.println("The input of the bed size is incorrect");
			System.exit(0);
		}
	}
	
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
			testInput(h.getRoomNumber());
			//For each room the user chooses the number of beds
			for(int i = 0; i < h.getRoomNumber(); i++) {
				
				System.out.println("Insert number of beds in room "+(i+1)+": ");
				Bed bd = new Bed(k.nextInt());
				r.add(bd);
				testInput(r.getBedNumber(i));
				//the user chooses sizes for each bed
				for(int j = 0; j < r.getBedNumber(i); j++) {
					System.out.println("Insert bed`s number "+(j+1)+" size: ");
					b.addBedSize(k.next());
					testBedSize(b.getBedSize(j));
				}
			}
			HotelReport hr = new HotelReport();
			//the user is given a report about the created hotel
			hr.giveReport(h, r, b);
	}
}
