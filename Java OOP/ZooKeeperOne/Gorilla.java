public class Gorilla extends Mammal {
	public void throwSomething() {
		energyLevel-=5;
		System.out.println("Gorilla has thrown something");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel+=10;
		System.out.println("Gorilla eats some bananas and gain some energy.");
		displayEnergy();
	}
	public void climb() {
		energyLevel-=10;
		System.out.println("Gorilla climbs a tree and loose some energy.");
		displayEnergy();
	}
	
}