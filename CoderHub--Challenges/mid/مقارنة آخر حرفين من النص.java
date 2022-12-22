public static boolean compare_two_words(String s1, String s2) {
    // write your code here

    String sen1 = String.valueOf(s1.charAt(s1.length()-1));
    sen1 += String.valueOf(s1.charAt(s1.length()-2));
    
    String sen2 = String.valueOf(s2.charAt(s2.length()-1));
    sen2 += String.valueOf(s2.charAt(s2.length()-2));
    
    if(sen1.charAt(0) == sen2.charAt(0) && sen1.charAt(1) == sen2.charAt(1))
        return true;
    else
        return false;
}