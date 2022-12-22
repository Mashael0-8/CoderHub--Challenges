public static String is_same(String name1, String name2) {
    // write your code here

    int result = 0;
    
    result = name1.compareTo(name2);
    
    if(result ==0)
        return "متشابهتين";
    else
        return "غير متشابهتين";
}