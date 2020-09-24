package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            if (e instanceof ArrayIndexOutOfBoundsException)
            	System.err.println("Not enough arguments input");
            else
            	System.err.println("Invalid character input");
            System.err.println("Please provide multiple integers to add");
        }
    }

    private static int addArguments(String[] args) {
    	int ret;
    	if (args[0].equals("-"))
    	{
    		ret = 0 - Integer.valueOf(args[1]) - Integer.valueOf(args[2]);
    		for (int i = 3; i < args.length; i ++) {
    			ret -= Integer.valueOf(args[i]);
    		}
    	}
    	else
    	{
    		ret = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    		for (int i = 2; i < args.length; i ++) {
    			ret += Integer.valueOf(args[i]);
    		}
    	}
        return ret;
    }
}
