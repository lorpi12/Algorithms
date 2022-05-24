import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AlgorithmsTest {

    @DataProvider
    public Object[][] test1Data() {
        return new Object[][]{
                {5, "101"},
                {0, "0"},
                {10, "1010"},
                {7, "111"},
                {1, "1"},
                {25, "11001"}
        };
    }

    @DataProvider
    public Object[][] test2Data() {
        return new Object[][]{
                {5, 10},
                {5, 5},
                {10, 5},
                {0, 0},
                {-1, 5},
                {5, -1},
                {-1, -1}
        };
    }

    @DataProvider
    public Object[][] test3Data() {
        return new Object[][]{
                {5, 10, 10},
                {-2, 2, 2},
                {2, -2, 2},
                {0, 2, 2},
                {0, -3, 0},
                {0, 0, 0},
                {3, 3, 3}
        };
    }

    @DataProvider
    public Object[][] test4Data() {
        return new Object[][]{
                {"asdfgh", "hgasdf", true},
                {"asdfgh", "hgasdfa", false},
                {"asdfgh", "qwerty", false},
                {"asdfgh", "asdfgh", true}
        };
    }

    @DataProvider
    public Object[][] test5Data() {
        return new Object[][]{
                {"This is a test", "This is a test"},
                {"This is another test", "This is rehtona test"},
                {"Test", "Test"},
                {" ", " "},
                {" Test", " Test"},
                {"Test  Test", "Test  Test"},
                {"testi", "itset"},
                {"testi Test", "itset Test"},
                {"Test  Test  Testik", "Test  Test  kitseT"},
                {"qwerty ", "ytrewq "},
                {"qwerty q", "ytrewq q"}
        };
    }


    @Test(dataProvider = "test1Data")
    public void test1(int num, String expected) {
        Assert.assertEquals(Algorithms.tobinary(num), expected, "Позитивный тест не выполняется");
    }

    @Test(dataProvider = "test2Data")
    public void test2(int firstNum, int secondNum) {
        Assert.assertEquals(Algorithms.swap(firstNum, secondNum), new int[]{secondNum, firstNum}, "Позитивный тест не выполняется");
    }

    @Test(dataProvider = "test3Data")
    public void test3(int firstNum, int secondNum, int expected) {
        Assert.assertEquals(Algorithms.maxNum(firstNum, secondNum), expected, "Позитивный тест не выполняется");
    }

    @Test(dataProvider = "test4Data")
    public void test4(String firstString, String secondString, boolean expected) {
        Assert.assertEquals(Algorithms.entryString(firstString, secondString), expected, "Позитивный тест не выполняется");
    }

    @Test(dataProvider = "test5Data")
    public void test5(String string, String expected) {
        Assert.assertEquals(Algorithms.rollString(string), expected, "Позитивный тест не выполняется");
    }


}
