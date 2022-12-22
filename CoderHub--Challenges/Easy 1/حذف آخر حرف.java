public static String deleteLastChar(String word) {
    // write your code here

    String result = "";
    for(int i =0; i<word.length()-1 ; i++){
        result+= word.charAt(i);
    }
    return result;
}