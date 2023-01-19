package poi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test
 */
class PoiDataTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiDataTest.class.getName());

    PoiData data = null;
    PoiData dataWithString = null;

    @BeforeEach
    /**
     * Create new two PoiData (one with Double and one with String) every time test is run
     */
    void setUp()
    {
        data = new PoiData(1, 1, 1);
        dataWithString = new PoiData(1, 1, "testString");
    }

    @AfterEach
    /**
     * Reset PoiData's after test is finished
     */
    void tearDown()
    {
        data = null;
        dataWithString = null;
    }

    @Test
    /**
     * test for getColumnNumber
     */
    void getColumnNumber()
    {
        assertEquals(1, data.getColumnNumber());
        logger.debug("@test test getColumnNumber(): " + data.getColumnNumber());

    }

    @Test
    /**
     * test for setColumnNumber
     */
    void setColumnNumber()
    {
        data.setColumnNumber(123);
        assertEquals(123, data.getColumnNumber());
        logger.debug("@test test setColumnNumber(): " + data.getColumnNumber());
    }

    @Test
    /**
     * test for getRowNumber
     */
    void getRowNumber()
    {
        assertEquals(1, data.getRowNumber());
        logger.debug("@test test getColumnNumber(): " + data.getRowNumber());
    }

    @Test
    /**
     * test for setRowNumber
     */
    void setRowNumber()
    {
        data.setRowNumber(1234);
        assertEquals(1234, data.getRowNumber());
        logger.debug("@test test setColumnNumber(): " + data.getRowNumber());
    }

    @Test
    /**
     * test for getValue
     */
    void getValue()
    {
        assertTrue(data.getValue() instanceof Object);
        logger.debug("@test test getValue(): " + data.getValue().toString());
    }

    @Test
    /**
     * test for setValue
     */
    void setValue()
    {
        data.setValue("test value");
        assertTrue(data.getValue().toString().contains("test value"));
        logger.debug("@test test setValue: " + data.getValue().toString());

    }

    @Test
    /**
     * test for testToString
     */
    void testToStringWithDouble()
    {
        String expected = "this.getRowNumber()= 1 this.getColumnNumber()= 1 this.getValue()= 1.0";
        String actual = this.data.toString();
        assertTrue(actual.contains(expected));
        logger.debug(this.data.toString());
    }

    @Test
    /**
     * test for testToString
     */
    void testToStringWithString()
    {
        String expected = "this.getRowNumber()= 1 this.getColumnNumber()= 1 this.getValue()= testString";
        String actual = this.dataWithString.toString();
        assertTrue(actual.contains(expected));
        logger.debug("@test test toStringWithString(): " +"\nexpected: " + expected + "\nactual: " + actual);
    }
}