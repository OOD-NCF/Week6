/*2. Create Concrete Component
The concrete component is the class that will have
 additional behavior attached to it at runtime by decorators.
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
