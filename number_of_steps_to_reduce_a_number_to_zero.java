class Solution {
    public int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        int counter = 0;
        while(num >= 0){
            if(num == 1){
                num--;
                counter++;
                break;
            }
            else if(num % 2 != 0){
                num--;
                counter++;
            }
            else{
                num = num / 2;
                counter++;
            }
        }
        
        return counter;
    }
}
