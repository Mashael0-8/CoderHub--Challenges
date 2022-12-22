public static int[] largest_smallest(int[] array_values) {
    // write your code here

    int[] result = new int[2];
    int largest= 0;
    int smallest = array_values[0];
    
    for(int i = 0 ;i<array_values.length ; i++){
        if(array_values[i] > largest)
            largest = array_values[i];
    }
    for(int i = 0 ;i<array_values.length ; i++){
        if(array_values[i] < smallest)
            smallest = array_values[i];
    }
    result[0] = largest;
    result[1] = smallest;
    return result;
}