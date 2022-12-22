public static int[] word_length(String[] arr) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    for(int i=0; i<arr.length; i++){
        myList.add(arr[i].length());
    }
    
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    return result;
}