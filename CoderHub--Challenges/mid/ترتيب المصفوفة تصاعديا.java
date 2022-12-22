public static int[] sort_array(int[] elements_array) {
    // write your code here

    for(int i =0 ; i<elements_array.length ; i++){
        for(int j =i+1 ; j<elements_array.length ; j++){
            int temp = 0;
            if(elements_array[i] > elements_array[j]){
                temp = elements_array[i];
                elements_array[i] = elements_array[j];
                elements_array[j] = temp;
            }
        }
    }
    return elements_array;
}