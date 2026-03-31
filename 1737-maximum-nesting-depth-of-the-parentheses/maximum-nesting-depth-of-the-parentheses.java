class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int ans = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
                count++;
            }else if(ch==')'){
                st.pop();
                count--;
            }
            ans = Math.max(count,ans);
        }
        return ans;    }
}