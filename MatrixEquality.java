public class MatrixEquality {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2}, {3, 4}};
        boolean isEqual = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}