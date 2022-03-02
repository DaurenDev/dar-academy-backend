class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int proceededNumber = 1;
        int start = 0;
        int insertNegativeNumber = 0;
        
        if (n % 2 != 0){
            arr[0] = 0;
            start++;
        }
        
        for (int i = start; i < n; i++){
            if(insertNegativeNumber == 0){
                arr[i] = proceededNumber;
                insertNegativeNumber++;
            }
            
            else{
                arr[i] = -proceededNumber;
                proceededNumber++;
                insertNegativeNumber--;
            }
        }
        
        return arr;
        
    }
}
