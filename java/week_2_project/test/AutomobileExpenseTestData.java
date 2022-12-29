package week_2_project.test;

import week_2_project.expense.Expense;
import week_2_project.poi.PoiData;

import java.util.ArrayList;

/**
 * Automobile test data
 *
 * @author Nick
 */
public class AutomobileExpenseTestData extends TestDataSource
{

    /**
     * test data list
     */
    protected ArrayList<Expense> testDataList = new ArrayList<>();


    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    public AutomobileExpenseTestData(boolean useExcel)
    {
        super(useExcel);
    }

    /**
     * Adds the expenses to the test data list
     *
     * @param name          the name of the expense
     * @param purchasePrice the purchase price of the automobile
     * @param oilChange     the cost of an oil change
     * @param gasPerUnit    the unit cost of fuel (e.g. cost per gallon)
     * @param fourTires     the purchase price of 4 tires
     */
    private void addExpenses(String name,
                             double purchasePrice,
                             double oilChange,
                             double gasPerUnit,
                             double fourTires)
    {

    }

    /**
     * Returns the fuel Expense
     *
     * @param name the name of the expense
     * @return the fuel Expense
     */
    public Expense getFuelExpense(String name)
    {
        return null;
    }


    /**
     * Returns the oil Expense
     *
     * @param name the name of the expense
     * @return the oil Expense
     */
    public Expense getOilExpense(String name)
    {
        return null;
    }


    /**
     * Returns the purchase price Expense
     *
     * @param name the name of the expense
     * @return the purchase price Expense
     */
    public Expense getPurchasePriceExpense(String name)
    {
        return null;
    }


    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public ArrayList<Expense> getTestDataList()
    {
        return null;
    }

    /**
     * Returns the test data list
     *
     * @param testDataList the test data list
     */
    protected void setTestDataList(ArrayList<Expense> testDataList)
    {

    }

    /**
     * Returns a string representation of the object
     *
     * @return a string representation of the object
     */
    @Override
    public String toString()
    {
        return "AutomobileExpenseTestData{" +
                "testDataList=" + testDataList +
                '}';
    }

    /**
     * Returns the tire Expense
     *
     * @param name the name of the expense
     * @return the tire Expense
     */
    public Expense getTireExpense(String name)
    {
        return null;
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
}
