public class Task {
    public static void main(String[] args) {
        int matrix[][] = {{1, 206, 1072, 2, 3, 0, 217, 56, 32, 3, 14},
                          {2356, 12315, 77, 250, 9133},
                          {1009, 276, 739, 879, 242}};
        int maxValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
        }
        System.out.println("Самое большое число в матрице: " + maxValue);
    }
}