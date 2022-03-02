class Solution {
    public String restoreString(String s, int[] indices) {
        char[] orderedArray = new char[indices.length];
        String result;
        for(int i = 0; i < orderedArray.length; i++){
            int index = indices[i];
            char element = s.charAt(i);
            orderedArray[index] = element;
        }
        result = String.valueOf(orderedArray);
        return result;
    }
}
