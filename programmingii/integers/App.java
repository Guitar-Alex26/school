import java.io.*;
import java.util.*;

public class App {
    // Alexander Quirk
    // Print out a number of options the user can do with the file because
    // I'm forgetful and I think this would be helpful for someone who isn't me
    public static void printMenu() {
        String[] options = { "0 = exit program", "1 = create file", "2 = read file", "3 = write to file",
                "4 = file statistics", "5 = delete file", "6 = change second int to 1000",
                "7 = automate; do exactly as instructed online" };
        System.out.println("Select an option -");
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
        System.out.print("> ");
    }

    // Delete the file; BE GONE.
    public static void deleteFile(String name) {
        File file = new File(name);
        if (file.delete()) {
            System.out.println("File '" + name + "' deleted!");
        } else {
            System.out.println("File not found!");
        }
    }

    // Write to file
    public static void writeToFile(String name) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Integers to write: ");
        int num, dataSize;
        dataSize = in.nextInt();
        try {
            FileWriter writer = new FileWriter(name);
            while (dataSize > 0) {
                num = r.nextInt(10);
                writer.write(num + " ");
                dataSize--;
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occured!");
            e.printStackTrace();
        }
        dataSize--;
        in.close();
    }

    // Read and print file
    public static void readFile(String name) {
        try {
            File read = new File(name);
            Scanner in = new Scanner(read);
            while (in.hasNextLine()) {
                String data = in.nextLine();
                System.out.println(data);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occured!");
            e.printStackTrace();
        }
    }

    // Create new file
    public static void createNew(String name) {
        Scanner in = new Scanner(System.in);
        File file = new File(name);
        try {
            if (file.createNewFile()) { // Check if file exists
                System.out.println("File " + name + " was successfully created");
            } else { // Already exists?
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
        in.close();
    }

    // Reads and makes calculations; sum, total, and average of integers on file
    public static void stats(String name) {
        try (Scanner file = new Scanner(new File(name))) {
            int total = 0;
            int sum = 0;
            int average = 0;
            while (file.hasNext()) {
                if (file.hasNextInt()) {
                    int number = file.nextInt();
                    total++;
                    sum += number;
                } else {
                    file.next();
                }
            }
            average = sum / total;
            // Display total number of ints
            System.out.println("Total of ints: " + total);
            // Display sum of all ints
            System.out.println("Sum of ints: " + sum);
            // Display average int
            System.out.println("The average int: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + name);
            e.printStackTrace();
        }
    }

    public static void change(String name) {
        String file = name;
        int newValue = 1000; // Value for the second integer, because he's a baller

        // Read the file and store integers in a list
        List<Integer> integers = readIntegersFromFile(file);

        // Modify the second integer if there are at least two integers
        if (integers.size() >= 2) {
            integers.set(1, newValue); // Update the second integer (index 1)
        }

        // Write the updated list of integers back to the file
        writeIntegersToFile(file, integers);
    }

    // Method to read integers from the file into a list
    public static List<Integer> readIntegersFromFile(String file) {
        List<Integer> integers = new ArrayList<>();
        try (Scanner in = new Scanner(new File(file))) {
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    integers.add(in.nextInt());
                } else {
                    in.next(); // Skip non-integer tokens because they're lame
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        // RETURN TO WHICH THOUST CAMEST
        return integers;
    }

    // Method to write a list of integers to the file
    public static void writeIntegersToFile(String file, List<Integer> integers) {
        try (FileWriter writer = new FileWriter(new File(file))) {
            for (int i = 0; i < integers.size(); i++) {
                writer.write(integers.get(i).toString());
                if (i < integers.size() - 1) {
                    writer.write(" "); // To separate integers by space because I couldn't find another way
                }
            }
            writer.write(System.lineSeparator()); // Add a newline at the end
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // This is where the "helpful" is called from; for proof of work
    public static void printmsg(int which) {
        String message = "default";
        switch (which) {
            case 1:
                message = "Creating file";
            case 2:
                message = "Reading and printing file";
            case 3:
                message = "Changing second integer to 1000";
            case 4:
                message = "Displaying statistics of integers given";
        }
        System.out.println(message);
    }

    // This will be helpful when I need screenshots; nice and easy
    public static void automate(String name) {
        printmsg(1);
        createNew(name);
        printmsg(2);
        readFile(name);
        printmsg(3);
        change(name);
        printmsg(4);
        stats(name);
    }

    // Make a selection as to what to do with the file
    public static void select() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = in.nextLine();
        System.out.println("File selected: " + name);
        // This calls to print a menu of options; I made it a method for future
        // recursion purposes
        printMenu();
        int input = in.nextInt();
        if (input == 0) {
        } else if (input == 1) {
            // Create file
            createNew(name);
        } else if (input == 2) {
            // Read File
            readFile(name);
        } else if (input == 3) {
            // Write to file
            writeToFile(name);
        } else if (input == 4) {
            // Stats of ints; count, total, average
            stats(name);
        } else if (input == 5) {
            // Delete file
            deleteFile(name);
        } else if (input == 6) {
            // Change the second int to 1000
            change(name);
        } else if (input == 7) {
            automate(name);
        } else {
            System.out.println("Error: invalid response");
        }
        in.close();
    }

    public static void main(String[] args) throws Exception {
        // This will prompt the user with options as to what to do
        select();
        // Simply says when the program is terminating; helpful for debugging at one
        // point; nice to have
        System.out.println("Closing program");
    }
} // HOPEFULLY this is enough comments haha