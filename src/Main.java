import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static boolean DEBUG=false;
    
    public static void debug(String m) {
        if(DEBUG)
            System.out.printf("[Debug] %s\n", m); 
    }
    
    public static void read_and_solve(InputStream in, PrintStream out) {
        Scanner s = new Scanner(in);
    }

    public static void main(String[] args) {
        read_and_solve(System.in, System.out);
    }
}
