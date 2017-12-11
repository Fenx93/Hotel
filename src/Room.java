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
	
	 public int getBedNumber(int i){
		    return this.beds.get(i).getNumber();
		 }
		 public List<Bed> getList() {
		     return this.beds;
		 }
		 public void add(Bed beds) 
		 {
		        this.beds.add(beds);
		 }
}

