public static int calculate_sum(int[] lst) {
    // write your code here

        int total = 0;
        for(int i = 0 ; i<lst.length ; i++){
        if(lst[i] == 7){
            break;
        }
        else{
            total = total + lst[i];
        }
    }
    return total;
}