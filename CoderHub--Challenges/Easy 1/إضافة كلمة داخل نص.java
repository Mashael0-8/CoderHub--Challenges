public static String say_hi_bye(String name, int num) {
    // write your code here

    String result = "";
    
    if(num ==0){
      result += "Bye "+name;  
    }
    else{
        result += "Hi "+name;  
    }
    return result;
}