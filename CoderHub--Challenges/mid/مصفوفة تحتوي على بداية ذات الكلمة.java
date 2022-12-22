public static String[] find_prefix(String[] words, String text) {

    String[] result;
    char[] letters = text.toCharArray();
    String[] err = {"No matches found"};
    int counter = 0;
    
    
    for(int i = 0 ; i<words.length ; i++){
        int c =0;
        for(int j = 0 ; j<text.length() ; j++){
            if((Character.toUpperCase(letters[j]) == words[i].charAt(j)) || (Character.toLowerCase(letters[j]) == words[i].charAt(j))){
                c++;
            if(c == text.length()){
                counter++;
            }
        }
            
        }
        
    }
   
     result = new String[counter];
    for(int i = 0 , k=0; i<words.length ; i++){
        int c =0;
        for(int j = 0 ; j<text.length() ; j++){
            if((Character.toUpperCase(letters[j]) == words[i].charAt(j)) || (Character.toLowerCase(letters[j]) == words[i].charAt(j))){
                c++;
            if(c == text.length()){
                result[k] = words[i];
                k++;
            }
        }
            
        }
        
    }
    if(counter != 0){
        return result;
    }
    else {
        
        return err;
    }