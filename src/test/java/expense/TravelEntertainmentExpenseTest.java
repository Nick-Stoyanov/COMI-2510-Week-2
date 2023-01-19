package expense;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class TravelEntertainmentExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TravelEntertainmentExpenseTest.class.getName());

    TravelEntertainmentExpense expense = null;

    /**
     * Create new expense with each test run
     */
    @BeforeEach
    void setUp()
    {
        expense = new TravelEntertainmentExpense("name", 1, 1);
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
     * Test getFood method
     */
    @Test
    void getFood()
    {
        assertTrue(expense.getFood() instanceof FoodExpense);
        logger.debug("@test test getFood() " + expense.getFood().toString());
    }

    /**
     * Test getFoodExpense method
     */
    @Test
    void getFoodExpense()
    {
        assertEquals(1, expense.getFoodExpense());
        logger.debug("@test test getFoodExpense " + expense.getFoodExpense());
    }

    /**
     * Test getHotel method
     */
    @Test
    void getHotel()
    {
        assertTrue(expense.getHotel() instanceof HotelExpense);
        logger.debug("@test test getHotel() " + expense.getHotel().toString());
    }

    /**
     * Test getHotelExpense method
     */
    @Test
    void getHotelExpense()
    {
        assertEquals(1, expense.getHotelExpense());
        logger.debug("@test test getHotelexpense " + expense.getHotelExpense());
    }

    /**
     * Test setFood method by testing the name
     */
    @Test
    void setFoodName()
    {
        FoodExpense food = new FoodExpense(1, "food");
        expense.setFood(food);
        assertTrue(expense.getFood().getName().contains("food"));
        logger.debug("@test test setFood " + expense.getFood().getName());
    }

    /**
     * Test setFood method by testing the expense
     */
    @Test
    void setFoodExpense()
    {
        FoodExpense food = new FoodExpense(1, "food");
        expense.setFood(food);
        assertEquals(1, expense.getFood().getExpense());
        logger.debug("@test test setFood " + expense.getFood().getExpense());
    }


    /**
     * Test setHotel method by testing the name
     */
    @Test
    void setHotelName()
    {
        HotelExpense hotel = new HotelExpense(1, "hotel");
        expense.setHotel(hotel);
        assertTrue(expense.getHotel().getName().contains("hotel"));
        logger.debug("@test test setHotel " + expense.getHotel().getName());
    }

    /**
     * Test setHotel method by testing the expense
     */
    @Test
    void setHotelExpense()
    {
        HotelExpense hotel = new HotelExpense(1, "hotel");
        expense.setHotel(hotel);
        assertEquals(1, expense.getHotel().getExpense());
        logger.debug("@test test setHotel " + expense.getHotel().getExpense());
    }

    /**
     * test toString
     */
    @Test
    void testToString()
    {
        assertFalse(this.expense.toString().isEmpty());
    }
}