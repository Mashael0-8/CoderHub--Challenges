public static String middle_char(String word) {
    // write your code here

    int index = 0;
    String result = "";
    if(word.length() % 2 ==0){
        index = (word.length()/2) - 1;
        result += word.charAt(index);
        
        index++;
        result += word.charAt(index);
    }
    else{
        index = word.length()/2;
        result += word.charAt(index);
    }
    return result;
}