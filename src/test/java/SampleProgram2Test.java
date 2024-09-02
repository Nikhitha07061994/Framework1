import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleProgram2Test {
    SampleProgram2 sampleProgram2 = new SampleProgram2();
    @Test(enabled = false)
    public void mulTest(){
        Assert.assertEquals(sampleProgram2.Mul(5,6),30);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sampleProgram2.Mul(10,6),60,"sum failed");
        softAssert.assertEquals(sampleProgram2.Mul(10,6),60);
        System.out.println("End1");
        softAssert.assertAll();
    }
    @Test(enabled = false)
    public void divTest(){
        Assert.assertEquals(sampleProgram2.Div(6,2),3);

    }
}
