package test;

import dashboard.Automobile;
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
class AutomobileTestDataTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(AutomobileTestDataTest.class.getName());
    /**
     * data
     */
    AutomobileTestData autodata = null;
    /**
     * list
     */
    ArrayList<Automobile> autolist = null;

    /**
     * constructor
     */
    public AutomobileTestDataTest()
    {
    }

    /**
     * Set up test data
     */
    @BeforeEach
    void setUp()
    {
        autodata = new AutomobileTestData(false);
        autolist = new ArrayList<>();

        Automobile car = new Automobile("testCar");
        Automobile car2 = new Automobile("testCarToFind");

        autolist.add(car);
        autolist.add(car2);
        autodata.setTestDataList(autolist);
    }

    /**
     * Reset after each method
     */
    @AfterEach
    void tearDown()
    {
        autodata = null;
        autolist = null;
    }

    /**
     * test for getAutomobile
     */
    @Test
    void getAutomobile()
    {
        Object expected = autodata.getAutomobile("testCarToFind");
        logger.debug("expected: " + expected.toString());
        assertEquals(expected, autolist.get(1));
        logger.debug("actual : " + autolist.get(1).toString());
    }

    /**
     * test for getTestDataList
     */
    @Test
    void getTestDataList()
    {
        assertTrue(autodata.getTestDataList() instanceof ArrayList<Automobile>);
    }

    /**
     * test for setTestDataList
     */
    @Test
    void setTestDataList()
    {
        Automobile car = new Automobile("car");
        ArrayList<Automobile> list = new ArrayList<>();
        list.add(car);
        this.autodata.setTestDataList(list);
        assertFalse(this.autodata.getTestDataList().isEmpty());
        logger.debug("@test setTestDataList: " + this.autodata.toString());
    }

    /**
     * test for needToTransposeExcelData
     */
    @Test
    void needToTransposeExcelData()
    {
        assertTrue(autodata.needToTransposeExcelData());
        logger.debug("@test needToTransposeExcelData(): " + autodata.needToTransposeExcelData());
    }

    /**
     * test for getWorksheetNumber
     */
    @Test
    void getWorksheetNumber()
    {
        assertEquals(0, autodata.getWorksheetNumber());
        logger.debug("@test getWorksheetNumber");
    }

    /**
     * test for getFileName
     */
    @Test
    void getFileName()
    {
        String expected = "src/main/resources/in/TravelExpenses.xlsx";
        logger.debug("@test getFileName() expected:" + expected);
        String actual = autodata.getFileName();
        logger.debug("@test getFileName() actual:" + autodata.getFileName());
        assertTrue(actual.contains(expected));
    }

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "class test.AutomobileTestData";
        logger.debug("@test toString expected: " + expected);
        String actual = autodata.toString();
        logger.debug("@test toString actual: " + actual);
        assertTrue(actual.contains(expected));

    }

    /**
     * Test
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
        autodata.handlePoiDataRowResults(poiList);
        assertFalse(autodata.getTestDataList().isEmpty());
        logger.debug("@test testHandlePoiData(): " + autodata.getTestDataList());

    }
}