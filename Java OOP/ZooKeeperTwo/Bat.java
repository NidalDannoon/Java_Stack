public class Bat extends Mammal{	
	public Bat(){
	this.energyLevel=300;
	}	
	public void fly(){
		energyLevel-=50;
		System.out.println("Wow Sound");
		displayEnergy();
	}
	public void eatHumans(){
		energyLevel+=25;
		System.out.println("More Energy after eat");
		displayEnergy();
	}
	public void attackTown(){
		energyLevel-=100;
		System.out.println("Fire Sound");
		displayEnergy();
	}
}