public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        int[] freq = new int[256];
        for (char ch : str.toCharArray())
            freq[ch]++;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                System.out.println((char)i + " : " + freq[i]);
        }
    }
}