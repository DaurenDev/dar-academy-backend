class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10 && x >= 0){
            return true;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        while(x > 0){
            int remnant = x % 10;
            list.add(remnant);
            x = x / 10;
        }
        int pointer1 = 0;
        int pointer2 = list.size() - 1;
        
        while(pointer1 <= pointer2){
            if(list.get(pointer1) != list.get(pointer2)){
                return false;
            }
            pointer1++;
            pointer2--;
        }
        
        return true;
            
    }
}
