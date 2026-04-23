public class ToggleBit {
    public static void main(String[] args) {
        int n = 5; // 101
        int k = 1;
        n = n ^ (1 << k);
        System.out.println("Result: " + n);
    }
}