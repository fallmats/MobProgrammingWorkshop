import org.junit.Assert;
import org.junit.Test;

public class RomanSumReconstructedWaypointsTests {

    @Test
    public void return2() {
        myClass actual= new myClass();
        Assert.assertEquals("II", actual.sumOfII("I","I"));
    }

    @Test
    public void return3() {
        myClass actual= new myClass();
        Assert.assertEquals("III", actual.sumOfII("II","I"));
    }

    @Test
    public void return4() {
        myClass actual= new myClass();
        Assert.assertEquals("IV", actual.sumOfV("I","III"));
    }

    @Test
    public void return5() {
        myClass actual= new myClass();
        Assert.assertEquals("V", actual.sumOfV("II","III"));
    }

    @Test
    public void return5_2() {
        myClass actual= new myClass();
        Assert.assertEquals("V", actual.sumOfV("I","IV"));
    }

}
