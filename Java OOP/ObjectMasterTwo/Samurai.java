public class Samurai extends Human{
	static int count = 0;
	public Samurai(){
		this.health=200;
		count+=1;
	}
	public Samurai(String name){
		this.health=200;
		this.name=name;
		count=1;
	}
	public void deathBlow(Human human){
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println("Half of health was taken");
	}
	public void meditate(){
		this.setHealth(this.getHealth() + this.getHealth()/2);
		System.out.println(this.getName()+ " heals Samurai for " + this.getHealth() / 2);
	}
	public int howMany(){
		System.out.println(count);
		return count;
	}
}