public static boolean allSameCase(String word) {
    // write your code here

    int isSmall = 0;
    int isCapital = 0;
    for(int i =0 ; i<word.length() ; i++){
        if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
            isCapital++;
        }
        else{
            isSmall++;;
        }
    }
    if(isCapital == word.length()){
        return true;
    }
    else if(isSmall == word.length()){
        return true;
    }
    else{
        return false;
    }
}