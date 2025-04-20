class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int sum=0;
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==0){
                sum++;
            }
            else if(i==0||answers[i]!=answers[i-1]||count==0){
                sum+=answers[i]+1;
                count=answers[i];
            }
            else{
                count--;
            }
        }
        return sum;
    }
}