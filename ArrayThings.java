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
        if(arr.length == 0) return "{}";
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

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                result[i][j] = (int) Math.round(maxValue * Math.random());
            }
        }
        return result;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] result = new int[rows][];
        for(int i = 0; i < rows; ++i) {
            int[] randWidthRow = new int[(int) Math.round(maxValue * Math.random())];
            for(int j = 0; j < randWidthRow.length; ++j) {
                randWidthRow[j] = (int) Math.round(maxValue * Math.random());
            }
            result[i] = randWidthRow;
        }
        return result;
    }
}
