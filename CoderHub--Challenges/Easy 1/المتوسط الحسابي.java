public static double average(int[] values) {
    // write your code here

    int sum = 0;
    double total = 0;
    
    for(int i =0 ; i<values.length ; i++){
        sum+=values[i];
    }
    total = (double)sum/values.length;
    return total;
}