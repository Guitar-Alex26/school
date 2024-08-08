public class testinggrounds {
    public static void main(String[] args) {
        int[][] twoArray = new int[3][3];
        // Assign integers
        int y = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoArray[i][j] = y;
                y++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}