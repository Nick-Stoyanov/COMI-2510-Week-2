package test;

import common.UniqueKeyCounter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import poi.PoiData;
import poi.PoiReadDataList;

import java.util.ArrayList;

/**
 * Abstract test data source
 *
 * @author Nick
 */
public abstract class TestDataSource extends UniqueKeyCounter
{

    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TestDataSource.class.getName());
    /**
     * Unique object key
     */
    private int key;
    /**
     * Set to true to use Excel file as the data source
     */

    private boolean useExcel;


    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    protected TestDataSource(boolean useExcel)
    {
        super();
        this.useExcel = useExcel;
    }


    /**
     * Handles the data row results to convert it from a list of objects
     * (e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     *
     * @param testDataList the data row results to convert it from a list of objects
     *                     (e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     */
    private void handlePoiDataResults(ArrayList<ArrayList<PoiData>> testDataList)
    {
        ArrayList<PoiData> rowDataList = null;
        int start = 0;

        if (skipFirstRow())
        {
            start = 1;
        }

        for (int i = start; i < (testDataList.size()); i++)
        {
            rowDataList = testDataList.get(i);
            handlePoiDataRowResults(rowDataList);
        }
    }


    /**
     * Handles the data row results to convert it from a list of objects
     * e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     *
     * @param rowDataList the data row results to convert it from a list of objects
     *                    (e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     */
    protected abstract void handlePoiDataRowResults(ArrayList<PoiData> rowDataList);

    /**
     * Returns the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     *
     * @return the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     */
    protected abstract int getWorksheetNumber();


    /**
     * Override this method to return true to transpose the result data, so the columns become
     * the rows and the rows become the columns For example, when transposed:
     *
     * @return true to transpose the result data, so the columns become the rows and the rows
     * become the columns
     */
    protected boolean needToTransposeExcelData()
    {
        return true;
    }


    /**
     * Returns the POI data value as a double
     *
     * @param columnNumber the column number
     * @param poiData      the poi data value
     * @return the POI data value as a double
     */
    protected double poiDataValueToDouble(int columnNumber,
                                          PoiData poiData)
    {
        double value = -666;
        if (null != poiData.getValue() && poiData.getValue() instanceof Double)
        {
            value = (double) poiData.getValue();
        } else
        {
            logger.error("column=" + columnNumber + "Invalid Data Type. Please enter Double.");
        }
        return value;
    }


    /**
     * Returns the POI data value as a string
     *
     * @param columnNumber the column number
     * @param poiData      the poi data value
     * @return the POI data value as a string
     */
    protected String poiDataValueToString(int columnNumber,
                                          PoiData poiData)
    {
        String value = null;
        if (null != poiData.getValue() && poiData.getValue() instanceof String)
        {
            value = (String) poiData.getValue();
        } else
        {
            logger.error("column=" + columnNumber + "Invalid Data Type. Please enter String.");
        }
        return value;
    }


    /**
     * Return true to skip the first row when processing the data
     * list result, override this method to include the first row of data
     *
     * @return true to skip the first row when processing the data list result,
     * override this method to include the first row of data
     */
    protected boolean skipFirstRow()
    {
        return true;
    }


    /**
     * Method to stage the test data with data that is from an Excel file.
     */
    protected void stageWithExcelData()
    {
        PoiReadDataList poiReadDataList = new PoiReadDataList(this.getFileName(), getWorksheetNumber());

        if (needToTransposeExcelData())
        {
            handlePoiDataResults(poiReadDataList.getTransposedTestDataList());
        } else
        {
            handlePoiDataResults(poiReadDataList.getTestDataList());
        }
    }


    /**
     * Method to stage the test data with data that is fixed (e.g. hard coded).
     */
    protected abstract void stageWithFixedData();

    /**
     * Returns true to use Excel as the data source, false to use fixed (hard coded) data
     *
     * @return true to use Excel as the data source, false to use fixed (hard coded) data
     */
    public boolean useExcel()
    {
        return true;
    }

    /**
     * Set to true to use excel as the data source, false to use fixed (e.g. hard coded) data
     *
     * @param useExcel use excel
     */
    private void setUseExcel(boolean useExcel)
    {
        this.useExcel = useExcel;
    }

    /**
     * Returns the unique object key
     *
     * @return the unique object key
     */
    @Override
    public int getKey()
    {
        return key;
    }

    /**
     * The unique object key to set
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
    {
        this.key = key;
    }

    /**
     * Returns the Excel file name to read
     *
     * @return the Excel file name to read
     */
    protected abstract String getFileName();
}
