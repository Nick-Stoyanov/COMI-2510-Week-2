package sales;

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
class SalesTripTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(SalesTripTest.class.getName());
    SalesTrip trip = null;

    @BeforeEach
    /**
     * Create new sales trip each time the test is run
     */
    void setUp()
    {
        trip = new SalesTrip("destination city name", "from city name", 1, 1);
    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
        trip = null;
    }

    @Test
    /**
     * test for getDestinationCity
     */
    void getDestinationCity()
    {
        assertTrue(trip.getDestinationCity().contains("destination city name"));
        logger.debug("@test getDestinationCity " + trip.getDestinationCity());
    }

    @Test
    /**
     * test for setDestinationCity
     */
    void setDestinationCity()
    {
        trip.setDestinationCity("name");
        assertTrue(trip.getDestinationCity().contains("name"));
        logger.debug("@test test setDestinationCity() " + trip.getDestinationCity());
    }

    @Test
    /**
     * test for getFromCity
     */
    void getFromCity()
    {
        assertTrue(trip.getFromCity().contains("from city name"));
        logger.debug("@test getFromCity " + trip.getFromCity());
    }

    @Test
    /**
     * test for setFromCity
     */
    void setFromCity()
    {
        trip.setFromCity("name");
        assertTrue(trip.getFromCity().contains("name"));
        logger.debug("@test test setFromCity() " + trip.getFromCity());
    }

    @Test
    /**
     * test for getDistance
     */
    void getDistance()
    {
        assertEquals(1, trip.getDistance());
        logger.debug("@test test getDistance() " + trip.getDistance());
    }

    @Test
    /**
     * test for setDistance
     */
    void setDistance()
    {
        trip.setDistance(100);
        assertEquals(100, trip.getDistance());
        logger.debug("@test test setDistance " + trip.getDistance());

    }

    @Test
    /**
     * test for getDuration
     */
    void getDuration()
    {
        assertEquals(1, trip.getDuration());
        logger.debug("@test test getDuration " + trip.getDuration());
    }

    @Test
    /**
     * test for setDuration
     */
    void setDuration()
    {
        trip.setDuration(100);
        assertEquals(100, trip.getDuration());
        logger.debug("@test test setDuration " + trip.getDuration());
    }

    @Test
    /**
     * test for getKey
     */
    void getKey()
    {
        assertTrue(trip.getKey() > -1);
        logger.debug("@test test getKey " + trip.getKey());
    }

    @Test
    /**
     * test for setKey
     */
    void setKey()
    {
        trip.setKey(500);
        assertEquals(500, trip.getKey());
        logger.debug("@test test setKey() " + trip.getKey());
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
        String expected = "class week_2_project.sales.SalesTrip this.getFromCity()=from city name this.getDestinationCity()=destination city name this.getDistance()=1.0 this.getDuration()=1.0";
        String actual = this.trip.toString();
        assertTrue(actual.contains(expected));
        logger.debug("@test test toString() " + "\nexpected " + expected + "\nactual " +  actual);
    }
}