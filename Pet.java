
public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setlocation(String location) {
		this.location = location;
	}
	
	public Pet() {
		name = "Lassie";
		age = 5;
		location = "backyard";
		type = "collie";
	}
	
	public Pet(String name, int age, String location, String type){
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	public void bark() {
		System.out.println("Ruff Ruff!");
	}
	
	
	public static void main (String[]args) {
		
	Pet dog = new Pet("lassie", 5, "backyard", "collie");
	
	System.out.println(dog.name);
	System.out.println(dog.age);
	System.out.println(dog.location);
	System.out.println(dog.type);
	dog.bark();
	
	}

}
