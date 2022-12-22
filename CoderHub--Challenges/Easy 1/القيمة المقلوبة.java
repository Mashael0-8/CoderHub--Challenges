public static boolean isMirrored(int num) {
    // write your code here
    
    String s =String.valueOf(num);
    int[] numbers = new int[s.length()];
    
    for(int i=0; i<s.length(); i++){
        numbers[i] = s.charAt(i) - '0';
    }
    
    boolean result= false;
    for(int i=0,k=numbers.length-1 ; i<numbers.length ; i++){
        if(numbers[i] != numbers[k]){
            result =false;
            break;
        }
        else{
            result = true;
            k--;
        }
    }
    return result;
}