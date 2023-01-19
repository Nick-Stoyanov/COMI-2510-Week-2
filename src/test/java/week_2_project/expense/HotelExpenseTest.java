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
class HotelExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(HotelExpenseTest.class.getName());
    HotelExpense hotelExpense = null;

    /**
     * Set up new hotel expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        hotelExpense = new HotelExpense(1, "name");
    }

    /**
     * Reset hotel expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        hotelExpense = null;
    }

    /**
     * Test expense from constructor
     */
    @Test
    void testExpenseFromConstructor()
    {
        assertEquals(1, hotelExpense.getExpense());
        logger.debug("@test testExpenseFromConstructor " + hotelExpense.getExpense());
    }

    /**
     * Test name from Constructor
     */
    @Test
    void testNameFromConstructor()
    {
        assertTrue(hotelExpense.getName().contains("name"));
        logger.debug("@test testNameFromConstructor " + hotelExpense.getName());
    }
}