package test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class TotalExpenseWriteDataFileTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseWriteDataFileTest.class.getName());

    TotalExpenseWriteDataFile data = null;

    @BeforeEach
    /**
     *
     */
    void setUp()
    {
        data = new TotalExpenseWriteDataFile();
    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
        data = null;
    }

    @Test
    /**
     * test for addTotalExpense
     */
    void addTotalExpense()
    {
    }

    @Test
    /**
     * test for addTotalExpenseHeading
     */
    void addTotalExpenseHeading()
    {
    }

    @Test
    /**
     * test for getDataList
     */
    void getDataList()
    {
    }

    @Test
    /**
     * test for setDataList
     */
    void setDataList()
    {
    }

    @Test
    /**
     * test for getFileNamePrefix
     */
    void getFileNamePrefix()
    {
    }

    @Test
    /**
     * test for getFileNameSuffix
     */
    void getFileNameSuffix()
    {
    }

    @Test
    /**
     * test for getFilePath
     */
    void getFilePath()
    {
    }

    @Test
    /**
     * test for useNameUnique
     */
    void useNameUnique()
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
        String actual = data.toString();
        logger.debug("@test toString() expected: " + actual);
        assertTrue(actual.contains(expected));
    }
}