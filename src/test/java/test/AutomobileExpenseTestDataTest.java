package test;

import expense.Expense;
import expense.FuelExpense;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poi.PoiData;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test
 */
class AutomobileExpenseTestDataTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(AutomobileExpenseTestDataTest.class.getName());

    AutomobileExpenseTestData data = null;

    @BeforeEach
    /**
     *  Create new expense passing false so the program uses hard coded data
     *  Set to true to use Excel data
     */
    void setUp()
    {
        data = new AutomobileExpenseTestData(false);
    }

    @AfterEach
    /**
     * Reset expense data when test is finished
     */
    void tearDown()
    {
        data = null;
    }

    @Test
    /**
     * test for getFuelExpense
     */
    void getFuelExpense()
    {
        String name = "fuel";
        assertTrue(data.getFuelExpense(name) instanceof Expense);
        logger.debug("@test getFuelExpense(): " + data.getFuelExpense(name));
    }

    @Test
    /**
     * test for getOilExpense
     */
    void getOilExpense()
    {
        String name = "oil";
        assertTrue(data.getOilExpense(name) instanceof Expense);
        logger.debug("@test getOilExpense(): " + data.getOilExpense(name));
    }

    @Test
    /**
     * test for getPurchasePriceExpense
     */
    void getPurchasePriceExpense()
    {
        String name = "purchase";
        assertTrue(data.getOilExpense(name) instanceof Expense);
        logger.debug("@test getPurchasePriceExpense(): " + data.getPurchasePriceExpense(name));
    }

    @Test
    /**
     * test for getTestDataList
     */
    void getTestDataList()
    {
        assertTrue(data.getTestDataList() instanceof ArrayList<Expense>);
        logger.debug("@test test getTestDataList(): " + data.getTestDataList());
    }

    @Test
    /**
     * test for setTestDataList by adding a test fuel expense object to a new list
     */
    void setTestDataList()
    {
        ArrayList<Expense> testList = new ArrayList<>();
        FuelExpense fuel = new FuelExpense(1, "testExpense");
        testList.add(fuel);
        data.setTestDataList(testList);
        assertEquals(1, data.getTestDataList().get(0).getExpense());
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
    }

    @Test
    /**
     * test for getTireExpense
     */
    void getTireExpense()
    {
        String name = "tire";
        assertTrue(data.getTireExpense(name) instanceof Expense);
        logger.debug("@test getTireExpense(): " + data.getTireExpense(name));
    }

    @Test
    /**
     * test for handlePoiDataRowResults
     */
    void handlePoiDataRowResults()
    {
        ArrayList<PoiData> poiList = new ArrayList<PoiData>();
        PoiData poi = new PoiData(1,2,3);
    }

    @Test
    /**
     * test for getWorksheetNumber
     */
    void getWorksheetNumber()
    {
        int expected = 0;
        assertEquals(expected, data.getWorksheetNumber());
        logger.debug("@test getWorksheetNumber: " + "\nexpected: " + expected + "\nactual: " + data.getTestDataList());
    }


    @Test
    /**
     * test for getFileName
     */
    void getFileName()
    {
        String expected = "src/main/resources/in/TravelExpenses.xlsx";
        assertTrue(this.data.getFileName().contains(expected));
        logger.debug("@test getFile name: " + "\nexpected: " + expected + "\nactual: " + this.data.getFileName());
    }
}