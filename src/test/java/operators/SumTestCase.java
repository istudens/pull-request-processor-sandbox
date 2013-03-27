package operators;

import junit.framework.Assert;
import org.junit.Test;

public class SumTestCase {

    @Test
    public void testSum() {
        long sum = Sum.sum(1, 2);
        Assert.assertEquals(3, sum);
    }

}
