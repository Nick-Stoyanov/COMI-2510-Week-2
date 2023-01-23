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
class TotalExpenseConstantsTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseConstantsTest.class.getName());
    TotalExpenseConstants totalExpense = null;

    @BeforeEach
    /**
     * Set up
     */
    void setUp()
    {
        totalExpense = new TotalExpenseConstants();
    }

    @AfterEach
    /**
     * Tear down
     */
    void tearDown()
    {
        totalExpense = null;
    }

    @Test
    /**
     * test for getInputFileName
     */
    void getInputFileName()
    {

        assertFalse(TotalExpenseConstants.getInputFileName().isEmpty());
        logger.debug("@test getInputFileName" + TotalExpenseConstants.getInputFileName());
    }

    @Test
    /**
     * test for getOutputFileNamePrefix
     */
    void getOutputFileNamePrefix()
    {
        assertFalse(TotalExpenseConstants.getOutputFileNamePrefix().isEmpty());
    }

    @Test
    /**
     * test for getOutputFileNameSuffix
     */
    void getOutputFileNameSuffix()
    {
        assertFalse(TotalExpenseConstants.getOutputFileNameSuffix().isEmpty());
    }

    @Test
    /**
     * test for getOutputFilePath
     */
    void getOutputFilePath()
    {
        assertFalse(TotalExpenseConstants.getOutputFilePath().isEmpty());
        logger.debug("@test getInputFileName" + TotalExpenseConstants.getOutputFilePath());
    }
}