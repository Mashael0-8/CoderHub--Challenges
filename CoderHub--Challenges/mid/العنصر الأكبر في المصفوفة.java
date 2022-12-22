public static int max_element(int[] arr) {
    // write your code here

    int[] myArr = arr;
    Arrays.sort(myArr);
    
    int result = myArr[myArr.length-1];
    return result;
}