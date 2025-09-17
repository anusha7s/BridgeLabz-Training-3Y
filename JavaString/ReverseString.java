package JavaString;

public class ReverseString {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverse("hello"));
    }
}
