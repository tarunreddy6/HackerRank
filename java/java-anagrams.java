// Author: Tarun Reddy Kalluri
// Solution in Java 7   Happy Coding :)

static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a.toLowerCase();
        b.toLowerCase();
        
        if(a.length() == b.length()){
            
            char[] arr = a.toCharArray();  
            char[] arr1 = b.toCharArray();
            
            java.util.Arrays.sort(arr);
            java.util.Arrays.sort(arr1);
            
            if(java.util.Arrays.equals(arr, arr1))
                return true;
        }
        return false;  
    }
