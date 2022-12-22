public static int factorial(int number) {
    // write your code here

    int result = 1;
    for(int i = number ; i>=1 ; i--){
        result *= i;
    }
    return result;
}