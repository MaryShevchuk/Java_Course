public class Task {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
                if (i == j) {
                    sum += matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма главной диагонали матрицы равна: " + sum);
    }
}
/*
Второй вариант

public class Task {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3,},
                          {4, 5, 6},
                          {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    sum += matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма главной матрицы диагонали равна: " + sum);
   }
}

 */

