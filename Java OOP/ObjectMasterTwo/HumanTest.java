public class HumanTest{
	public static void main(String[] args) {
		Human wizard=new Human("W");
		Human ninja=new Human("N");
		Human samurai=new Human("S");
		Wizard testWizard=new Wizard("TW");
		Ninja testNinja = new Ninja("TN");
		Samurai testSamurai = new Samurai("TS");			
		testWizard.fireball(testNinja);
		testWizard.heal(testNinja);
		testWizard.fireball(testNinja);
		testSamurai.deathBlow(testNinja);
		testSamurai.meditate();
		testNinja.runAway();
		testSamurai.howMany();		
	}
}