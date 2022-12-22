public static String cap_space(String txt) {
    // write your code here

    String result = "";
    
    for(int i=0; i<txt.length(); i++){
        if(txt.charAt(i) >=65 && txt.charAt(i) <= 90){
          char temp = Character.toLowerCase(txt.charAt(i)); 
            result+= " ";
            result+= temp;
        }
        else{
            result += txt.charAt(i);
        }
    }
    return result;
}