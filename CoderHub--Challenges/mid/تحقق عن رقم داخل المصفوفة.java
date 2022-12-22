public static boolean find_element(int[] elements_array, int element) {
    // write your code here

    boolean ans = false;
    
    for(int i=0 ; i<elements_array.length ; i++){
        if(element == elements_array[i]){
            ans = true;
            break;
        }  
        else
            ans = false;  
    }
    return ans;
}