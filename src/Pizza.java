public class Pizza {
	String topping;
	int size;
	int slices;
	
	Pizza(int size) {
		this.size = size;
	}
	
	void slice(int x) {
		slices = x;
	}
	
	void addToppings(String topping) {
		this.topping = topping;
	}
	
	void deliver() {
		System.out.println("Delivered!");
	}

}