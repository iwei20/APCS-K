public class Demo {
    public static void main(String[] args){
        if(args.length > 0) {
            printLoop(Integer.parseInt(args[0]));
        } else {
            printLoop(5);
        }

    }

    public static void printLoop(int n){
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n - i; ++j){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
