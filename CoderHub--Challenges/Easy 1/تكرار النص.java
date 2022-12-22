public static String word_repeat(String word, int n) {
    // write your code here

    String result = "";
    for(int i =1; i<=n ; i++){
        if(i == n){
            result += word;
        }
        else{
            result += word;
            result += " "; 
        }
    }
    return result;
    
}