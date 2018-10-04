package Easy;

// https://leetcode.com/problems/to-lower-case/description/
public class To_Lower_Case_709 {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(toLowerCase(hello)); // Should print "hello"
        String sap = "SaPpHiRe";
        System.out.println(toLowerCase(sap)); // Should print "sapphire"
    }

    public static String toLowerCase(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                arr[i] = (char) (str.charAt(i) - 'A' + 'a');
            else
                arr[i] = str.charAt(i);
        }

        return new String(arr);
    }

}
