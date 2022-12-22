public static boolean match_arrays(String[] array1, String[] array2) {
    // write your code here

    int counter = 0;
    boolean ans = false;
    if(array1.length == array2.length){
    for(int i =0; i<array1.length ; i++){
       for(int j = 0; j<array2.length ; j++){
         if(array1[i] == array2[j]){
             counter++;
         }  
       } 
    }
        if(counter >= array1.length)
            ans=true;
    }
    else {
          ans=false;
    } 
    return ans;
}