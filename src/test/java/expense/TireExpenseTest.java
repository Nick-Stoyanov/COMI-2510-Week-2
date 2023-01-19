package expense;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TireExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TireExpenseTest.class.getName());
    TireExpense expense = null;

    /**
     * Set up new expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        expense = new TireExpense(1, "name");
    }

    /**
     * Reset expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        expense = null;
    }

    /**
     * Test expense from constructor
     */
    @Test
    void testExpenseFromConstructor()
    {
        assertEquals(1, expense.getExpense());
        logger.debug("@test testExpenseFromConstructor " + expense.getExpense());
    }

    /**
     * Test name from Constructor
     */
    @Test
    void testNameFromConstructor()
    {
        assertTrue(expense.getName().contains("name"));
        logger.debug("@test testNameFromConstructor " + expense.getName());

    }
}