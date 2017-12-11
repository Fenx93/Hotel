/**
 * The Bed class stores the size of each bed in the hotel.
 * 
 * @author David Smirnov
 */
import java.util.List;
import java.util.ArrayList;

public class Bed {
	private int bedNumber;
	private List<String> bedSize = new ArrayList<String>();
	
	Bed(int bedNumber)
	{
		this.bedNumber = bedNumber;
	}	
	public int getNumber()
	{
		return this.bedNumber;
	}
	
	 //get/add methods for each size of the bed
	public String getBedSize(int j){
	    return this.bedSize.get(j);
	 }
	public List<String> getBedSizeList() {
	     return this.bedSize;
	 }
	 public void addBedSize(String bedSize) {
		 this.bedSize.add(bedSize);
	}
}


