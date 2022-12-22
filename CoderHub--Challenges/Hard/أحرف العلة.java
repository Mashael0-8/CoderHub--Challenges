public static String first_n_vowels(String phrase, int n) {
    // write your code here

    String vowels= "";
    
    for(int i=0; i<phrase.length(); i++){
        if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' 
           || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u' || phrase.charAt(i) == 'A' || phrase.charAt(i) == 'E' 
           || phrase.charAt(i) == 'I' || phrase.charAt(i) == 'O' || phrase.charAt(i) == 'U'){
            vowels += phrase.charAt(i);
        }
    }
    if(n > vowels.length()){
        return "invalid";
    }
    else{
        return vowels;
    }
}