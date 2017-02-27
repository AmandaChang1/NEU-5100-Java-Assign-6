
public class Pet {
	
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int male = 1;
	public static final int female = 2;
	public static final int spayed = 3;
	public static final int neutered = 4;
	
	
	public Pet(String name, String ownerName, String color){
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName(){
		return name;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setSex(int sexid){
		this.sex=sexid;
		
	}
	
	public String getSex(){
		if (this.sex == male){
			return "male";
		}
		else if (this.sex == female){
			return "female";
		}
		else if (this.sex == spayed ){
			return "spayed";
			
		}else if (this.sex == neutered){
			return "neutered";
		}
		return "please fill out pet's sex";

	} 
	
	public String toString(){
		return "Pet's name: " + this.getPetName() + "\nOwner's name: " + this.getOwnerName() + "\nPet's color: " + this.getColor() + "\nPet's gender: " + this.getSex();
	}
	
	public static void main(String[] args) {
		Pet pet1 = new Pet("Corbin", "Polo", "black");
		pet1.setSex(female);
		System.out.println(pet1.toString());

	}


}
