public static int GreatestElement(int[] arr){
    Arrays.sort(arr);
    int len = arr.length;
    return arr[len - 1];
 };
