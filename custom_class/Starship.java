package custom_class;

public class Starship {
	
	private String name;
	private int numberOfEngines;
	private String destination;
	
	public String getName() {
		return name;
	}
	
	public int getNumberofEngines() {
		return numberOfEngines;
	}

	public String getDestination() {
		return destination;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}
	

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Starship() {
		name = "Enterprise";
		numberOfEngines = 4;
		destination = "Planet Vulcan";
	}
	
	public Starship(String name, String destination) {
		this.name = name;
		this.destination = destination;
	}
	
	public Starship(String name, int numberOfEngines, String destination) {
		this.name = name;
		this.numberOfEngines = numberOfEngines;
		this.destination = destination;
	}
	
	public static void giveOrder() {
		System.out.println("Make it so.");
	}
	
	public String warpSpeed() {
		return "Warp 6, Mr Crusher. Engage!";
	}
	
	public boolean isFlagShip() {
		return true;
	}
	
	public static void main(String[]args) {
		
		Starship Enterprise = new Starship ("Enterprise", 4, "Planet Vulcan");
		giveOrder();
		
	}
	
}
