public static String[] namesSort(String[] namesArray, String order) {
    // write your code here

    if(order == "ASC")
        Arrays.sort(namesArray);
    else
        Arrays.sort(namesArray, Collections.reverseOrder());
    
    return namesArray;
}