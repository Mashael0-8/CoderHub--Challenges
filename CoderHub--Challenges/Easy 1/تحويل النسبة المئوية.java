public static double convertPercent(String percentage) {
    // write your code here

    String num = "";
    for(int i =0; i<percentage.length() ; i++){
        if(percentage.charAt(i) != '%'){
            num += percentage.charAt(i);
        }
    }
    double result = Double.parseDouble(num);  
    result = result / 100;
    return result;
}