package dashboard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import gauge.Gauge;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Automobile class
 */
class AutomobileTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(AutomobileTest.class.getName());

    Automobile automobile = null;

    /**
     * Create new automobile every time test is run
     */
    @BeforeEach
    void setUp()
    {
        automobile = new Automobile("car");
    }


    /**
     * Reset automobile when test is finished
     */
    @AfterEach
    void tearDown()
    {
        automobile = null;
    }

    /**
     * Constructor for JavaDoc
     */
    public AutomobileTest()
    {
        super();
    }


    /**
     * Test the setMpg method by passing 10 as test value
     */
    @Test
    void setMpg()
    {
        automobile.setMpg(1);
        logger.debug("@test- test setMpg() " + automobile.getMpg());
        assertEquals(1, automobile.getMpg());
    }

    /**
     * Test get gauge list method
     */
    @Test
    void getGaugeList()
    {
        logger.debug("@test- testGetGaugeList() " + automobile.getGaugeList().toString());
        assertTrue(automobile.getGaugeList() instanceof ArrayList<Gauge>);
    }

    /**
     * Test get fuel gauge method
     */
    @Test
    void getFuelGauge()
    {
        logger.debug("@test - testGetFuelGauge() " + automobile.getFuelGauge().toString());
        assertTrue(automobile.getFuelGauge() instanceof Gauge);
    }

    /**
     * Test get oil gauge method
     */
    @Test
    void getOilGauge()
    {
        logger.debug("@test - testGetOilGauge() " + automobile.getOilGauge().toString());
        assertTrue(automobile.getOilGauge() instanceof Gauge);
    }

    /**
     * Test get tire gauge method
     */
    @Test
    void getTireGauge()
    {
        logger.debug("@test - testGetTireGauge() " + automobile.getTireGauge().toString());
        assertTrue(automobile.getTireGauge() instanceof Gauge);
    }

    /**
     * Test set fuel gauge method maximum amount
     */
    @Test
    void setFuelGaugeMaximum()
    {
        automobile.setFuelGauge(1, 1);
        logger.debug("@test- testSetFuelGauge max " + automobile.getFuelGauge().getMaximumAmount());
        assertEquals(1, automobile.getFuelGauge().getMaximumAmount());
    }

    /**
     * Test set fuel gauge method current amount
     */
    @Test
    void setFuelGaugeCurrent()
    {
        automobile.setFuelGauge(1, 1);
        logger.debug("@test- testSetFuelGauge current " + automobile.getFuelGauge().getCurrentAmount());
        assertEquals(1, automobile.getFuelGauge().getCurrentAmount());

    }

    /**
     * Test set oil gauge method maximum
     */
    @Test
    void setOilGaugeMaximum()
    {
        automobile.setOilGauge(1, 1);
        logger.debug("@test- testSetOilGauge max " + automobile.getOilGauge().getMaximumAmount());
        assertEquals(1, automobile.getOilGauge().getMaximumAmount());
    }

    /**
     * Test set oil gauge method current
     */
    @Test
    void setOilGaugeCurrent()
    {
        automobile.setOilGauge(1, 1);
        logger.debug("@test- testSetOilGauge current " + automobile.getOilGauge().getCurrentAmount());
        assertEquals(1, automobile.getOilGauge().getCurrentAmount());

    }

    /**
     * Test set tire gauge method
     */
    @Test
    void setTireGaugeMaximum()
    {
        automobile.setTireGauge(1, 1);
        logger.debug("@test- testSetTireGauge max " + automobile.getTireGauge().getMaximumAmount());
        assertEquals(1, automobile.getTireGauge().getMaximumAmount());
    }

    /**
     * Test set tire gauge method
     */
    @Test
    void setTireGaugeCurrent()
    {
        automobile.setTireGauge(1, 1);
        logger.debug("@test- testSetTireGauge current " + automobile.getTireGauge().getCurrentAmount());
        assertEquals(1, automobile.getTireGauge().getCurrentAmount());

    }

    /**
     * Test get key method
     */
    @Test
    void getKey()
    {
        logger.debug("@test- testGetKey " + automobile.getKey());
        assertTrue(automobile.getKey() > -1);
    }

    /**
     * Test set key method
     */
    @Test
    void setKey()
    {
        automobile.setKey(22);
        logger.debug("@test- testSetKey " + automobile.getKey());
        assertEquals(22, automobile.getKey());
    }

    /**
     * Test get mpg
     */
    @Test
    void getMpg()
    {
        logger.debug("@test- testGetMpg " + automobile.getMpg());
        assertTrue(automobile.getMpg() > -1);
    }

    /**
     * Test get name method
     */
    @Test
    void getName()
    {
        logger.debug("@test- testGetName " + automobile.getName());
        assertTrue(automobile.getName() instanceof String);
    }

    /**
     * Test set name method
     */
    @Test
    void setName()
    {
        automobile.setName("testName");
        logger.debug("@test- testSetName " + automobile.getName());
        assertTrue(automobile.getName().contains("testName"));
    }

    /**
     * Test to string if empty (there probably is a better way to do this)
     */
    @Test
    void testToString()
    {
        logger.debug("@test- testToString " + automobile.toString());
        assertFalse(this.automobile.toString().isEmpty());
    }
}