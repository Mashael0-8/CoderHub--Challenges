public static int left_digit(String strParam) {
    // write your code here

    char[] numList = {'0','1','2','3','4','5','6','7','8','9'};
      int result = -1;
      
      for(int i = 0; i<strParam.length() ; i++ ){
          
          char strChar = strParam.charAt(i);
          
          for(int j = 0 ; j<numList.length ; j++){
              
             if(strChar == numList[j]){
                 result = Character.getNumericValue(strChar);
                 //System.out.println(result);
                 break; 
              }
          }
         if(result >= 0 && result <=9){
          break;  
         }
      }
      return result;
}