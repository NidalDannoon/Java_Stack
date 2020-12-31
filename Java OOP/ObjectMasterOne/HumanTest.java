public class HumanTest{
	public static void main(String[] args){
		Human wizard=new Human("W");
		Human ninja=new Human("N");
		Human samurai=new Human("S");
		wizard.attack(ninja);
		ninja.attack(samurai);
		samurai.attack(wizard);
	}
}