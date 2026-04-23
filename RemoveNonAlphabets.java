public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String str = "Hello123@World!";
        String result = "";
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch))
                result += ch;
        }
        System.out.println(result);
    }
}