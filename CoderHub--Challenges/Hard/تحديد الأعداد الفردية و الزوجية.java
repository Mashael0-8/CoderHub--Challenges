public static String oddsVsEvens(int num) {

    String myNum = Integer.toString(num);
    int oddNum=0;
    int evenNum=0;
    for(int i=0; i<myNum.length(); i++){
        int tmp = Character.getNumericValue(myNum.charAt(i));
        if(tmp%2 == 0){
            evenNum += tmp;
        }
        else{
            oddNum += tmp;
        }
    }    
    if(evenNum > oddNum){
        return "even";
    }
    else if(oddNum > evenNum){
        return "odd";
    }
    else{
        return "equal";
    }
}