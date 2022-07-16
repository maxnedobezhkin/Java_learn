package packageforpatterns.fabrica;

public class CoffeeFabrica {
	public Coffee createCoffee (CoffeeType type) {
		Coffee coffee = null;
	
	    switch (type) {
	        case Espresso:
	            coffee = new Espresso();
	            break;
	        case Latte:
	            coffee = new Latte();
	            break;
	    }
	    return coffee;
	}
}
