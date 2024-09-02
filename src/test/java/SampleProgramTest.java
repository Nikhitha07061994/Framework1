import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleProgramTest {
    SampleProgram sampleProgram = new SampleProgram();
    @Test
    public void sumTest(){
        Assert.assertEquals(sampleProgram.Sum(5,6),11);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sampleProgram.Sum(10,1),11,"sum failed");
        softAssert.assertEquals(sampleProgram.Sum(10,6),16);
        System.out.println("End");
        softAssert.assertAll();
    }
    @Test
    public void diffTest(){
        Assert.assertEquals(sampleProgram.diff(5,6),-1);

    }
}
