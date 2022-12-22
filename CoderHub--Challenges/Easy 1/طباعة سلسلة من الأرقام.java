public static String numbers_range(int number) {
    // write your code here

    String result = "";
    for(int i =0; i<=number ; i++){
        if(i != number){
             result += String.valueOf(i);
            result += " ";
        }
        else{
            result += String.valueOf(i);
        }    
    }
    return result;
}