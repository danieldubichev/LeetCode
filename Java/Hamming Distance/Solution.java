class Solution {
    public int hammingDistance(int x, int y) {
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        int count = 0;

        
        if (sx.length() < sy.length()){
            int diff = (sy.length() - sx.length());

            int left = diff;
            while (left != 0){
                left--;
                if (sy.charAt(left) != '0'){
                    count++;
                }
            }
            

            for (int i = diff, j = 0 ; j < sx.length() && i < sy.length(); i++, j++){
                if (sx.charAt(j) != sy.charAt(i)){
                    count++;
                }
            }
        }
        
        else if (sx.length() > sy.length()){
            int diff = (sx.length() - sy.length());

            int left = diff;
            while (left != 0){
                left--;
                if (sx.charAt(left) != '0'){

                    count++;
                }
            }

            for (int i = diff, j = 0; j < sy.length() && i < sx.length() ; i++, j++){
                if (sx.charAt(i) != sy.charAt(j)){
                    count++;
                }
            }
        }
        
        else if (sx.length() == sy.length()){
            for (int i = 0; i < sx.length(); i++){
                if (sx.charAt(i) != sy.charAt(i)){
                    count++;
                }
        }
        }

        return count; 
    }
}
