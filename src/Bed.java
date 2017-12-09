/**
 * The Bed class stores the size of each bed in the hotel.
 * 
 * 
 */
//import java.util.List;
//import java.util.ArrayList;

public class Bed {
	private int bedNumber;
	//private List<String> bedSize = new ArrayList<String>();
	
	Bed(int bedNumber)
	{
		this.bedNumber = bedNumber;
	}

	
	public int getNumber()
	{
		return this.bedNumber;
	}
	
	 //get/set methods for each size of the bed
	/*
	public String getBedSize() {
		return bedSize;
	}
	 public void addBedSize(String bedSize) {
		 bedSize.add(bedSize);
	}*/
}


