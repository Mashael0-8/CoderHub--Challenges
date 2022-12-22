public static String operation(int num1, int num2) {
    // write your code here

    if((num1 / num2) == 24){
        return "divided";
    }
    else if((num1 * num2)== 24){
        return "multiplied";
    }
    else if((num1 + num2)==24){
        return "added";
    }
    else if((num1 - num2)==24){
        return "subtracted";
    }
    else{
        return "None";
    }
}