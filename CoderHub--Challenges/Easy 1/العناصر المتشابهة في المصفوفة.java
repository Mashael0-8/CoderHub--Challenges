public static int[] get_duplicate_elements(int[] arr) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    for(int i=0; i<arr.length ;i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                myList.add(arr[i]); 
            }
        }
    }
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    return result;
}