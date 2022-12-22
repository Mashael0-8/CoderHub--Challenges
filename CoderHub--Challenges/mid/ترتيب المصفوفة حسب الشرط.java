public static int[] sort_array(int[] my_array, String typeParam) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int i=0; i<my_array.length;i++){
            array.add(my_array[i]);
        }
        
    if(typeParam == "B")
        Collections.sort(array,Collections.reverseOrder()); 
    else
       Collections.sort(array); 
    
    int[] result = array.stream().mapToInt(i -> i).toArray();
    return result;
}