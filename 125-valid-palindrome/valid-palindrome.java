class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(s, 0);
    }
    private boolean check(String s, int i) {
        if (i >= s.length() / 2) return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return check(s, i + 1);
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         String x = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//         String y = "";
//         for(int i=x.length()-1;i>=0;i--){
//             y = y + x.charAt(i);
//         }
//         return (x.equals(y));
//     }
// }
// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); 
//         int i = 0;
//         int j = s.length() - 1;
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
//             return true;        
        
//     }
// }

