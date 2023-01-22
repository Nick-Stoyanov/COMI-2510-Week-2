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
class TotalExpenseTestTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTestTest.class.getName());

    TotalExpenseTest test = null;

    @BeforeEach
    /**
     *
     */
    void setUp()
    {
        test = new TotalExpenseTest();

    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
        test = null;
    }

    @Test
    /**
     * test for main
     */
    void testMainNoArgs()
    {
    }
}
