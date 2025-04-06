class Solution {
    public int climbStairs(int n) {
        int s=1,s1=1;
        for(int i=2;i<=n;i++){
            int g=s+s1;
            s=s1;
            s1=g;
        }
        return s1;
    }
}