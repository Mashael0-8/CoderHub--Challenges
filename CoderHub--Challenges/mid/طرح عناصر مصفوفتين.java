public static int[] sub_arrays(int[] arr1, int[] arr2) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    for(int i=0; i<arr2.length; i++){
        myList.add(arr2[i] - arr1[i]);
    }
    
    int[] result = new int[myList.size()];
    
    for(int i=0; i<result.length; i++){
        result[i] = myList.get(i);
    }
    return result;
}