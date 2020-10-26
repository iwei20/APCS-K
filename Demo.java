public class Demo {
    public static void main(String[] args) {
        if(args.length > 0) {
            printLoop(Integer.parseInt(args[0]));
        } else {
            printLoop(5);
        }
    }

    public static String arrayDeepToString(int[][] arr) {
        if(arr.length == 0) {
            return "{}";
        }

        String result = "{";
        for(int i = 0; i < arr.length - 1; ++i) {
            result += arrToString(arr[i]) + ", ";
        }
        result += arrToString(arr[arr.length - 1]) + "}";

        return result;
    }

    public static String arrToString(int[] arr) {
        if(arr.length == 0) {
            return "{}";
        }

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
                result[i][j] = (int) ((maxValue + 1) * Math.random());
            }
        }

        return result;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] result = new int[rows][];

        for(int i = 0; i < rows; ++i) {

            int[] randWidthRow = new int[(int) ((cols + 1) * Math.random())];
            for(int j = 0; j < randWidthRow.length; ++j) {
                randWidthRow[j] = (int) ((maxValue + 1) * Math.random());
            }
            result[i] = randWidthRow;

        }
        
        return result;
    }

    public static void printLoop(int n) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n - i; ++j) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
