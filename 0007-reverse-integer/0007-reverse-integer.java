class Solution {
    public int reverse(int x) {
        int r=0;
        while(x!=0){
            int s=x%10;
            int t=r*10+s;
            if((t-s)/10!=r){
                return 0;
            }
            r=t;
            x/=10;
        }
        return r;
    }
}