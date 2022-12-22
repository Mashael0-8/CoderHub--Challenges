public static String oct_to_hex(int octal_number) {
    // write your code here

    String octnum = String.valueOf(octal_number);
    int decnum = Integer.parseInt(octnum, 8);
    String hexnum = Integer.toHexString(decnum);
    hexnum = hexnum.toUpperCase();
    return hexnum;
}