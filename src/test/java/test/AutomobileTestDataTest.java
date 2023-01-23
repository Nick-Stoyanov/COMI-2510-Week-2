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
    AutomobileTestData autodata = null;
    ArrayList<Automobile> autolist = null;

    @BeforeEach
    /**
     * Set up test data
     */
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

    @AfterEach
    /**
     * Reset after each method
     */
    void tearDown()
    {
        autodata = null;
        autolist = null;
    }

    @Test
    /**
     * test for getAutomobile
     */
    void getAutomobile()
    {
        Object expected = autodata.getAutomobile("testCarToFind");
        logger.debug("expected: " + expected.toString());
        assertEquals(expected, autolist.get(1));
        logger.debug("actual : " + autolist.get(1).toString());
    }

    @Test
    /**
     * test for getTestDataList
     */
    void getTestDataList()
    {
        assertTrue(autodata.getTestDataList() instanceof ArrayList<Automobile>);
    }

    @Test
    /**
     * test for setTestDataList
     */
    void setTestDataList()
    {
        Automobile car = new Automobile("car");
        ArrayList<Automobile> list = new ArrayList<>();
        list.add(car);
        this.autodata.setTestDataList(list);
        assertFalse(this.autodata.getTestDataList().isEmpty());
        logger.debug("@test setTestDataList: " + this.autodata.toString());
    }

    @Test
    /**
     * test for needToTransposeExcelData
     */
    void needToTransposeExcelData()
    {
        assertTrue(autodata.needToTransposeExcelData());
        logger.debug("@test needToTransposeExcelData(): " + autodata.needToTransposeExcelData());
    }


    @Test
    /**
     * test for getWorksheetNumber
     */
    void getWorksheetNumber()
    {
        assertEquals(0, autodata.getWorksheetNumber());
        logger.debug("@test getWorksheetNumber");
    }


    @Test
    /**
     * test for getFileName
     */
    void getFileName()
    {
        String expected = "src/main/resources/in/TravelExpenses.xlsx";
        logger.debug("@test getFileName() expected:" + expected);
        String actual = autodata.getFileName();
        logger.debug("@test getFileName() actual:" + autodata.getFileName());
        assertTrue(actual.contains(expected));
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
        String expected = "class test.AutomobileTestData";
        logger.debug("@test toString expected: " + expected);
        String actual = autodata.toString();
        logger.debug("@test toString actual: " + actual);
        assertTrue(actual.contains(expected));

    }

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