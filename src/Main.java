import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        List<String> suites = Lists.newArrayList();
        suites.add("./suites/testng.xml");
        testNG.setTestSuites(suites);

        testNG.run();

        // Commit 1
    }
}
