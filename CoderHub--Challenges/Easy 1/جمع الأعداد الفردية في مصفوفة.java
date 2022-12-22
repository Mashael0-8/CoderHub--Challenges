public static int sumOdd(int[] arr) {
    // write your code here

    int result =0;
    for(int i =0; i<arr.length ; i++){
        if(arr[i] % 2 != 0){
            result += arr[i];
        }
    }
    return result;
}