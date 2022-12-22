public static int[] cumulative_addition(int[] elements_array) {
    // write your code here

    int sum = 0;
    int count = 0;
    
    for(int i = 0 ; i<elements_array.length ; i++){
    sum += elements_array[i];
    }
    count = elements_array.length;
    int[] arr = {sum,count};
    return arr;
}