public static int[] getPrimesBetween(int a, int b) {
    // write your code here

    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    for(int k=a; k<=b ;k++){   
       int i,m=0,flag=0;  
       m=k/2;      
       if(k==0||k==1){     
       }
       else{  
           
         for(i=2;i<=m;i++){      
         if(k%i==0){         
         flag=1;      
         break;      
          }      
       }      
        if(flag==0)  {
            myList.add(k);   
        }  
          }//end of else
    } 
    
    int[] result = myList.stream().mapToInt(i -> i).toArray();
    return result;
}