public class StringCopy {
    public static void main(String[] args) {
        String str = "Hello";
        char[] src = str.toCharArray();
        char[] dest = new char[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println("Copied String: " + new String(dest));
    }
}