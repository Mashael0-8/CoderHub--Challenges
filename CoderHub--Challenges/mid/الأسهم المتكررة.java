public static String arrowDuplicates(String word) {
    String result = "";
    boolean isThere;
    
    for(int i=0; i<word.length(); i++){
        isThere = false;
        for(int j=0 ; j<word.length() ; j++){
            if((Character.toUpperCase(word.charAt(i)) == Character.toUpperCase(word.charAt(j))) && (i != j)){
                isThere = true;
            }
            if((Character.toUpperCase(word.charAt(i)) != Character.toUpperCase(word.charAt(j))) && (i != j)){
                
            }
        }
        if(isThere)
        result += "<";
        else
        result += ">";
    }
    return result;
}