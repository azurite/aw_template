# A&W Programming Exercise Template

[![build](https://api.travis-ci.org/MarkoN95/aw_template.svg?branch=master)](https://travis-ci.org/MarkoN95/aw_template)

## Features

- **IntelliJ config files** adjusted for ETH judge (Runtime 1.6)

- **Easy setup**: just unpack your `input.zip` and `output.zip` archives from `cadmo.ethz.ch` in the `testCases` folder and you're good to go

- **Structure for test files**: pre-written JUnit tests for given `.in` and `.out` testcases

- **Easy-to-use interface** consisting of often used code (see `Main.java`)

## Example

**`test.java`**: Sample JUnit test for test files `sample.in` and `sample.out`. Repeat this for every pair of test files.

```java
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
```
