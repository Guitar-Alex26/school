class Test {
    // method to print the contents of a message
    public static void print(String mesg) {
        // Had to change System.out.print to System.out.println
        System.out.println(mesg);
    }

    // method to print the contents of a one-dimensional array
    // Had to change method names because three methods were created with the SAME
    // name
    public static void print1d(int[] array) {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    // method to print the contents of a two-dimensional array
    public static void print2d(int[][] array, int rows, int columns) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Helloworld {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello world!");
        Test msg = new Test();
        String message = "Welcome to CSIT-166!";
        msg.print(message);

        // create a one-dimensional array and invoke print(int[] array)
        // Initialization
        int[] oneArray = new int[10];
        int x = 1;
        // Assign integers
        for (int i = 0; i < 10; i++) {
            oneArray[i] = x;
            x++;
        }
        // Print array test
        Test.print1d(oneArray);

        // create a two-dimensional array and invoke print(int[], int rows, int columns)
        // Initialization
        int[][] twoArray = new int[3][3];
        // Assign integers
        int y = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoArray[i][j] = y;
                y++;
            }
        }
        // Print array test
        Test.print2d(twoArray, 3, 3);
    }
}