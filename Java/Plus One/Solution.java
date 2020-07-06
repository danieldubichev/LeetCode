class Solution {
    public int[] plusOne(int[] digits) {
       int[] tmp = new int[digits.length];
       int carry = 0;
       //carry needed. iterate through adding elements to new array 
       if (digits[digits.length - 1] == 9){

           carry = 1;
           tmp[digits.length -1 ] = 0;
           for (int i = digits.length -2; i >= 0 ; i--){
                if (carry == 0){

                    tmp[i] = digits[i];
                }
                else if (digits[i] == 9 && carry == 1){
                    tmp[i] = 0;
                } else {
                    tmp[i] = (digits[i] + 1);
                    carry = 0;
                    
                }
           }           
       } else {

           tmp = digits;
           tmp[tmp.length -1 ] = (tmp[tmp.length -1 ] + 1);
           return tmp;
       }
       if (carry == 1){

           int[] tmp2 = new int[digits.length + 1];
           tmp2[0] = 1;
           for (int j = 1; j < tmp2.length; j++){
               tmp2[j] = 0;
           }
           return tmp2;
       }
    return tmp;
    }
}