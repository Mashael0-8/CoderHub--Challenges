public static int[] remove_duplicate(int[] arr) {
    
    ArrayList<Integer> myList = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++){
        myList.add(arr[i]);
    }
    
    for(int i=0; i<arr.length ;i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                myList.set(j,0); 
            }
        }
    }
    for(int i=myList.size()-1; i>=0 ;i--){
        if(myList.get(i) == 0)
        myList.remove(i);
    }
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    return result;
}