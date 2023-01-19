package test;

import expense.TotalExpense;
import poi.PoiWriteDataList;

import java.util.ArrayList;

/**
 * Writes the total expense excel data file
 *
 * @author Nick
 */
public class TotalExpenseWriteDataFile extends PoiWriteDataList
{
    /**
     * Data list
     */
    protected ArrayList<ArrayList<Object>> dataList;

    /**
     * Default constructor
     */
    public TotalExpenseWriteDataFile()
    {
        super();
    }

    /**
     * Add the total expense to the data list
     *
     * @param totalExpense total expense to add to the data list
     */
    public void addTotalExpense(TotalExpense totalExpense)
    {
        ArrayList<Object> data = new ArrayList<>();

        data.add(totalExpense.getName());
        data.add(totalExpense.getPurchasePrice());
        data.add(totalExpense.getFourTires());
        data.add(totalExpense.getOilChange());
        data.add(totalExpense.getFuelCost());
        data.add(totalExpense.getHotelCost());
        data.add(totalExpense.getFoodCost());
        data.add(totalExpense.getGrandTotalCost());

        this.getDataList().add(data);

    }


    /**
     * Add the total expense heading to the data list
     */
    public void addTotalExpenseHeading()
    {
        this.setDataList(new ArrayList<ArrayList<Object>>());
        ArrayList<Object> expense = new ArrayList<>();

        expense.add("Name:");
        expense.add("Purchase price:");
        expense.add("Tires Cost:");
        expense.add("Oil Price");
        expense.add("Fuel:");
        expense.add("Hotel:");
        expense.add("Food");
        expense.add("Grand total:");

        this.getDataList().add(expense);

    }


    /**
     * Returns the list (rows) of lists (columns) that represent
     * the result to be written to the worksheet
     *
     * @return the list (rows) of lists (columns) that represent
     * the result to be written to the worksheet
     */
    @Override
    public ArrayList<ArrayList<Object>> getDataList()
    {
        return dataList;
    }

    /**
     * Sets the data list of lists
     *
     * @param dataList the dataList to set
     */
    public void setDataList(ArrayList<ArrayList<Object>> dataList)
    {
        this.dataList = dataList;
    }

    /**
     * Returns the file name prefix (e.g. 'FileName')
     *
     * @return returns the file name prefix
     */
    @Override
    protected String getFileNamePrefix()
    {
        return TotalExpenseConstants.getOutputFileNamePrefix();
    }

    /**
     * Returns the file name suffix (e.g. '.xlsx')
     *
     * @return returns the file name prefix
     */
    @Override
    protected String getFileNameSuffix()
    {
        return TotalExpenseConstants.getOutputFileNameSuffix();
    }

    /**
     * Returns the path of the file
     *
     * @return the path of the file
     */
    @Override
    protected String getFilePath()
    {
        return TotalExpenseConstants.getOutputFilePath();
    }

    /**
     * True if a unique id should be added to the file name.
     * (Helps prevent incorrectly overwriting a file.)
     *
     * @return True if a unique id should be added to the file name
     */
    @Override
    protected boolean useNameUnique()
    {
        return true;
    }

    /**
     * Returns a string representation of the object
     *
     * @return a string representation of the object
     */
    @Override
    public String toString()
    {
        return "TotalExpenseWriteDataFile{}" + TotalExpenseWriteDataFile.class;
    }
}
