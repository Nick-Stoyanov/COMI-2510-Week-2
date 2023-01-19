package week_2_project.expense;

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
class OilExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(OilExpenseTest.class.getName());
    OilExpense oilExpense = null;

    /**
     * Set up new oil expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        oilExpense = new OilExpense(1, "name");
    }

    /**
     * Reset oil expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        oilExpense = null;
    }

    /**
     * Test expense from constructor
     */
    @Test
    void testExpenseFromConstructor()
    {
        assertEquals(1, oilExpense.getExpense());
        logger.debug("@test testExpenseFromConstructor " + oilExpense.getExpense());
    }

    /**
     * Test name from Constructor
     */
    @Test
    void testNameFromConstructor()
    {
        assertTrue(oilExpense.getName().contains("name"));
        logger.debug("@test testNameFromConstructor " + oilExpense.getName());
    }

}