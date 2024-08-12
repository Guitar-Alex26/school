public class App {
    // Alexander Quirk
    enum Fruit { 
        APPLE("Apple", "Red", "Sweet"), 
        BANANA("Banana", "Yellow", "Sweet"), 
        STRAWBERRY("Strawberry", "Red", "Tangy"), 
        ORANGE("Orange", "Orange", "Citrus"), 
        GRAPE("Grape", "Purple", "Juicy"); 
        private String name;
        private String color;
        private String taste;
        // Constructor for the Fruit enum
        private Fruit(String name, String color, String taste) {
            this.name = name;
            this.color = color;
            this.taste = taste;
        }
        // Get color of selected fruit
        public String getColor() {
            return color;
        }
        // Get taste of selected fruit
        public String getTaste() {
            return taste;
        }
    }
    public static void main(String[] args) { 
        Fruit[] fruits = Fruit.values();  
        System.out.println("Fruit Information:"); 
        // Display fruit.name(), fruit.getColor(), and fruit.getTaste().
        for (Fruit fruit : fruits) {
            System.out.println("Fruit name: " + fruit.name() + "\nColor: " + fruit.getColor() + "\nTaste: " + fruit.getTaste() + "\n");
        }
    } 
}