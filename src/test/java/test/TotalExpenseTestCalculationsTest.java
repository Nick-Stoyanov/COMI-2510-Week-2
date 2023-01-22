package test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class TotalExpenseTestCalculationsTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTestCalculationsTest.class.getName());
    TotalExpenseTestCalculations totalCalc = null;
    @BeforeEach
    /**
     *
     */
    void setUp()
    {
        totalCalc = new TotalExpenseTestCalculations();
    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
    }

    @Test
    /**
     * test for calculateGrandTotals
     */
    void calculateGrandTotals()
    {
    }

    @Test
    /**
     * test for calculateTotals
     */
    void calculateTotals()
    {
    }

    @Test
    /**
     * test for getAutomobileTestData
     */
    void getAutomobileTestData()
    {
    }

    @Test
    /**
     * test for setAutomobileTestData
     */
    void setAutomobileTestData()
    {
    }

    @Test
    /**
     * test for getExpenseTestData
     */
    void getExpenseTestData()
    {
    }

    @Test
    /**
     * test for getSalesTripTestData
     */
    void getSalesTripTestData()
    {
    }

    @Test
    /**
     * test for setSalesTripTestData
     */
    void setSalesTripTestData()
    {
    }

    @Test
    /**
     * test for getTotalCostList
     */
    void getTotalCostList()
    {
    }

    @Test
    /**
     * test for setTotalCostList
     */
    void setTotalCostList()
    {
    }

    @Test
    /**
     * test for getTravelExpenseData
     */
    void getTravelExpenseData()
    {
    }

    @Test
    /**
     * test for setAutomobileExpenseTestData
     */
    void setAutomobileExpenseTestData()
    {
    }

    @Test
    /**
     * test for setTravelEntertainmentExpenseData
     */
    void setTravelEntertainmentExpenseData()
    {
    }

    @Test
    /**
     * test for getKey
     */
    void getKey()
    {
    }

    @Test
    /**
     * test for setKey
     */
    void setKey()
    {
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
        String expected = "";
        logger.debug("@test toString() expected: " + expected);
        String actual = totalCalc.toString();
        logger.debug("@test toString() expected: " + actual);
        assertTrue(actual.contains(expected));
    }
}