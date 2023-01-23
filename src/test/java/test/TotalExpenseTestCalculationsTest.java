package test;


import expense.TotalExpense;
import expense.TravelEntertainmentExpense;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class TotalExpenseTestCalculationsTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTestCalculationsTest.class.getName());
    /**
     * data
     */
    TotalExpenseTestCalculations data = null;

    /**
     * Constructor
     */
    public TotalExpenseTestCalculationsTest()
    {
    }

    /**
     * Set up
     */
    @BeforeEach
    void setUp()
    {
        data = new TotalExpenseTestCalculations();
    }

    /**
     * Tear down
     */
    @AfterEach
    void tearDown()
    {
        data = null;
    }

    /**
     * test for calculateGrandTotals
     * should return a total expense
     */
    @Test
    void calculateGrandTotals()
    {
        ArrayList<TotalExpense> list = new ArrayList<>();
        data.setTotalCostList(list);
        assertTrue(data.calculateGrandTotals() instanceof TotalExpense);
        assertNotNull(data.calculateGrandTotals());
        logger.debug("@test CalculateGrandTotals(): " + data.calculateGrandTotals().toString());
    }

    /**
     * test for calculateTotals
     */
    @Test
    void calculateTotals()
    {
        ArrayList<TotalExpense> testList = new ArrayList<>();
        TotalExpense testExpense = new TotalExpense("test");
        testExpense.setHotelCost(1);
        testExpense.setFoodCost(1);
        testExpense.setName("name");


        testList.add(testExpense);
        data.setTotalCostList(testList);
        logger.debug("test" + data.getTotalCostList());

        assertFalse(data.getTotalCostList().isEmpty());
    }

    /**
     * test for getAutomobileTestData
     */
    @Test
    void getAutomobileTestData()
    {
        AutomobileTestData foo = new AutomobileTestData(false);
        data.setAutomobileTestData(foo);
        assertTrue(data.getAutomobileTestData() instanceof AutomobileTestData);
    }

    /**
     * test for setAutomobileTestData
     */
    @Test
    void setAutomobileTestData()
    {
        AutomobileTestData foo = new AutomobileTestData(false);
        data.setAutomobileTestData(foo);

        assertTrue(data.getAutomobileTestData() instanceof AutomobileTestData);

    }

    /**
     * test for getExpenseTestData
     */
    @Test
    void getExpenseTestData()
    {
        AutomobileExpenseTestData foo = new AutomobileExpenseTestData(false);
        data.setAutomobileExpenseTestData(foo);

        assertTrue(data.getExpenseTestData() instanceof AutomobileExpenseTestData);

    }

    /**
     * test for getSalesTripTestData
     */
    @Test
    void getSalesTripTestData()
    {
        SalesTripTestData foo = new SalesTripTestData(false);
        data.setSalesTripTestData(foo);

        assertTrue(data.getSalesTripTestData() instanceof SalesTripTestData);
    }

    /**
     * test for setSalesTripTestData
     */
    @Test
    void setSalesTripTestData()
    {
        SalesTripTestData foo = new SalesTripTestData(false);
        data.setSalesTripTestData(foo);

        assertTrue(data.getSalesTripTestData() instanceof SalesTripTestData);
    }

    /**
     * test for getTotalCostList
     */
    @Test
    void getTotalCostList()
    {
        ArrayList<TotalExpense> testList = new ArrayList<>();
        TotalExpense test = new TotalExpense("foo");
        testList.add(test);

        String expected = "foo";
        String actual = testList.get(0).getName();
        assertTrue(actual.contains(expected));
    }

    /**
     * test for setTotalCostList
     */
    @Test
    void setTotalCostList()
    {
        ArrayList<TotalExpense> testList = new ArrayList<>();
        TotalExpense test = new TotalExpense("foo");
        data.setTotalCostList(testList);

        assertTrue(data.getTotalCostList().isEmpty());


    }

    /**
     * test for getTravelExpenseData
     */
    @Test
    void getTravelExpenseData()
    {
        TravelEntertainmentExpense data = new TravelEntertainmentExpense("name", 1, 1);

    }

    /**
     * test for setAutomobileExpenseTestData
     */
    @Test
    void setAutomobileExpenseTestData()
    {
    }

    /**
     * test for setTravelEntertainmentExpenseData
     */
    @Test
    void setTravelEntertainmentExpenseData()
    {
    }

    /**
     * test for getKey
     */
    @Test
    void getKey()
    {
        assertTrue(data.getKey() > -1);
    }

    /**
     * test for setKey
     */
    @Test
    void setKey()
    {
        int expected = 123;
        data.setKey(expected);
        logger.debug("@test setKey() expected: " + expected);
        assertEquals(expected, this.data.getKey());
        logger.debug("@test setKey() actual: " + this.data.getKey());
    }

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "";
        logger.debug("@test toString() expected: " + expected);
        String actual = data.toString();
        logger.debug("@test toString() expected: " + actual);
        assertTrue(actual.contains(expected));
    }
}