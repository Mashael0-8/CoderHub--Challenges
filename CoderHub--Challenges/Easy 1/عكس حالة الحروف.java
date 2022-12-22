public static String reverse_case(String strParam) {
    // write your code here

    char[] charArray = strParam.toCharArray();
    String result = "";
    for(int i = 0 ; i<charArray.length ; i++){
        if(charArray[i] >=65 && charArray[i] <=90){
            result += Character.toLowerCase(charArray[i]);
        }
        else if(charArray[i] >=97 && charArray[i] <=122){
            result += Character.toUpperCase(charArray[i]);
        }
    }
    return result;
}