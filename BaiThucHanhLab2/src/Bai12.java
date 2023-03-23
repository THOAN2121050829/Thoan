import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nhap so hang cua ma tran: ");
            int rows = input.nextInt();

            System.out.print("Nhap so cot cua ma tran: ");
            int cols = input.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Nhap cac phan tu cua ma tran:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("ma tran[" + i + "][" + j + "] = ");
                    matrix[i][j] = input.nextInt();
                }
            }

            int maxElement = matrix[0][0];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] > maxElement) {
                        maxElement = matrix[i][j];
                    }
                }
            }

            System.out.println("Phan tu lon nhat trong ma tran la: " + maxElement);

            System.out.print("Vi tri cua phan tu lon nhat la: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == maxElement) {
                        System.out.print("(" + i + "," + j + ") ");
                    }
                }
            }
        }
    }
}