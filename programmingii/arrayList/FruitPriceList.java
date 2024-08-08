import java.util.*;
public class FruitPriceList {
    public static void main(String[] args) {
        // Create a list of fruits
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 0.29));
        fruits.add(new Fruit("Mango", 1.29));
        fruits.add(new Fruit("Orange", 0.70));
        fruits.add(new Fruit("Apple", 0.39));
        fruits.add(new Fruit("Watermelon", 2.39));
        fruits.add(new Fruit("Peach", 0.49));
        fruits.add(new Fruit("Coconut", 2.79));
        // Sort the list from most expensive to least expensive
        int length = fruits.size();
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i; // Initialize maxIndex to the current index
            for (int j = i + 1; j < length; j++) {
                if (fruits.get(j).getPrice() > fruits.get(maxIndex).getPrice()) {
                    maxIndex = j; // Update maxIndex if a larger price is found
                }
            }
            // Swap the found maximum element with the first element of the unsorted part
            Fruit swap = fruits.get(maxIndex);
            fruits.set(maxIndex, fruits.get(i));
            fruits.set(i, swap);
        }
        // Print the sorted list of fruits and their respective prices
        System.out.println("Sorted list from most expensive to cheapest:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName() + ": $" + fruit.getPrice());
        }
    }
}
class Fruit {
    private String name;
    private double price;
    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}