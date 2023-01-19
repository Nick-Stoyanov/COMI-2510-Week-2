package test;

import common.UniqueKeyCounter;
import expense.FoodExpense;
import expense.HotelExpense;
import expense.TravelEntertainmentExpense;
import poi.PoiData;

import java.util.ArrayList;
import java.util.List;

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
        this.setKey(UniqueKeyCounter.getInternalCounter());
        testDataList = new ArrayList<>();

        this.setTestDataList(new ArrayList<>());

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
     * @param name         the name of the expense
     * @param hotelExpense the hotel cost
     * @param foodExpense  the food cost
     */
    private void addExpenses(String name,
                             double hotelExpense,
                             double foodExpense)
    {
        TravelEntertainmentExpense expense = new TravelEntertainmentExpense(name, hotelExpense, foodExpense);
        this.getTestDataList().add(expense);
    }

    /**
     * Returns the food FoodExpense
     *
     * @param name the name of the expense
     * @return the food FoodExpense
     */
    public FoodExpense getFoodExpense(String name)
    {

        FoodExpense fe = null;
        for (int i = 0; i < testDataList.size(); i++)
            if (name.equals(this.testDataList.get(i).getFood().getName()))
            {
                fe = this.testDataList.get(i).getFood();
            }
        return fe;
    }


    /**
     * Returns the hotel HotelExpense
     *
     * @param name the name of the expense
     * @return the hotel HotelExpense
     */
    public HotelExpense getHotelExpense(String name)
    {

        HotelExpense he = null;
        for (int i = 0; i < testDataList.size(); i++)
            if (name.equals(this.testDataList.get(i).getHotel().getName()))
            {
                he = this.testDataList.get(i).getHotel();
            }
        return he;
    }


    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public List<TravelEntertainmentExpense> getTestDataList()
    {
        return this.testDataList;
    }


    /**
     * Sets the test data list
     *
     * @param testDataList the test data list to set
     */
    protected void setTestDataList(ArrayList<TravelEntertainmentExpense> testDataList)
    {
        this.testDataList = testDataList;
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

        String name = null;
        double hotelExpense = 0;
        double foodExpense = 0;

        data = rowDataList.get(columnNumber);
        name = poiDataValueToString(columnNumber, data);
        columnNumber++;

        data = rowDataList.get(columnNumber);
        hotelExpense = poiDataValueToDouble(columnNumber, data);
        columnNumber++;

        data = rowDataList.get(columnNumber);
        foodExpense = poiDataValueToDouble(columnNumber, data);

        this.addExpenses(name, hotelExpense, foodExpense);

    }

    /**
     * Returns the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     *
     * @return the worksheet number to read. Worksheets are 0 based (e.g. 0, 1, 2...).
     */
    @Override
    protected int getWorksheetNumber()
    {
        return 3;
    }

    /**
     * Method to stage the test data with data that is fixed (e.g. hard coded).
     */
    @Override
    protected void stageWithFixedData()
    {
        this.addExpenses("Honda Accord", 283.35, 75.50);
        this.addExpenses("Jeep Cherokee", 374.60, 75.01);
        this.addExpenses("Lexus ES", 418.75, 100.75);
        this.addExpenses("Lincoln Navigator", 525.60, 75.75);
        this.addExpenses("Mercedes S-Class", 1121.50, 250.99);

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
        return "TravelEntertainmentExpenseTestData{" +
                "testDataList=" + testDataList +
                '}';
    }
}
