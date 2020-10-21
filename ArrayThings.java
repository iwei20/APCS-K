public class ArrayThings {

    public static void main(String[] args) {
        int[][] twoDimensions = {
            {0, 1, 2},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3},
            {0},
            {0, 1}
        };
        System.out.println(arrayDeepToString(twoDimensions));
    }

    public static String arrayDeepToString(int[][] arr) {
        String result = "{";
        for(int i = 0; i < arr.length - 1; ++i) {
            result += arrToString(arr[i]) + ", ";
        }
        result += arrToString(arr[arr.length - 1]) + "}";
        return result;
    }

    public static String arrToString(int[] arr){
        if(arr.length == 0) return "{}";
        String result = "{";
        for(int i = 0; i < arr.length - 1; ++i) {
          result += arr[i] + ", ";
        }
        result += arr[arr.length - 1] + "}";
        return result;
    }

}
