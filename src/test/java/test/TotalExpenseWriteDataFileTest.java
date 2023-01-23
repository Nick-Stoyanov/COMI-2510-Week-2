package test;

import expense.TotalExpense;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test
 */
class TotalExpenseWriteDataFileTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseWriteDataFileTest.class.getName());

    /**
     * Data
     */
    TotalExpenseWriteDataFile data = null;

    /**
     * Constructor
     */
    public TotalExpenseWriteDataFileTest()
    {
    }

    /**
     * set up
     */
    @BeforeEach
    void setUp()
    {
        data = new TotalExpenseWriteDataFile();
    }

    /**
     * tear down
     */
    @AfterEach
    void tearDown()
    {
        data = null;
    }

    /**
     * test for addTotalExpense
     */
    @Test
    void addTotalExpense()
    {
        TotalExpense test = new TotalExpense("name");
        test.addFourTires(1);
        test.addFuelCost(1);
        test.addOilChange(1);
        test.addFoodCost(1);
        test.addHotelCost(1);
        data.addTotalExpense(test);


    }

    /**
     * test for addTotalExpenseHeading
     */
    @Test
    void addTotalExpenseHeading()
    {

    }

    /**
     * test for getDataList
     */
    @Test
    void getDataList()
    {
    }

    /**
     * test for setDataList
     */
    @Test
    void setDataList()
    {
    }

    /**
     * test for getFileNamePrefix
     */
    @Test
    void getFileNamePrefix()
    {
    }

    /**
     * test for getFileNameSuffix
     */
    @Test
    void getFileNameSuffix()
    {
    }

    /**
     * test for getFilePath
     */
    @Test
    void getFilePath()
    {
    }

    /**
     * test for useNameUnique
     */
    @Test
    void useNameUnique()
    {
    }

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "";
        logger.debug("@test toString() expected: " + expected);
        String actual = data.toString();
        logger.debug("@test toString() expected: " + actual);
        assertTrue(actual.contains(expected));
    }
}