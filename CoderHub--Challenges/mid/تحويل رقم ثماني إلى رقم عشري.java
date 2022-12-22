public static int oct_to_dec(int octal_number) {
    // write your code here

    String result=String.valueOf(octal_number);
    
    return Integer.parseInt(result,8);
}