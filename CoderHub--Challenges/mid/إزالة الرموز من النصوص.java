public static String removeSpecialCharacters(String strParam) {
    String result = "";
    for(int  i =0; i<strParam.length() ; i++){
        if(strParam.charAt(i) != '$' && strParam.charAt(i) != '!' && strParam.charAt(i) != '@' && 
          strParam.charAt(i) != '#' && strParam.charAt(i) != '.' && strParam.charAt(i) != '?'){
           result += strParam.charAt(i); 
        }
    }
    return result;
}