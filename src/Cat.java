
public class Cat extends Pet implements Boardable{
	private String hairLength;
	private int[] boardStart; 
	private int[] boardEnd;

	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		boardStart = new int [3];
		boardEnd = new int [3];
		
	}

	public String getHairLength(){
		return hairLength;
	}
	public String toString(){
		return "Pet's name: " + this.getPetName() + "\nOwner's name: " + this.getOwnerName() + "\nPet's color: " + this.getColor() + "\nPet's gender: " + this.getSex()+"\nPet's hair: " + this.getHairLength();
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.boardStart[0] = month; 
		this.boardStart[1] = day;
		this.boardStart[2] = year;
		        
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.boardEnd[0] = month;
		this.boardEnd[1] = day;
		this.boardEnd[2] = year;
		
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		boolean beforeEnd = false;
		boolean afterStart = false;
		if (year < boardEnd[2]) {
			beforeEnd = true;
		} else if (year == boardEnd[2]) {
			if (month < boardEnd[0]) {
				beforeEnd = true;
			} else if (month == boardEnd[0]) {
				if (day <= boardEnd[1]) {
					beforeEnd = true;
				}
			}
			
		}
		
		if (year > boardStart[2]) {
			afterStart = true;
		} else if (year == boardStart[2]) {
			if (month > boardStart[0]) {
				afterStart = true;
			} else if (month == boardStart[0]) {
				if (day >= boardStart[1]) {
					afterStart = true;
				}
			}
		}
		
		return (afterStart && beforeEnd);
	}
	
	public static void main(String[] args) {
		Cat cat1 = new Cat("Mio", "Amanda", "white", "short");//name, owner name, color, hair
		cat1.setSex(neutered);
		System.out.println(cat1.toString()); 
		
		cat1.setBoardStart(10, 21, 1980);
		cat1.setBoardEnd(10,21,1986);
		System.out.println(cat1.boarding(10, 22, 1980));
		

	}
	
	
}
