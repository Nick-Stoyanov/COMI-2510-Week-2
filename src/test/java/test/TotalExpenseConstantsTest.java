package test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Test
 */
class TotalExpenseConstantsTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseConstantsTest.class.getName());
    /**
     * expense
     */
    TotalExpenseConstants totalExpense = null;

    /**
     * constructor
     */
    public TotalExpenseConstantsTest()
    {
    }

    /**
     * Set up
     */
    @BeforeEach
    void setUp()
    {
        totalExpense = new TotalExpenseConstants();
    }

    /**
     * Tear down
     */
    @AfterEach
    void tearDown()
    {
        totalExpense = null;
    }

    /**
     * test for getInputFileName
     */
    @Test
    void getInputFileName()
    {

        assertFalse(TotalExpenseConstants.getInputFileName().isEmpty());
        logger.debug("@test getInputFileName" + TotalExpenseConstants.getInputFileName());
    }

    /**
     * test for getOutputFileNamePrefix
     */
    @Test
    void getOutputFileNamePrefix()
    {
        assertFalse(TotalExpenseConstants.getOutputFileNamePrefix().isEmpty());
    }

    /**
     * test for getOutputFileNameSuffix
     */
    @Test
    void getOutputFileNameSuffix()
    {
        assertFalse(TotalExpenseConstants.getOutputFileNameSuffix().isEmpty());
    }

    /**
     * test for getOutputFilePath
     */
    @Test
    void getOutputFilePath()
    {
        assertFalse(TotalExpenseConstants.getOutputFilePath().isEmpty());
        logger.debug("@test getInputFileName" + TotalExpenseConstants.getOutputFilePath());
    }
}