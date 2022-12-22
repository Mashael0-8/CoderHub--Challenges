public static int count_char(String sentence, String ch) {
    // write your code here

    String search = "";
     int count = 0;
    
     for(int i =0 ; i<sentence.length() ; i++){
         search = Character.toString(sentence.charAt(i));
         if(search.compareToIgnoreCase(ch) == 0){
             
             count++;
         }
     }
    return count;
}