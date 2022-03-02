class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer condensedWord1 = new StringBuffer();
        StringBuffer condensedWord2 = new StringBuffer();
        String finalWord1 = "";
        String finalWord2 = "";
        
        if(word1.length == 1 && word2.length > 1){
            finalWord1 = word1[0];
            
            for(int i = 0; i < word2.length; i++){
                condensedWord2.append(word2[i]);
            }
            
            String redefineWord2 = condensedWord2.toString();
            finalWord2 = redefineWord2;
            
        }
        else if(word1.length > 1 && word2.length == 1){
            finalWord2 = word2[0];
            
            for(int i = 0; i < word1.length; i++){
                condensedWord1.append(word1[i]);
            }
            
            String redefineWord1 = condensedWord1.toString();
            finalWord1 = redefineWord1;
            
        }
        else{
            for(int i = 0; i < word1.length; i++){
                condensedWord1.append(word1[i]);
            }
            for(int i = 0; i < word2.length; i++){
                condensedWord2.append(word2[i]);
            }
            
            String redefineWord1 = condensedWord1.toString();
            String redefineWord2 = condensedWord2.toString();
            
            finalWord1 = redefineWord1;
            finalWord2 = redefineWord2;
        }
        
        if(finalWord1.equals(finalWord2)){
            return true;
        }
        
        return false;
        
    }
}
