package gauge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test FuelGauge class
 */
class FuelGaugeTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(FuelGaugeTest.class.getName());

    FuelGauge gauge = null;

    /**
     * Create new gauge each time test runs
     */
    @BeforeEach
    void setUp()
    {
        gauge = new FuelGauge();
    }

    /**
     * Reset gauge when test is finished
     */
    @AfterEach
    void tearDown()
    {
        gauge = null;
    }

    /**
     * Test getCurrentAmount method
     */
    @Test
    void getCurrentAmount()
    {
        assertEquals(0, gauge.getCurrentAmount());
        logger.debug("@test test getCurrentAmount " + gauge.getCurrentAmount());
    }

    /**
     * Test setCurrentAmount method
     */
    @Test
    void setCurrentAmount()
    {
        gauge.setCurrentAmount(1);
        assertEquals(1, gauge.getCurrentAmount());
        logger.debug("@test test setCurrentAmount() " + gauge.getCurrentAmount());
    }

    /**
     * Test getKey method
     */
    @Test
    void getKey()
    {
        assertTrue(gauge.getKey() > -1);
        logger.debug("@test test getKey() " + gauge.getKey());
    }

    /**
     * Test setKey method
     */
    @Test
    void setKey()
    {
        gauge.setKey(100);
        assertEquals(100, gauge.getKey());
        logger.debug("@test test setKey() " + gauge.getKey());
    }

    /**
     * Test getMaximumAmount method
     */
    @Test
    void getMaximumAmount()
    {
        assertEquals(0, gauge.getMaximumAmount());
        logger.debug("@test test getMaximumAmount() " + gauge.getMaximumAmount());
    }

    /**
     * Test setMaximumAmount method
     */
    @Test
    void setMaximumAmount()
    {
        gauge.setMaximumAmount(100);
        assertEquals(100, gauge.getMaximumAmount());
        logger.debug("@test test setMaximumAmount " + gauge.getMaximumAmount());
    }

    /**
     * Test toString
     */
    @Test
    void testToString()
     {
        String expected = "class gauge.FuelGauge";
        logger.debug(expected);
        String actual = this.gauge.toString();
        logger.debug(actual);
        assertTrue(actual.contains(expected));
    }

}