public static String[] add_five(String[] arr) {
    String[] list;
    if(arr == null){
        list = new String[1];
        list[0] = "null5";
    }
    else{
        list = arr;
        for(int i=0; i<list.length; i++){
         list[i] += "5";   
        }
    }
    return list;
}