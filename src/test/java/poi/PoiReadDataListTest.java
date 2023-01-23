package poi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Test
 */
class PoiReadDataListTest
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiReadDataListTest.class.getName());
    /**
     * poi
     */
    PoiReadDataList poi = null;
    /**
     * list
     */
    ArrayList<ArrayList<PoiData>> testList = null;
    /**
     * row
     */
    ArrayList<PoiData> row = null;

    /**
     * constructor
     */
    public PoiReadDataListTest()
    {
    }

    /**
     * Create new PoiReadDataList each time test is run
     * <p>
     * create hard coded list of lists to test with
     */
    @BeforeEach
    void setUp()
    {
        poi = new PoiReadDataList("src/main/resources/in/TravelExpenses.xlsx", 1);
        testList = new ArrayList<>();
        row = new ArrayList<>();

        PoiData poi1 = new PoiData(1, 1, 11);
        row.add(poi1);
        PoiData poi2 = new PoiData(1, 2, 12);
        row.add(poi2);
        PoiData poi3 = new PoiData(1, 3, 13);
        row.add(poi3);

        PoiData poi4 = new PoiData(2, 1, 21);
        row.add(poi4);
        PoiData poi5 = new PoiData(2, 2, 22);
        row.add(poi5);
        PoiData poi6 = new PoiData(2, 3, 23);
        row.add(poi6);

        testList.add(row);
        logger.debug("testList: " + testList);

    }

    /**
     * tear down
     */
    @AfterEach
    void tearDown()
    {
        poi = null;
        testList = null;
        row = null;
    }

    /**
     * test for getTransposedTestDataList
     */
    @Test
    void getTransposedTestDataList()
    {
        logger.debug("@test test getTransposedTestDataList original: " + testList);

        //assertTrue(poi.getTransposedTestDataList() instanceof ArrayList<ArrayList<PoiData>>);

        logger.debug("@test test getTransposedTestDataList transposed : " + poi.getTransposedTestDataList());

    }

    /**
     * test for getMaxColumns
     */
    @Test
    void getMaxColumns()
    {
        assertEquals(5, poi.getMaxColumns());
        logger.debug("@test getMaxColumns(): " + poi.getMaxColumns());
    }

    /**
     * test for getMaxRows
     */
    @Test
    void getMaxRows()
    {
        assertEquals(6, poi.getMaxRows());
        logger.debug("@test test getMaxRows(): " + poi.getMaxRows());

    }

    /**
     * test for getTestDataList
     */
    @Test
    void getTestDataList()
    {
        assertTrue(poi.getTestDataList() instanceof ArrayList<ArrayList<PoiData>>);
        logger.debug("@test getTestDataList(): " + poi.getTestDataList());

    }

    /**
     * test for testToString
     */
    @Test
    void testToString()
    {
        String expected = "this.getMaxRows()= 6 this.getMaxColumns()= 5 this.getPoiDataList()=";
        assertTrue(poi.toString().contains(expected));
        logger.debug("@test test toString(): " + poi.toString());
    }
}