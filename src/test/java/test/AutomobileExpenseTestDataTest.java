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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class AutomobileExpenseTestDataTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(AutomobileExpenseTestDataTest.class.getName());

    /**
     * new data
     */
    AutomobileExpenseTestData data = null;

    /**
     * Constructor
     */
    public AutomobileExpenseTestDataTest()
    {
        super();
    }

    /**
     * Create new expense passing false so the program uses hard coded data
     * Set to true to use Excel data
     */
    @BeforeEach
    void setUp()
    {
        data = new AutomobileExpenseTestData(false);
    }
    /**
     * Reset expense data when test is finished
     */
    @AfterEach

    void tearDown()
    {
        data = null;
    }

    /**
     * test for getFuelExpense
     */
    @Test
    void getFuelExpense()
    {
        String name = "fuel";
        assertTrue(data.getFuelExpense(name) instanceof Expense);
        logger.debug("@test getFuelExpense(): " + data.getFuelExpense(name));
    }

    /**
     * test for getOilExpense
     */
    @Test
    void getOilExpense()
    {
        String name = "oil";
        assertTrue(data.getOilExpense(name) instanceof Expense);
        logger.debug("@test getOilExpense(): " + data.getOilExpense(name));
    }

    /**
     * test for getPurchasePriceExpense
     */
    @Test
    void getPurchasePriceExpense()
    {
        String name = "purchase";
        assertTrue(data.getOilExpense(name) instanceof Expense);
        logger.debug("@test getPurchasePriceExpense(): " + data.getPurchasePriceExpense(name));
    }

    /**
     * test for getTestDataList
     */
    @Test
    void getTestDataList()
    {
        assertTrue(data.getTestDataList() instanceof ArrayList<Expense>);
        logger.debug("@test test getTestDataList(): " + data.getTestDataList());
    }

    /**
     * test for setTestDataList by adding a test fuel expense object to a new list
     */
    @Test
    void setTestDataList()
    {
        ArrayList<Expense> testList = new ArrayList<>();
        FuelExpense fuel = new FuelExpense(1, "testExpense");
        testList.add(fuel);
        data.setTestDataList(testList);
        assertEquals(1, data.getTestDataList().get(0).getExpense());
    }

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "AutomobileExpenseTestData{testDataList=[class expense.PurchasePriceExpense this.getKey()=";
        String actual = data.toString();
        logger.debug("@test toString(): " + data.toString());

        assertTrue(actual.contains(expected));
        logger.debug("@test toString(): " + data.toString());
    }


    /**
     * test
     */
    @Test
    void getTireExpense()
    {
        String name = "tire";
        assertTrue(data.getTireExpense(name) instanceof Expense);
        logger.debug("@test getTireExpense(): " + data.getTireExpense(name));
    }

    /**
     * test for handlePoiDataRowResults
     */
    @Test
    void handlePoiDataRowResults()
    {

        ArrayList<PoiData> poiList = new ArrayList<PoiData>();
        PoiData poi = new PoiData(0, 0, "Hi");
        poiList.add(poi);
        PoiData poi2 = new PoiData(0, 0, "Hi");
        poiList.add(poi2);
        PoiData poi3 = new PoiData(0, 0, "Hi");
        poiList.add(poi3);
        PoiData poi4 = new PoiData(0, 0, "Hi");
        poiList.add(poi4);
        PoiData poi5 = new PoiData(0, 0, "Hi");
        poiList.add(poi5);
        data.handlePoiDataRowResults(poiList);
        assertFalse(data.getTestDataList().isEmpty());
        logger.debug("@test testHandlePoiData(): " + data.getTestDataList());
    }

    /**
     * test for getWorksheetNumber
     */
    @Test
    void getWorksheetNumber()
    {
        int expected = 0;
        assertEquals(expected, data.getWorksheetNumber());
        logger.debug("@test getWorksheetNumber: " + "\nexpected: " + expected + "\nactual: " + data.getTestDataList());
    }

    /**
     * test for getFileName
     */
    @Test
    void getFileName()
    {
        String expected = "src/main/resources/in/TravelExpenses.xlsx";
        assertTrue(this.data.getFileName().contains(expected));
        logger.debug("@test getFile name: " + "\nexpected: " + expected + "\nactual: " + this.data.getFileName());
    }
}