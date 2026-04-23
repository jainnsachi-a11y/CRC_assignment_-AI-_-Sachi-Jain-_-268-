public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < a[0].length; i++) {
            for (int[] row : a) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
}