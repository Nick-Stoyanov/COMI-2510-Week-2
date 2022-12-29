package week_2_project.test;

import week_2_project.expense.FoodExpense;
import week_2_project.expense.HotelExpense;
import week_2_project.expense.TravelEntertainmentExpense;
import week_2_project.poi.PoiData;

import java.util.ArrayList;

/**
 * Travel and entertainment expense test data
 *
 * @author Nick
 */
public class TravelEntertainmentExpenseTestData extends TestDataSource
{
    /**
     * test data list
     */
    protected ArrayList<TravelEntertainmentExpense> testDataList;

    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    public TravelEntertainmentExpenseTestData(boolean useExcel)
    {
        super(useExcel);
    }


    /**
     * Adds the expenses to the test data list
     *
     * @param name         the name of the expense
     * @param hotelExpense the hotel cost
     * @param foodExpense  the food cost
     */
    private void addExpenses(String name,
                             double hotelExpense,
                             double foodExpense)
    {

    }

    /**
     * Returns the food FoodExpense
     *
     * @param name the name of the expense
     * @return the food FoodExpense
     */
    public FoodExpense getFoodExpense(String name)
    {
        return null;
    }

    /**
     * Returns the hotel HotelExpense
     *
     * @param name the name of the expense
     * @return the hotel HotelExpense
     */
    public HotelExpense getHotelExpense(String name)
    {
        return null;
    }

    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public ArrayList<TravelEntertainmentExpense> getTestDataList()
    {
        return null;
    }


    /**
     * Sets the test data list
     *
     * @param testDataList the test data list to set
     */
    protected void setTestDataList(ArrayList<TravelEntertainmentExpense> testDataList)
    {

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
        return "TravelEntertainmentExpenseTestData{" +
                "testDataList=" + testDataList +
                '}';
    }
}
