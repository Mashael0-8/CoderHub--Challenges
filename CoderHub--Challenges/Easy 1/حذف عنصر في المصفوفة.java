public static int[] delete_element_in_array(int[] arr, int index) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    for(int i=0; i<arr.length ;i++){
        if(index != i){
           myList.add(arr[i]); 
        }
    }
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    return result;
}