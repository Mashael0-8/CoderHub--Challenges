public static int smallest_number(int[] arr) {
    // write your code here

    int result = arr[0];
    for(int i =1; i<arr.length ; i++){
        if(arr[i] < result)
            result = arr[i];
    }
    return result;
}
Footer
© 2022 GitHub, Inc.