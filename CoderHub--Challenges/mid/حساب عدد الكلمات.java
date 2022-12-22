public static int countWords(String txt) {
    // write your code here

    int result = 0;
    for(int i =0; i<txt.length(); i++){
        if(txt.charAt(i) == ' ')
            result++;
    }
    result++;
    return result;
}