public static int getBiggestShared(int[] a, int[] b) {
    int result = 0;
    int temp =0;
    for(int i =0 ; i<a.length ; i++){
        for(int j = 0 ; j<b.length ; j++){
            if(a[i] == b[j]){
                temp = a[i];
                if(temp > result){
                    result = temp;
                }
            }
            }
        }
        return result;
}