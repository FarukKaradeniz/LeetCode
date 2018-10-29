package Easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/unique-email-addresses/description/
public class Unique_Email_Addresses_929 {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        }));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (String email : emails) {
            String split[] = email.split("@");
            String localName = split[0];
            localName = localName.replace(".", "");
            int i = localName.indexOf('+');
            s.add(localName.substring(0, i) + "@" + split[1]);
        }

        return s.size();
    }
}
