public class App {
    // Alexander Quirk
    // Prints borders or "headers"; easier to render it a method, rather than typing
    // it all manually
    public static void print(int option) {
        if (option == 0) { // Print a border
            for (int i = 38; i > 0; i--) {
                System.out.print("+");
            }
            System.out.println("\n");
        } else if (option == 1) { // Print a blank line
            System.out.println("\n");
        } else if (option == 2) { // Print a blank line, border, then another blank line
            System.out.println("\n");
            for (int i = 38; i > 0; i--) {
                System.out.print("+");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        // String array of text to display
        String[] strings = { "Java Pattern Printf chart for", "Pattern", "Result", "%f",
                "3.141593", "+" };
        // Pi... self-explanatory
        double pi = 3.14159265359;
        // Calling borders to be printed
        print(0);
        // Header of message
        System.out.printf("%36s", strings[0] + "\n\n");
        System.out.printf("PI = %.11f", pi);
        // Print a blank line, border, then another blank line
        print(2);
        System.out.printf("%s%9s%3s%14s%11s", strings[5], strings[1], strings[5], strings[2], strings[5]);
        print(2);
        // MAKE EDIT!
        System.out.printf("%s%4s%8s%16s%9s", strings[5], strings[3], strings[5], strings[4], strings[5]);
        print(2);
    }
}