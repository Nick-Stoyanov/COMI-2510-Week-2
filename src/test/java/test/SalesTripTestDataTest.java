package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poi.PoiData;
import sales.SalesTrip;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test
 */
class SalesTripTestDataTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(SalesTripTestDataTest.class.getName());

    /**
     * data
     */
    SalesTripTestData data = null;

    /**
     * constructor
     */
    public SalesTripTestDataTest()
    {
    }

    /**
     * set up
     */
    @BeforeEach
    void setUp()
    {
        data = new SalesTripTestData(false);
    }

    /**
     * tear down
     */
    @AfterEach
    void tearDown()
    {
        data = null;
    }

    /**
     * test for getTestDataList
     */
    @Test
    void getTestDataList()
    {
        assertTrue(data.getTestDataList() instanceof ArrayList<SalesTrip>);
    }

    /**
     * test for setTestDataList
     */
    @Test
    void setTestDataList()
    {
        ArrayList<SalesTrip> testList = new ArrayList<>();
        SalesTrip testTrip = new SalesTrip("foo", "bar", 1, 1);
        testList.add(testTrip);

        data.setTestDataList(testList);
        String expected = "bar";
        String actual = data.testDataList.get(0).getFromCity();
        assertTrue(actual.contains(expected));
        logger.debug("@test setTestDataList() " + "\nexpected: " + expected + "\nactual: " + actual);

    }

    /**
     * test for getTotalSalesTripDistance
     */
    @Test
    void getTotalSalesTripDistance()
    {
        ArrayList<SalesTrip> testList = new ArrayList<>();
        SalesTrip testTrip = new SalesTrip("foo", "bar", 1, 1);
        testList.add(testTrip);

        data.setTestDataList(testList);
        double expected = 1;
        double actual = data.getTotalSalesTripDistance();
        logger.debug("@test setTestDataList() " + "\nexpected: " + expected + "\nactual: " + actual);
        assertEquals(1, data.getTotalSalesTripDistance());

    }

    /**
     * test for getTotalSalesTripDuration
     */
    @Test
    void getTotalSalesTripDuration()
    {
        ArrayList<SalesTrip> testList = new ArrayList<>();
        SalesTrip testTrip = new SalesTrip("foo", "bar", 1, 1);
        testList.add(testTrip);

        data.setTestDataList(testList);
        double expected = 1;
        double actual = data.getTotalSalesTripDuration();
        logger.debug("@test setTestDataList() " + "\nexpected: " + expected + "\nactual: " + actual);
        assertEquals(1, data.getTotalSalesTripDuration());
    }

    /**
     * test for handlePoiDataRowResults
     */
    @Test
    void handlePoiDataRowResults()
    {

        ArrayList<PoiData> poiList = new ArrayList<>();
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
        assertEquals(2, data.getWorksheetNumber());
        logger.debug("@test getWorksheetNumber");
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

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "class test.SalesTripTestData";
        logger.debug("@test toString expected: " + expected);
        String actual = data.toString();
        logger.debug("@test toString actual: " + actual);
        assertTrue(actual.contains(expected));
    }
}