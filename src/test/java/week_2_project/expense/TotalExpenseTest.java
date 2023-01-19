package week_2_project.expense;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class TotalExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTest.class.getName());

    /**
     * Constructor for Javadoc
     */
    public TotalExpenseTest()
    {
        super();
    }

    TotalExpense totalExpense = null;

    /**
     * Set up expense with each run of the test
     */
    @BeforeEach
    void setUp()
    {
        totalExpense = new TotalExpense("name");
    }

    /**
     * Reset expense to null after test is finished
     */
    @AfterEach
    void tearDown()
    {
        totalExpense = null;
    }

    /**
     * Test addFoodCost method
     */
    @Test
    void addFoodCost()
    {
        totalExpense.addFoodCost(1);
        assertEquals(1, totalExpense.getFoodCost());
        logger.debug("@test test addFoodCost() " + totalExpense.getFoodCost());
    }

    /**
     * Test addFourTires method
     */
    @Test
    void addFourTires()
    {
        totalExpense.addFourTires(1);
        assertEquals(1, totalExpense.getFourTires());
        logger.debug("@test test addFourTires" + totalExpense.getFourTires());
    }

    /**
     * Test addFuelCost method
     */
    @Test
    void addFuelCost()
    {
        totalExpense.addFuelCost(1);
        assertEquals(1, totalExpense.getFuelCost());
        logger.debug("@test test " + totalExpense.getFuelCost());
    }

    /**
     * Test addHotelCost method
     */
    @Test
    void addHotelCost()
    {
        totalExpense.addHotelCost(1);
        assertEquals(1, totalExpense.getHotelCost());
        logger.debug("@test test " + totalExpense.getHotelCost());
    }

    /**
     * Test addOilChange method
     */
    @Test
    void addOilChange()
    {
        totalExpense.addOilChange(1);
        assertEquals(1, totalExpense.getOilChange());
        logger.debug("@test test " + totalExpense.getOilChange());
    }

    /**
     * Test addPurchasePrice method
     */
    @Test
    void addPurchasePrice()
    {
        totalExpense.addPurchasePrice(1);
        assertEquals(1, totalExpense.getPurchasePrice());
        logger.debug("@test test " + totalExpense.getPurchasePrice());
    }


    /**
     * Test setHotelCost method
     */
    @Test
    void setHotelCost()
    {
        totalExpense.setHotelCost(1);
        assertEquals(1, totalExpense.getHotelCost());
    }

    /**
     * Test getKey method
     */
    @Test
    void getKey()
    {
        totalExpense.setKey(1);
        assertEquals(1, totalExpense.getKey());
    }


    /**
     * Test getName method
     */
    @Test
    void getName()
    {
        totalExpense.getName();
        assertTrue(totalExpense.getName()instanceof String);
    }

    /**
     * Test setName method
     */
    @Test
    void setName()
    {
        totalExpense.setName("testName");
        assertTrue(totalExpense.getName().contains("testName"));
    }


    /**
     * Test setPurchasePrice method
     */
    @Test
    void setPurchasePrice()
    {
        totalExpense.setPurchasePrice(123);
        assertEquals(123, totalExpense.getPurchasePrice());
    }

    /**
     * Test getGrandTotalCost method
     */
    @Test
    void getGrandTotalCost()
    {

        totalExpense.getGrandTotalCost();
        assertEquals(0, totalExpense.getGrandTotalCost());
    }

    /**
     * Test toString
     */
    @Test
    void testToString()
    {
        assertFalse(this.totalExpense.toString().isEmpty());
    }
}