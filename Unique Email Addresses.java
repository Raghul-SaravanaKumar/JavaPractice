import java.util.*;

class Solution {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for(String email : emails) {

            String[] parts = email.split("@");

            String local = parts[0];

            if(local.contains("+")) {
                local = local.substring(0,
                        local.indexOf('+'));
            }

            local = local.replace(".", "");

            set.add(local + "@" + parts[1]);
        }

        return set.size();
    }
}
