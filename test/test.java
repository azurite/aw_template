import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class test extends testSetup {

    @Test
    public void testSample() throws FileNotFoundException {
        String inPath = "testCases/sample.in";
        String outPath = "testCases/sample.out";

        init(outPath);

        Main.read_and_solve(
                new FileInputStream(inPath),
                new PrintStream(out)
        );

        assertEquals(expected, out.toString().replace("\r", ""));
    }
}
