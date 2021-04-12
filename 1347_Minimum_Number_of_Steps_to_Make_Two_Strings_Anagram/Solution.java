
class Solution {
    public int minSteps(String s, String t) {
        
        int size = s.length();       
        int upperHalf = (size + 2 - 1) / 2;
        
        
        //boolean [] alreadyUsed = new boolean[size];
        
        int [] mapS = new int[26];
        int [] mapT = new int[26];
        
        int sizeIdx = size - 1;
        
        for(int i = 0; i < upperHalf; i++) {
            mapS[s.charAt(i) - 97]++;
            mapT[t.charAt(i) - 97]++;
            if(i != sizeIdx - i) {
                mapS[s.charAt(sizeIdx - i) - 97]++;
                mapT[t.charAt(sizeIdx - i) - 97]++;        
            }
        }
        
        int different = 0;
        
        for(int i = 0; i < 26; i++) {
            if(mapS[i] >= mapT[i]) {
                different += mapS[i] - mapT[i];
            }
        }
        
        return different;
        
        
    }
}