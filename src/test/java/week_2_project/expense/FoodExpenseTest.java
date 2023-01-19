package week_2_project.expense;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test
 */
class FoodExpenseTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(FoodExpenseTest.class.getName());
    FoodExpense foodExpense = null;

    /**
     * Set up new food expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        foodExpense = new FoodExpense(1, "name");
    }

    /**
     * Reset food expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        foodExpense = null;
    }

    /**
     * Test expense from constructor
     */
    @Test
    void testExpenseFromConstructor()
    {
        assertEquals(1, foodExpense.getExpense());
        logger.debug("@test testExpenseFromConstructor " + foodExpense.getExpense());
    }

    /**
     * Test name from constructor
     */
    @Test
    void testNameFromConstructor()
    {
        assertTrue(foodExpense.getName().contains("name"));
        logger.debug("@test testNameFromConstructor " + foodExpense.getName());

    }
}