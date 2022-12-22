public static boolean str_len_comparison(String[] words) {
    // write your code here

    boolean ans = false;
    String test = words[0];
    
    for(int i = 1 ; i<words.length ; i++){
          String stringTest = words[i];
           if(test.length() == stringTest.length()){
               ans = true;
           }
           else if(words.length == 0 || words.length == 1){
               ans = false;
           }
           else{
               ans = false;
           }
      }
    return ans;
}