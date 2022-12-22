public static String replaceThe(String txt) {
    // write your code here

    int index = txt.indexOf("the");
    
    if(txt.charAt(index + 4) == 'a' || txt.charAt(index + 4) == 'e' || txt.charAt(index + 4) == 'i' || txt.charAt(index + 4) == 'o' || txt.charAt(index + 4) == 'u'){
        txt = txt.replace("the", "an");
    }
    else{
        txt = txt.replace("the", "a");
    }
    return txt;
}