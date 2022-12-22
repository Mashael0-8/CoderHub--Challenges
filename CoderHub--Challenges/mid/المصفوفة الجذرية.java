public static double[] array_root(double[] arr) {
    // write your code here

    double[] result = new double[arr.length];
    
    for(int i=0; i<arr.length; i++){
        result[i] = Math.sqrt(arr[i]);
    }
    return result;
}