public class NumberArray {
    public static void main(String[] args) {
        int []arr = {8, 3, 12, 24, 9, 29, 96};
        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong dãy là: " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
