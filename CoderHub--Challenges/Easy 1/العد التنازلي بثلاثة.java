public static int[] countdown(int num) {
    // write your code here
    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    if(num <= 3){
        int[] res = {0};
        return res;
    }
    else{
    for(int i = num-3 ; i>0; i-=3){
        if(i%2 == 0){
            myList.add(i);
        }
    }
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    Arrays.sort(result);
    return result;
    }
 
}