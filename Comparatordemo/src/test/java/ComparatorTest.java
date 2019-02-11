import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.jvm.hotspot.utilities.Assert;
@RunWith(Parameterized.class)
public class ComparatorTest {
    Markcompare m1;

    @Before
    public void setup() {
        System.out.println("Setup occurs");
        m1 = new Markcompare();
    }

    @Test
    public  void compare_should_return_a_equals_output() {
        System.out.println("comparing with name test");
        int i = m1.compare(88, 88);
        int i2 = m1.compare(90, 90);
        int i3 = m1.compare(78, 78);

        Assert.that(i == 0, "equal");
        Assert.that(i2 == 0, "equal");
        Assert.that(i3 == 0, "equal");
    }
    @Test
    public void compare_should_return_a_greater_output() {
        System.out.println("comparing with name test");
        int i = m1.compare(90, 88);
        int i2 = m1.compare(88,78 );
        int i3 = m1.compare(90, 78);

        Assert.that(i == 1, "greater");
        Assert.that(i2 == 1, "greater");
        Assert.that(i3 == 1, "greater");
    }
    @Test
    public void compare_should_return_a_lesser_output() {
        System.out.println("comparing with name test");
        int i = m1.compare(88, 90);
        int i2 = m1.compare(78, 88);
        int i3 = m1.compare(90, 78);

        Assert.that(i == -1, "lesser");
        Assert.that(i2 == -1, "lesser");
        Assert.that(i3 == -1, "lesser");
    }
}



