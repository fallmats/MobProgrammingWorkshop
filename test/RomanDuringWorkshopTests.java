import org.junit.Assert;
import org.junit.Test;

public class RomanDuringWorkshopTests {

    @Test
    public void Return2BeforeRefactorShouldFail() {
        Assert.assertEquals("II","I");
    }

    @Test
    public void Return2() {
        myClass actual= new myClass();
        Assert.assertEquals("II", actual.romanSum("I", "I"));

    }

    @Test
    public void Return3() {
        myClass actual= new myClass();
        Assert.assertEquals("III", actual.romanSum("I", "II"));

    }
    @Test
    public void Return4() {
        myClass actual= new myClass();
        Assert.assertEquals("IV", actual.romanSum("II", "II"));

    }
    @Test
    public void Return5() {
        myClass actual= new myClass();
        Assert.assertEquals("V", actual.romanSum("I", "IV"));

    }
    @Test
    public void Return5on2plus3() {
        myClass actual= new myClass();
        Assert.assertEquals("V", actual.romanSum("II", "III"));

    }
    @Test
    public void Return7() {
        myClass actual= new myClass();
        Assert.assertEquals("VII", actual.romanSum("II", "V"));

    }
    @Test
    public void Return9() {
        myClass actual= new myClass();
        Assert.assertEquals("IX", actual.romanSum("IV", "V"));

    }
    @Test
    public void Return13() {
        myClass actual= new myClass();
        Assert.assertEquals("XIII", actual.romanSum("VI", "VII"));

    }

    @Test
    public void Return18() {
        myClass actual= new myClass();
        Assert.assertEquals("XVIII", actual.romanSum("IX", "IX"));
    }
    @Test
    public void Return34() {
        myClass actual= new myClass();
        Assert.assertEquals("XXXIV", actual.romanSum("XIX", "XV"));
    }
    @Test
    public void Return46() {
        myClass actual= new myClass();
        Assert.assertEquals("XLVI", actual.romanSum("XXII", "XXIV"));
    }

}


