public static double get_mean(int[] arr) {
    // write your code here

    double result = 0;
    for(int i = 0 ; i<arr.length ; i++){
        result+=arr[i];
    }
    return result / arr.length;
}