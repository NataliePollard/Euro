import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EuroTest {

    private Euro tenEuro1;
    private Euro tenEuro2;

    @Before
    public void setUp() throws Exception {
        tenEuro1 = new Euro(10);
        tenEuro2 = new Euro(10);
    }

    @Test
    public void testThatSameEurosAreNotSame() throws Exception {
        assertNotSame(tenEuro1, tenEuro2);
    }

    @Test
    public void testThatSameEurosAreNotEqualWithEqualityOperator() throws Exception {
        assertFalse(tenEuro1 == tenEuro2);
    }

    @Test
    public void testThatSameEurosAreEqualWithAssertEquals() throws Exception {
        assertEquals(tenEuro1, tenEuro2);
    }

    @Test
    public void testThatDifferentEurosAreNotEqual() throws Exception {
        Euro fiveEuros = new Euro(5);
        assertNotEquals(fiveEuros, tenEuro2);
    }

    @Test
    public void testThatTenEurosIsNotEqualToNull() throws Exception {
        assertNotEquals(tenEuro2, null);
    }

    @Test
    public void testThatTenEurosIsNotEqualToObject() throws Exception {
        Object object = new Object();
        assertNotEquals(tenEuro2, object);
    }

    @Test
    public void testThatTenEurosIsEqualsToSumOfSevenEurosAndThreeEuros() throws Exception {
        Euro threeEuros = new Euro(3);
        Euro sevenEuros = new Euro(7);
        assertEquals(tenEuro2, threeEuros.add(sevenEuros));
    }

    @Test
    public void testThatTenEurosIsNotEqualsToSumOfFiveEurosAndTwoEuros() throws Exception {
        Euro fiveEuros = new Euro(5);
        Euro twoEuros = new Euro(2);
        assertNotEquals(tenEuro2, fiveEuros.add(twoEuros));
    }

    @Test
    public void testThatTenEurosIsNotEqualsToTenDollars() throws Exception {
        Dollar tenDollar = new Dollar(10);
        assertNotEquals(tenEuro2, tenDollar);
    }
}
