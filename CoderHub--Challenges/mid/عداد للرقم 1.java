public static int count_ones(int num) {
    // write your code here

    String binaryNum = Integer.toBinaryString(num);
    
    int count = 0;
    
    for(int i=0; i<binaryNum.length(); i++){
       if(binaryNum.charAt(i) == '1')
           count++;
    }
    
    return count;
