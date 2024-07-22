class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        char e1, e2;
        if (s.length() > 0) {
            for (int i = 0; i < s.length() - 1; i++) {
                e1 = s.charAt(i);
                e2 = s.charAt(i + 1);
                
                if( ((int) e1) > ((int) e2) ) {
                    sum += (int) e1 - (int) e2;
                } else {
                    sum += (int) e2 - (int) e1;
                }
            }
        }
        
        return sum;
    }
}