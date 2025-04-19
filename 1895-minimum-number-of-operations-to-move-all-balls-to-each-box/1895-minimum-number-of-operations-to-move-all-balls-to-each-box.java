class Solution {
    public int[] minOperations(String boxes) {
        List<Integer>list=new ArrayList<>();
        int n=boxes.length();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                list.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int num : list){
                int val=Math.abs(i-num);
                sum+=val;
            }
            ans[i]=sum;
        }
        return ans;
    }
}