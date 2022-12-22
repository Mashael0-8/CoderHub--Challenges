public static int[] cumulative_sum(int[] arr) {
    // write your code here

    int firstNum = arr[0];
    int[] result = new int[arr.length];
    result[0] = arr[0];
    
    for(int i =1 ; i<arr.length ; i++){
        result[i] = result[i-1] + arr[i];
    }
    return result;
}