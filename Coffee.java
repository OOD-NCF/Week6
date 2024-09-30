/*1. Define the Component Interface
The component interface defines the interface for objects that can have responsibilities added to them dynamically.
This is typically a simple interface or an abstract class that outlines the methods that will be implemented by both concrete components and decorators.
 */

public interface Coffee {
    String getDescription();
    double getCost();
}