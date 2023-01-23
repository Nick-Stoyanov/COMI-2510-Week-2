package test;


import expense.FoodExpense;
import expense.HotelExpense;
import expense.TravelEntertainmentExpense;
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
class TravelEntertainmentExpenseTestDataTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TravelEntertainmentExpenseTestDataTest.class.getName());
    TravelEntertainmentExpenseTestData data = null;

    ArrayList<TravelEntertainmentExpense> expenseList = null;

    TravelEntertainmentExpense expense = null;

    @BeforeEach
    /**
     *
     */
    void setUp()
    {
        data = new TravelEntertainmentExpenseTestData(false);
        expenseList = new ArrayList<>();
        expense = new TravelEntertainmentExpense("test", 1, 1);
        expenseList.add(expense);
        data.setTestDataList(expenseList);


    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
    }

    @Test
    /**
     * test for getFoodExpense
     */
    void getFoodExpense()
    {
        assertTrue(data.getFoodExpense("test") instanceof FoodExpense);
        logger.debug("@test test GetFoodExpense: " + data.getFoodExpense("test"));
    }

    @Test
    /**
     * test for getHotelExpense
     */
    void getHotelExpense()
    {
        assertTrue(data.getHotelExpense("test") instanceof HotelExpense);
        logger.debug("@test test GetHotelExpense: " + data.getHotelExpense("test"));
    }


    @Test
    /**
     * test for handlePoiDataRowResults
     */
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

    @Test
    /**
     * test for getWorksheetNumber
     */
    void getWorksheetNumber()
    {
        int expected = 3;
        int actual = this.data.getWorksheetNumber();
        assertEquals(actual, expected);
        logger.debug("@test getWorksheetNumber: " + "\nactual: " + actual + "\nexpected: " + expected);
    }


    @Test
    /**
     * test for getFileName
     */
    void getFileName()
    {
        String expected = "src/main/resources/in/TravelExpenses.xlsx";
        String actual = data.getFileName();
        assertTrue(actual.contains(expected));
        logger.debug("@test getFileName(): "+ data.getFileName());
        //assertTrue()
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
        String expected = "TravelEntertainmentExpenseTestData{testDataList=[class expense";
        logger.debug("@test toString() expected: " + expected);
        String actual = this.data.toString();
        logger.debug("@test toString() actual: " + actual);
        assertTrue(actual.contains(expected));

    }
}