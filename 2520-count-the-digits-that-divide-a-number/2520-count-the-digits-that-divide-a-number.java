class Solution {
    public int countDigits(int num) {
        int count = 0;
        int num1 = num;
        while(num1>0){
            int digit = num1%10;
            if(num % digit == 0){
                count++;
            }
            num1 = num1/10;
        }
        return count;
        
    }
}