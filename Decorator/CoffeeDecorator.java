/*3. Create the Decorator Class
The decorator class implements the same interface as the concrete component.
It holds a reference to an instance of the component it decorates.
The decorator forwards the requests to the component it wraps and can modify its behavior
if necessary.*/

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
