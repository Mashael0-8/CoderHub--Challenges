public static int sum_two_smallest_nums(int[] arr) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++){
        myList.add(arr[i]);
    }
    
    Collections.sort(myList); 
    
    int result = myList.get(0) + myList.get(1);
    return result;
}