class LCP {
    public static void main(String[] args){
        System.out.println("Java LCS -- Test Cases Below");
        
        
        //empty
        String[] strs1 = new String[0];

        //one element
        String[] strs2 = new String[1];
        strs2[0] = "LMAO"; 


        //4 empties
        String[] strs3 = new String[4];
        strs3[0] = ""; 
        strs3[1] = ""; 
        strs3[2] = ""; 
        strs3[3] = ""; 


        //3 elements - match "fl"
        String[] strs4 = new String[3];
        strs4[0] = "flower"; 
        strs4[1] = "flow"; 
        strs4[2] = "flight"; 


        //3 elements - no match
        String[] strs5 = new String[3];
        strs5[0] = "dog"; 
        strs5[1] = "racecar"; 
        strs5[2] = "car"; 

        //6 elements
        String[] strs6 = new String[6];
        strs6[0] = "sa"; 
        strs6[1] = "sads"; 
        strs6[2] = "sad"; 
        strs6[3] = "saddads"; 
        strs6[4] = ""; 
        strs6[5] = "sadad"; 

        System.out.println("Test 1");
        System.out.println(longestCommonPrefix(strs1));
        System.out.println("Test 2");
        System.out.println(longestCommonPrefix(strs2));
        System.out.println("Test 3");
        System.out.println(longestCommonPrefix(strs3));
        System.out.println("Test 4");
        System.out.println(longestCommonPrefix(strs4));
        System.out.println("Test 5");
        System.out.println(longestCommonPrefix(strs5));
        System.out.println("Test 6");
        System.out.println(longestCommonPrefix(strs6));
        /*
        System.out.println(longestCommonPrefix(strs6));
        System.out.println("Test 7");
        System.out.println(longestCommonPrefix(strs5));
        System.out.println("Test 8");
        System.out.println(longestCommonPrefix(strs5));*/

        /*
        System.out.println("Test 3");
        System.out.println("Test 4");
        System.out.println("Test 5");
        System.out.println("Test 6");
        System.out.println("Test 7");
        */

    }

    public static String longestCommonPrefix(String[] strs) {
         //find the string with lwoest num of chars
         String pfx = "";
         int n = lowestChars(strs);
         if (n == -1 || n == -2){
             if (n == -1){
                return strs[0];
             }
             if (n == -2){
                 return pfx;
             }
         }

        //Add binary search here.
        int low = 0;
        int high = n -1;
        while (low <= high){
            int mid  = low + (high - low)/2;
            if (allContainsPrefix(strs, strs.length, strs[0], low, mid)){
                pfx = pfx + strs[0].substring(low, mid+1);
                low = mid+1;
            } else {
                high = mid -1;
            }
        }




        return pfx;
    }
    public static boolean allContainsPrefix(String strarr[], int strarrlen, String str, int start, int end){
        for (int i = 0; i <= (strarrlen-1); i++){
                
            String str_at_i = strarr[i];
            
            for (int j = start; j <= end; j++)
                if (str_at_i.charAt(j) != str.charAt(j)){
                    return false;
                }
        }
        return true;
    }



    public static int lowestChars(String[] strs) {
        if (strs.length == 1){
            return -1;
        } else if (strs.length == 0){
            return -2;
        }

        int min = Integer.MAX_VALUE; 
        
        for (int i = 0; i <= (strs.length - 1); i++)  
        { 
            if (strs[i].length() < min) { 
                min = strs[i].length(); 
            } 
        } 
        return min; 
    }
}