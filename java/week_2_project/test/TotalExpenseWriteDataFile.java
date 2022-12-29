package week_2_project.test;

import week_2_project.expense.TotalExpense;
import week_2_project.poi.PoiWriteDataList;

import java.util.ArrayList;

/**
 * Writes the total expense excel data file
 *
 * @author Nick
 */
public class TotalExpenseWriteDataFile extends PoiWriteDataList
{
    /**
     * Default constructor
     */
    public TotalExpenseWriteDataFile()
    {
    }

    /**
     * Add the total expense to the data list
     *
     * @param totalExpense total expense to add to the data list
     */
    public void addTotalExpense(TotalExpense totalExpense)
    {

    }


    /**
     * Add the total expense heading to the data list
     */
    public void addTotalExpenseHeading()
    {

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
        return null;
    }

    /**
     * Sets the data list of lists
     *
     * @param dataList the dataList to set
     */
    public void setDataList(ArrayList<ArrayList<Object>> dataList)
    {

    }

    /**
     * Returns the file name prefix (e.g. 'FileName')
     *
     * @return returns the file name prefix
     */
    @Override
    protected String getFileNamePrefix()
    {
        return null;
    }

    /**
     * Returns the file name suffix (e.g. '.xlsx')
     *
     * @return returns the file name prefix
     */
    @Override
    protected String getFileNameSuffix()
    {
        return null;
    }

    /**
     * Returns the path of the file
     *
     * @return the path of the file
     */
    @Override
    protected String getFilePath()
    {
        return null;
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
