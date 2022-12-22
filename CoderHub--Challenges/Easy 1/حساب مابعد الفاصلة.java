public static int Decimal_places(String num) {
    // write your code here

    int index = 0;
    int result = 0;
    for(int i =0; i<num.length() ; i++){
        if(num.charAt(i) == '.'){
          index = i;
            index +=1;
            result = num.length() - index;
            break;
        }
    }
    
    return result;
}