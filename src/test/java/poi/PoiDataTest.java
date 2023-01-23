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

    /**
     * data
     */
    PoiData data = null;
    /**
     * data str
     */
    PoiData dataWithString = null;

    /**
     * constructor
     */
    public PoiDataTest()
    {
    }

    /**
     * Create new two PoiData (one with Double and one with String) every time test is run
     */
    @BeforeEach
    void setUp()
    {
        data = new PoiData(1, 1, 1);
        dataWithString = new PoiData(1, 1, "testString");
    }

    /**
     * Reset PoiData's after test is finished
     */
    @AfterEach
    void tearDown()
    {
        data = null;
        dataWithString = null;
    }

    /**
     * test for getColumnNumber
     */
    @Test
    void getColumnNumber()
    {
        assertEquals(1, data.getColumnNumber());
        logger.debug("@test test getColumnNumber(): " + data.getColumnNumber());

    }

    /**
     * test for setColumnNumber
     */
    @Test
    void setColumnNumber()
    {
        data.setColumnNumber(123);
        assertEquals(123, data.getColumnNumber());
        logger.debug("@test test setColumnNumber(): " + data.getColumnNumber());
    }

    /**
     * test for getRowNumber
     */
    @Test
    void getRowNumber()
    {
        assertEquals(1, data.getRowNumber());
        logger.debug("@test test getColumnNumber(): " + data.getRowNumber());
    }

    /**
     * test for setRowNumber
     */
    @Test
    void setRowNumber()
    {
        data.setRowNumber(1234);
        assertEquals(1234, data.getRowNumber());
        logger.debug("@test test setColumnNumber(): " + data.getRowNumber());
    }

    /**
     * test for getValue
     */
    @Test
    void getValue()
    {
        assertTrue(data.getValue() instanceof Object);
        logger.debug("@test test getValue(): " + data.getValue().toString());
    }

    /**
     * test for setValue
     */
    @Test
    void setValue()
    {
        data.setValue("test value");
        assertTrue(data.getValue().toString().contains("test value"));
        logger.debug("@test test setValue: " + data.getValue().toString());

    }

    /**
     * test for testToString
     */
    @Test
    void testToStringWithDouble()
    {
        String expected = "this.getRowNumber()= 1 this.getColumnNumber()= 1 this.getValue()= 1.0";
        String actual = this.data.toString();
        assertTrue(actual.contains(expected));
        logger.debug(this.data.toString());
    }

    /**
     * test for testToString
     */
    @Test
    void testToStringWithString()
    {
        String expected = "this.getRowNumber()= 1 this.getColumnNumber()= 1 this.getValue()= testString";
        String actual = this.dataWithString.toString();
        assertTrue(actual.contains(expected));
        logger.debug("@test test toStringWithString(): " + "\nexpected: " + expected + "\nactual: " + actual);
    }
}