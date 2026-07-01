class Solution {
    public int thirdMax(int[] arr) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        for(long i:arr){
            if (i > a) {
                c = b;
                b = a;
                a = i;
            } else if (i < a && (i > b)) {
                c = b;
                b = i;
            } else if (i < b && (i > c)) {
                c = i;
            }
        }
        return (c == Long.MIN_VALUE) ? (int)a:(int)c;
    }
}