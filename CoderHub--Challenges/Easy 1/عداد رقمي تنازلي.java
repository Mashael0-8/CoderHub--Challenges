public static String countDown(int number) {
    // write your code here

    String result = "";
    for(int i =number; i>= 0 ; i--){
        if(i !=0 ){
            result += String.valueOf(i);
            result += " ";
        }
        else{
            result += String.valueOf(i); 
        }
    }
    return result;
}