public class about_array {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Define an array------------------------>
        // Method 1
        int marks[] = new int[4];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        printArray(marks);

        // Method 2
        int score[] = { 20, 30, 40 };
        printArray(score);

        // 2d aray
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}