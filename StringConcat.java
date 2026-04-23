public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        char[] result = new char[a.length + b.length];
        int i = 0;
        for (char c : a) result[i++] = c;
        for (char c : b) result[i++] = c;
        System.out.println(new String(result));
    }
}