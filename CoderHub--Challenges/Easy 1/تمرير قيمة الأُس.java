public static int exponent_x(int number, int exponent) {
    // write your code here

    int num = number;
    for(int i = 1 ; i<exponent ; i++){
        number *= num;
    }
    return number;
}