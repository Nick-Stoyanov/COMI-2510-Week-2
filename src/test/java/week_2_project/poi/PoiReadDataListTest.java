package week_2_project.poi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test
 */
class PoiReadDataListTest
{

    PoiReadDataList poi = null;
    @BeforeEach
    /**
     * Create new PoiReadDataList each time test is run
     */
    void setUp()
    {
        poi = new PoiReadDataList("test file name", 1);
    }

    @AfterEach
    /**
     *
     */
    void tearDown()
    {
        poi = null;
    }

    @Test
    /**
     * test for getTransposedTestDataList
     */
    void getTransposedTestDataList()
    {

    }

    @Test
    /**
     * test for getMaxColumns
     */
    void getMaxColumns()
    {
    }

    @Test
    /**
     * test for getMaxRows
     */
    void getMaxRows()
    {
    }

    @Test
    /**
     * test for getTestDataList
     */
    void getTestDataList()
    {
    }

    @Test
    /**
     * test for testToString
     */
    void testToString()
    {
    }
}