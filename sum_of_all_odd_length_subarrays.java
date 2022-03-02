class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            counter = arr[i] + counter;
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((j - i) % 2 == 0){
                    for(int k = i; k <= j; k++){
                        counter = arr[k] + counter;
                    }
                }
            }
        }
        return counter;
    }
}
