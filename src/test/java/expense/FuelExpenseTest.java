package expense;

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
class FuelExpenseTest
{
    /**
     * constructor
     */
    public FuelExpenseTest()
    {
    }

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(FuelExpenseTest.class.getName());
    /**
     * fuel
     */
    FuelExpense fuelExpense = null;

    /**
     * Set up new fuel expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        fuelExpense = new FuelExpense(1, "name");
    }

    /**
     * Reset fuel expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        fuelExpense = null;
    }

    /**
     * Test expense from constructor
     */
    @Test
    void testExpenseFromConstructor()
    {
        assertEquals(1, fuelExpense.getExpense());
        logger.debug("@test testExpenseFromConstructor " + fuelExpense.getExpense());
    }

    /**
     * Test name from Constructor
     */
    @Test
    void testNameFromConstructor()
    {
        assertTrue(fuelExpense.getName().contains("name"));
        logger.debug("@test testNameFromConstructor " + fuelExpense.getName());

    }
}