package week_2_project.test;

import week_2_project.common.UniqueKeyCounter;
import week_2_project.poi.PoiData;
import week_2_project.sales.SalesTrip;

import java.util.ArrayList;
import java.util.Iterator;

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
    protected ArrayList<SalesTrip> testDataList;

    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    public SalesTripTestData(boolean useExcel)
    {
        super(useExcel);
        this.setKey(UniqueKeyCounter.getInternalCounter());

        this.setTestDataList(new ArrayList<SalesTrip>());

        if (useExcel)
        {
            stageWithExcelData();
        } else
        {
            stageWithFixedData();
        }
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
        SalesTrip expense = new SalesTrip(fromCity, destinationCity, duration, distance);
        this.getTestDataList().add(expense);
    }

    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public ArrayList<SalesTrip> getTestDataList()
    {
        return this.testDataList;
    }

    /**
     * The test data list
     *
     * @param testDataList the testDataList to set
     */
    protected void setTestDataList(ArrayList<SalesTrip> testDataList)
    {
        this.testDataList = testDataList;
    }

    /**
     * Returns the total sales trip distance (miles)
     *
     * @return total sales trip distance (miles)
     */
    public double getTotalSalesTripDistance()
    {
        double distance = 0;
        Iterator<SalesTrip> i = this.getTestDataList().iterator();
        SalesTrip salesTrip = null;

        while (i.hasNext())
        {
            salesTrip = i.next();
            distance += salesTrip.getDistance();
        }
        return distance;
    }

    /**
     * Returns the total sales trip duration (time)
     *
     * @return total sales trip duration (time)
     */
    public double getTotalSalesTripDuration()
    {
        double duration = 0;

        Iterator<SalesTrip> i = this.getTestDataList().iterator();
        SalesTrip salesTrip = null;

        while (i.hasNext())
        {
            salesTrip = i.next();
            duration += salesTrip.getDuration();
        }
        return duration;
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
        PoiData data = null;
        int columnNumber = 0;

        String fromCity = null;
        String toCity = null;
        double duration = 0;
        double distance = 0;

        data = rowDataList.get(columnNumber);
        fromCity = poiDataValueToString(columnNumber, data);
        columnNumber++;

        data = rowDataList.get(columnNumber);
        toCity = poiDataValueToString(columnNumber, data);
        columnNumber++;

        data = rowDataList.get(columnNumber);
        duration = poiDataValueToDouble(columnNumber, data);
        columnNumber++;

        data = rowDataList.get(columnNumber);
        distance = poiDataValueToDouble(columnNumber, data);
        columnNumber++;

        this.addExpenses(fromCity, toCity, duration, distance);
    }

    /**
     * Returns the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     *
     * @return the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     */
    @Override
    protected int getWorksheetNumber()
    {
        return 2;
    }

    /**
     * Method to stage the test data with data that is fixed (e.g. hard coded).
     */
    @Override
    protected void stageWithFixedData()
    {
        this.addExpenses("Providence", "Miami", 22.5, 1462.7);
        this.addExpenses("Miami", "Dallas", 19.75, 1309.1);
        this.addExpenses("Dallas", "Los Angeles", 21.5, 1435.7);
        this.addExpenses("Los Angeles", "Seattle", 17.9, 1135.1);
        this.addExpenses("Seattle", "Chicago", 31, 2042.8);
        this.addExpenses("Chicago", "New York", 12.2, 788.9);
        this.addExpenses("New York", "Providence", 3.5, 180.9);
    }

    /**
     * Returns the Excel file name to read
     *
     * @return the Excel file name to read
     */
    @Override
    protected String getFileName()
    {
        return TotalExpenseConstants.getInputFileName();
    }

    /**
     * Returns a string representation of the object
     *
     * @return a string representation of the object
     */

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getClass());
        Iterator<SalesTrip> i = this.getTestDataList().iterator();
        SalesTrip salesTrip = null;

        while (i.hasNext())
        {
            salesTrip = i.next();
            sb.append("\n\n").append(salesTrip.toString());
        }

        return sb.toString();
    }

}
