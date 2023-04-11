package metier;

import org.junit.Assert;
import org.junit.Test;

public class calculTest {
    private calcul c;
    @Test
    public void testsomme(){
        c=new calcul();
        double a=5; double b=9;
        double expected=14;
        double res=c.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
