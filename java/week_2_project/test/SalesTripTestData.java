package week_2_project.test;

import week_2_project.poi.PoiData;
import week_2_project.sales.SalesTrip;

import java.util.ArrayList;

/**
 * Sales trip data
 *
 * @author Nick
 */
public class SalesTripTestData extends TestDataSource
{

    /**
     * test data list
     */
    protected ArrayList<SalesTrip> testDataList = new ArrayList<>();

    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    public SalesTripTestData(boolean useExcel)
    {
        super(useExcel);
    }

    /**
     * Adds expenses to the test data list
     *
     * @param fromCity        from city
     * @param destinationCity to (destination) city
     * @param duration        duration (time) between the cities
     * @param distance        distance (miles) between the cities
     */
    private void addExpenses(String fromCity,
                             String destinationCity,
                             double duration,
                             double distance)
    {

    }

    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public ArrayList<SalesTrip> getTestDataList()
    {
        return null;
    }

    /**
     * The test data list
     *
     * @param testDataList the testDataList to set
     */
    protected void setTestDataList(ArrayList<SalesTrip> testDataList)
    {

    }

    /**
     * Returns the total sales trip distance (miles)
     *
     * @return total sales trip distance (miles)
     */
    public double getTotalSalesTripDistance()
    {
        return 0.0;
    }

    /**
     * Returns the total sales trip duration (time)
     *
     * @return total sales trip duration (time)
     */
    public double getTotalSalesTripDuration()
    {
        return 0.0;
    }

    /**
     * Handles the data row results to convert it from a list of objects
     * e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     *
     * @param rowDataList the data row results to convert it from a list of objects
     *                    (e.g. String, int, double, etc) into an object (e.g. POJO, PODO).
     */
    @Override
    protected void handlePoiDataRowResults(ArrayList<PoiData> rowDataList)
    {

    }

    /**
     * Returns the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     *
     * @return the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     */
    @Override
    protected int getWorksheetNumber()
    {
        return 0;
    }

    /**
     * Method to stage the test data with data that is fixed (e.g. hard coded).
     */
    @Override
    protected void stageWithFixedData()
    {

    }

    /**
     * Returns the Excel file name to read
     *
     * @return the Excel file name to read
     */
    @Override
    protected String getFileName()
    {
        return null;
    }

    /**
     * Returns a string representation of the object
     *
     * @return a string representation of the object
     */
    @Override
    public String toString()
    {
        return "SalesTripTestData{" +
                "testDataList=" + testDataList +
                '}';
    }
}
