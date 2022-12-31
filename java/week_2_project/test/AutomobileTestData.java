package week_2_project.test;

import week_2_project.common.UniqueKeyCounter;
import week_2_project.dashboard.Automobile;
import week_2_project.poi.PoiData;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Automobile test data
 *
 * @author Nick
 */
public class AutomobileTestData extends TestDataSource
{

    /**
     * test data list
     */
    protected ArrayList<Automobile> testDataList;

    /**
     * Constructor
     *
     * @param useExcel set ot true to use Excel as the data source
     */
    public AutomobileTestData(boolean useExcel)
    {
        super(useExcel);
        this.setKey(UniqueKeyCounter.getInternalCounter());

        this.setTestDataList(new ArrayList<Automobile>());

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
     * @param mpg          the mpg (miles per gallon)
     * @param fuelCapacity the maximum fuel capacity (full tank is equal to the maximum)
     * @param oilChange    the maximum number of miles for an oil change (0 after an oil change)
     * @param tireLife     the life of 4 tires (0 with 4 new tires)
     */
    private void addExpenses(String name,
                             double mpg,
                             double fuelCapacity,
                             double oilChange,
                             double tireLife)
    {
        Automobile automobile = new Automobile(name);

        automobile.setFuelGauge(fuelCapacity, fuelCapacity);
        automobile.setOilGauge(oilChange, oilChange);
        automobile.setTireGauge(tireLife, tireLife);
        JOptionPane.showMessageDialog(null, name + "\n" + mpg + "\n" + fuelCapacity + "\n" + oilChange + "\n" + tireLife);
        this.getTestDataList().add(automobile);
        JOptionPane.showMessageDialog(null, name + "\n" + mpg + "\n" + fuelCapacity + "\n" + oilChange + "\n" + tireLife);


    }

    /**
     * Returns an Automobile object
     *
     * @param name the name of the expense
     * @return an Automobile object
     */
    public Automobile getAutomobile(String name)
    {
        return testDataList.get(0);
    }

    /**
     * Returns the test data list
     *
     * @return the test data list
     */
    public ArrayList<Automobile> getTestDataList()
    {
        return this.testDataList;
    }

    /**
     * The test data list
     *
     * @param testDataList the testDataList to set
     */
    protected void setTestDataList(ArrayList<Automobile> testDataList)
    {
        this.testDataList = testDataList;
    }

    /**
     * Return true to transpose the result data, so the columns become
     * the rows and the rows become the columns
     *
     * @return true to transpose the result data, so the columns become
     * the rows and the rows become the columns
     */
    @Override
    protected boolean needToTransposeExcelData()
    {
        return true;
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
        this.addExpenses("Mercedes S-Class", 24, 22, 10000, 50000);
        this.addExpenses("Lexus ES", 28, 15.9, 8000, 40000);
        this.addExpenses("Honda Accord", 47, 12, 3000, 35000);
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
        Iterator<Automobile> i = this.getTestDataList().iterator();
        Automobile automobile = null;

        while (i.hasNext())
        {
            sb.append("\n\n").append(automobile.toString());
        }
        return sb.toString();
    }


}
