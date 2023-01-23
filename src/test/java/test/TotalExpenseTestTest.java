package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test
 */
class TotalExpenseTestTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTestTest.class.getName());

    /**
     * test
     */
    TotalExpenseTest test = null;

    /**
     * constructor
     */
    public TotalExpenseTestTest()
    {
    }

    /**
     * set up
     */
    @BeforeEach
    void setUp()
    {
        test = new TotalExpenseTest();

    }

    /**
     * tear down
     */
    @AfterEach
    void tearDown()
    {
        test = null;
    }

    /**
     * test for main
     */
    @Test
    void testMainNoArgs()
    {
    }
}
