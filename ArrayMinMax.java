public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 2, 50};
        int min = arr[0], max = arr[0];
        for (int a : arr) {
            if (a < min) min = a;
            if (a > max) max = a;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}