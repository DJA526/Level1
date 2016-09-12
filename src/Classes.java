
public class Classes {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza(5);
		pizza.slice(8);
		
		Taco taco = new Taco("chicken");
		taco.addHotSauce();
		
		TheFlavors a = new TheFlavors(12345);
		a.dravagazagaz();
		
		StirFry stirfry = new StirFry("vegetarian");
		stirfry.sell();
	}

}
