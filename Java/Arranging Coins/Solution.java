class Solution {
    public int arrangeCoins(int n) {
        int dummy = n;
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
    
        int multiplier = 1;
        int row = 1;
        
        while (dummy - multiplier >= 0){
            dummy = (dummy - multiplier);
            if (dummy <= row){
                break;
            }
            row++;
            multiplier++;
                
        } 
        return row;
    }
}