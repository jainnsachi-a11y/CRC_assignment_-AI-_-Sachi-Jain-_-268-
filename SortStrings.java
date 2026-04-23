import java.util.Arrays;
public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Apple", "Mango"};
        Arrays.sort(arr);
        for (String s : arr)
            System.out.println(s);
    }
}