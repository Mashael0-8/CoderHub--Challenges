public static String hashtag_it(String[] my_array) {
    // write your code here

    String result = "";
    for(int i = 0 ; i< my_array.length ; i++){
        if((i + 1) == my_array.length){
            result += "#" + my_array[i];
        }
        else{
            result += "#" + my_array[i] + " ";
        }
    }
    return result;
}