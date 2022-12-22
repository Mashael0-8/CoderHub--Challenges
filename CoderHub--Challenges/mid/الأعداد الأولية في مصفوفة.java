public static int[] primes_nums(int[] numbers) {
    // write your code here
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int j=0; j<numbers.length; j++){
        
        int n= numbers[j];
        int i,m=0,flag=0;      
        m=n/2;      
        if(n==0||n==1){     
        }
        else{  
        for(i=2;i<=m;i++){      
          if(n%i==0){        
          flag=1;      
           break;      
           }      
         }      
         if(flag==0)  { array.add(n); }  // is prime number
      }
    }
    int[] result = array.stream().mapToInt(i -> i).toArray();
    return result;
}