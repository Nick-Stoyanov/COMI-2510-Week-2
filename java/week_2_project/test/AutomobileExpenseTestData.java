package week_2_project.test;

import week_2_project.common.UniqueKeyCounter;
import week_2_project.expense.*;
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
        this.setKey(UniqueKeyCounter.getInternalCounter());

        this.setTestDataList(new ArrayList<Expense>());

        if (useExcel)
        {
            stageWithExcelData();
        } else
        {
            stageWithFixedData();
        }
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
        PurchasePriceExpense  purchase = new PurchasePriceExpense(purchasePrice,name);
        OilExpense oil = new OilExpense(oilChange,name);
        FuelExpense fuel = new FuelExpense(gasPerUnit, name);
        TireExpense tire = new TireExpense(fourTires,name);

        this.getTestDataList().add(purchase);
        this.getTestDataList().add(oil);
        this.getTestDataList().add(fuel);
        this.getTestDataList().add(tire);




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
        this.addExpenses("Honda Accord", 28355, 75, 4, 400);
        this.addExpenses("Jeep Cherokee", 37460, 75, 4, 600);
        this.addExpenses("Lexus ES", 41875, 100, 4, 1000);
        this.addExpenses("Lincoln Aviator", 52560, 75, 4, 750);
        this.addExpenses("Mercedes S-Class", 112150, 250, 4, 2000);
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
