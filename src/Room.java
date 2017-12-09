/**
 * The Room class stores the number of beds.
 * 
 * @author David Smirnov
 */
import java.util.List;
import java.util.ArrayList;
public class Room {
	
	private Bed bed;
	private List<Bed> beds = new ArrayList<>();
	
	public Room(Bed bed) {
		this.bed = bed; 
	}

	 //add/get methods for the list of beds
	 public Room()
	 {
		 
		 
	 }
	 public int getBedNumber(int i){
		 Room r = new Room();
	    return r.beds.get(i).getNumber();
	 }
	 public List<Bed> getList() {
		 Room r = new Room();
		 return r.beds;
	 }
	 public void add(Bed beds) 
	 {
			Room r=new Room();
			r.beds.add(beds);
		}
	/*
	 public List<Bed> getBedNumber() {
		 return new ArrayList(beds);
	    }
	 public void setBedNumber(List<Bed> beds) {
		 this.beds = (beds == null) ? new ArrayList<>() : new ArrayList<>(beds);
	    }*/
	
}

