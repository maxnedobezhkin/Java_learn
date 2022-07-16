package packageforpatterns.fabrica;

public class CoffeeMarket {
	
	private final CoffeeFabrica coffeeFactory;

    public CoffeeMarket(CoffeeFabrica coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
