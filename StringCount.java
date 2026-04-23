public class StringCount {
    public static void main(String[] args) {
        String str = "Hello World 123";
        int v = 0, c = 0, d = 0, s = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1)
                v++;
            else if (Character.isLetter(ch))
                c++;
            else if (Character.isDigit(ch))
                d++;
            else if (ch == ' ')
                s++;
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Spaces: " + s);
    }
}