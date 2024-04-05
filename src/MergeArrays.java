import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Nhập các phần tử của mảng 1: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhập các phần tử của mảng 2: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        System.out.println("Mảng sau khi gộp:");
        for (int value : array3){
            System.out.println(value + " ");
        }
        scanner.close();
    }
}
