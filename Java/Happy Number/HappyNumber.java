class HappyNumber{
    public static void main(String[] args){
        boolean answer = isHappy(80);
        System.out.println(answer);
    }

    public static boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        int remainder = n;
        int happy = 0;
        int lastdigits;
        while (remainder > 0){
            lastdigits = (remainder % 10);
            happy += lastdigits * lastdigits;
            remainder = remainder/10;
            //System.out.println("Last Digits = " + lastdigits);
            //System.out.println("Remainder = " + remainder);
            //System.out.println("Happy = " + happy);
        }
        if (happy == 1){
            return true;
        }
        if (happy == 4){
            return false;
        }
        return isHappy(happy);
    
    }
}
