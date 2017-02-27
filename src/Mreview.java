import java.util.*;

public class Mreview implements Comparable <Mreview>{
	 
	private String title;  
	private ArrayList<Integer> ratings;
	
	
	public Mreview(){
		title= "";
		ratings= new ArrayList<Integer>();
			
	}
	
	public Mreview(String ttl){
		this();
		title = ttl;
	}
	
	public Mreview(String ttl, int firstRating){
		this(ttl);
		ratings.add(firstRating);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void addRating(int r){
		this.ratings.add(r);
	}
	
	public double aveRating(){
		int sum=0;
		for (int s : ratings){
			sum += s ;
		}
		return (double)sum/ratings.size();
	}
	
	
	
	public int numRating(){
		return ratings.size();
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return title.compareTo(obj.title);
	} 
	
      
	
	public boolean equals(Object obj){
		if (title.equals(((Mreview)obj).getTitle())){
			return true;
		}
		return false;
	}
	
	
	public String toString(){
		
		return this.getTitle()+ ", average " + this.aveRating() + " out of " + this.numRating() + " ratings";
	} 
	
	public static void main(String[] args) { 
		Mreview test = new Mreview("The Lego", 5 );
		Mreview test1 = new Mreview("Avengers", 5 );
		Mreview test2 = new Mreview("Star war", 5 );
		test.addRating(3);
		test.addRating(4);
		
		test1.addRating(5);
		test1.addRating(2);
		
		test2.addRating(5);
		test2.addRating(5);
		
		ArrayList<Mreview> reviews = new ArrayList<>();
		reviews.add(test);
		reviews.add(test1);
		reviews.add(test2);
		Collections.sort(reviews);
		
		for (Mreview review : reviews) {
			System.out.println(review.toString());
		}
	}
	 
}
