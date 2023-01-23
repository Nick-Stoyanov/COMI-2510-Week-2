package expense;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test
 */
class ExpenseHelperTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(ExpenseHelperTest.class.getName());
    /**
     * expense
     */
    ExpenseHelper expenseHelper = new ExpenseHelper();

    /**
     * constructor
     */
    public ExpenseHelperTest()
    {
    }

    /**
     * Test get food costs method
     */
    @Test
    void getFoodCosts()
    {

        assertEquals(2, expenseHelper.getFoodCosts(1, 1, 2));
        logger.debug("@test- test getFoodCost() expected 2.0: " + expenseHelper.getFoodCosts(1, 1, 2));

    }

    /**
     * Test get fuel costs method
     */
    @Test
    void getFuelCosts()
    {
        assertEquals(2, expenseHelper.getFuelCosts(1, 1, 2));
        logger.debug("@test- test getFuelCost() expected 2.0: " + expenseHelper.getFuelCosts(1, 1, 2));

    }

    /**
     * Test get hotel costs method
     */
    @Test
    void getHotelCosts()
    {
        assertEquals(2, expenseHelper.getHotelCosts(1, 1, 2));
        logger.debug("@test- test getHotelCost() expected 2.0: " + expenseHelper.getHotelCosts(1, 1, 2));

    }

    /**
     * Test get oil costs method
     */
    @Test
    void getOilCosts()
    {
        assertEquals(2, expenseHelper.getOilCosts(1, 1, 2));
        logger.debug("@test- test getOilCost() expected 2.0: " + expenseHelper.getOilCosts(1, 1, 2));

    }

    /**
     * test get tire costs method
     */
    @Test
    void getTireCosts()
    {
        assertEquals(2, expenseHelper.getTireCosts(1, 1, 2));
        logger.debug("@test- test getTireCost() expected 2.0: " + expenseHelper.getTireCosts(1, 1, 2));


    }
}