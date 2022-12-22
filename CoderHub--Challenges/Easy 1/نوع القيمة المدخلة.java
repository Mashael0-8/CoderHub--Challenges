public static String input_type(String value) {
   int double_counter= 0 ,int_counter= 0, string_counter =0;
    String result="";
    for(int i =0 ;i<value.length() ; i++){
        if(value.charAt(i) == 46)
        double_counter++;
        else if(value.charAt(i) >= 48 && value.charAt(i) <= 57)
        int_counter++;
        else if((value.charAt(i) >= 65 && value.charAt(i)<= 90) || (value.charAt(i) >= 97 && value.charAt(i)<= 122))
        string_counter++;
    }
    if(double_counter > 0)
    result = "double";
    else if(int_counter > string_counter)
    result = "integer";
    else if(string_counter > int_counter)
    result = "string";
    
    return result;
}