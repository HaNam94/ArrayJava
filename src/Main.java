import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
//        System.out.println("Nhập phần tử cần xóa: ");
//        int x = scanner.nextInt();
//        int index_del = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x){
//                index_del = i;
//                break;
//            }
//        }
//        if (index_del == -1){
//            System.out.println("Phần tử " + x + "Không xuất hiện trong mảng.");
//            return;
//        }
//        for (int i = index_del; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        System.out.println("Mảng mới sau khi xóa phần tử " + x + ": ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
//        System.out.println();

        int[] array = new int[10];
        System.out.println("Nhập số cần chèn vào mảng: ");
        int Y = scanner.nextInt();
        System.out.println("Nhap vị trí cần chèn Y vào mảng (từ 0 đến 9): ");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length){
            System.out.println("Không chèn được phần tử vào mảng. Vui lòng chọn vị trí hợp lệ.");
            return;
        }
        for (int i = array.length - 1; i > index ; i--) {
            array[i] = array[i - 1];
        }
        array[index] = Y;
        System.out.println("Mảng sau khi chèn phần tử " + Y + " vào vị trí " + index + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}