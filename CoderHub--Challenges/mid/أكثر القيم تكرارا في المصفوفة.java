public static int most_frequent_element(int[] arr) {
    // write your code here

        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;
 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
                curr_count = 1;
 
            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }
        return res;
}
Footer
© 2022 GitHub, I