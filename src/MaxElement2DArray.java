import java.util.Scanner;

public class MaxElement2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất của ma trận là " + maxElement + " tại hàng " + (maxRow + 1) + ", cột " + (maxColumn + 1));
    }
}
