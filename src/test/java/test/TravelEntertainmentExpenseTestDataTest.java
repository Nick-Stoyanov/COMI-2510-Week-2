package test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test
 */
class TravelEntertainmentExpenseTestDataTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TravelEntertainmentExpenseTestDataTest.class.getName());
    TravelEntertainmentExpenseTestData data = null;

    @BeforeEach
    /**
     *
     */
    void setUp()
    {
        data = new TravelEntertainmentExpenseTestData(false);
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
     * test for getFoodExpense
     */
    void getFoodExpense()
    {
    }

    @Test
    /**
     * test for getHotelExpense
     */
    void getHotelExpense()
    {
    }

    @Test
    /**
     * test for getTestDataList
     */
    void getTestDataList()
    {
    }

    @Test
    /**
     * test for setTestDataList
     */
    void setTestDataList()
    {
    }

    @Test
    /**
     * test for handlePoiDataRowResults
     */
    void handlePoiDataRowResults()
    {
    }

    @Test
    /**
     * test for getWorksheetNumber
     */
    void getWorksheetNumber()
    {
    }

    @Test
    /**
     * test for stageWithFixedData
     */
    void stageWithFixedData()
    {
    }

    @Test
    /**
     * test for getFileName
     */
    void getFileName()
    {
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
        String expected = "TravelEntertainmentExpenseTestData{testDataList=[class expense";
        logger.debug("@test toString() expected: " + expected);
        String actual = this.data.toString();
        logger.debug("@test toString() actual: " + actual);
        assertTrue(actual.contains(expected));

    }
}