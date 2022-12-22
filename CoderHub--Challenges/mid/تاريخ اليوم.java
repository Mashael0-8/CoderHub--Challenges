public static String date_format(String date) {
    // write your code here
	
    String[] myStr = date.split("/");
    
    String result = date + " | " + myStr[0] + "-" + myStr[1] + "-" + myStr[2] + " | " + myStr[1] + "/" + myStr[2] + "/" + myStr[0];
    
    return result;
}