public static boolean stringCheck(String[] value) {
    // write your code here

    boolean isEqual = false;
    for(int i =1 ; i<value.length ; i++){
        if(value[0] != value[i] ){
           isEqual = false; 
            break;
        }
        else 
            isEqual = true;
    }
    return isEqual;
}