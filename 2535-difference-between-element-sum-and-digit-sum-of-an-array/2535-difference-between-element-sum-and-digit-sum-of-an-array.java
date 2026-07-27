class Solution {
    public int differenceOfSum(int[] arr) {
        int sum = 0;
        int num = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

        }
        for(int i=0; i<arr.length; i++){
            while(arr[i] > 0){
                int digit = arr[i]%10;
                num += digit;
                arr[i]=arr[i]/10;
            }

        }
        return sum-num;
        
    }
}