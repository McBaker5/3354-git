package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide multiple integers to add");
        }
    }

    private static int addArguments(String[] args) {
    	int ret = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    	for (int i = 2; i < args.length; i ++) {
    		ret += Integer.valueOf(args[i]);
    	}
        return ret;
    }
}
