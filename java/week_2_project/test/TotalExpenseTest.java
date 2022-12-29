package week_2_project.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import week_2_project.expense.TotalExpense;

import java.util.ArrayList;

/**
 * Total expense test
 *
 * @author Nick
 */
public class TotalExpenseTest
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTest.class.getName());
    /**
     * Excel worksheet name for excel data
     */
    private static final String WORKSHEET_NAME_EXCEL = null;
    /**
     * Excel worksheet name for fixed (e.g. hard coded) data
     */
    private static final String WORKSHEET_NAME_FIXED = null;
    /**
     * object to write the total expense excel data file
     */
    private static TotalExpenseWriteDataFile totalExpenseWriteDataFile;

    /**
     * Default constructor
     */
    public TotalExpenseTest()
    {
    }

    /**
     * Formats the expense as a string
     *
     * @param totalExpense       the expense to format
     * @param automobileTestData automobile test data
     * @return formatted expense
     */
    private static String formatString(TotalExpense totalExpense,
                                       AutomobileTestData automobileTestData)
    {
        return null;
    }


    /**
     * Returns the results to display
     *
     * @param totalExpenseList   the list of total expenses
     * @param automobileTestData automobile test data
     * @return the results to display
     */
    private static String getDisplayResults(ArrayList<TotalExpense> totalExpenseList,
                                            AutomobileTestData automobileTestData)
    {
        return null;
    }

    /**
     * Glorious handling the command line arguments
     *
     * @param args the command line arguments
     * @return the command line arguments handled gloriously
     */
    private static String gloriousArgs(String[] args)
    {
        return null;
    }

    /**
     * Uses the data staged from excel or fixed (e.g. hard coded) to test logic and write the results to excel.
     *
     * @param useExcel true to use data from excel; false to use fixed (e.g. hard coded) data
     * @return the results of the test
     */
    private static String stageData(boolean useExcel)
    {
        return null;
    }

    /**
     * Writes the results to excel
     *
     * @param useExcel       true to data was from excel; false it was fixed (e.g. hard coded) data
     * @param totalCostList  the total cost list
     * @param grandTotalCost the grand total cost
     */
    private static void writeResults(boolean useExcel,
                                     ArrayList<TotalExpense> totalCostList,
                                     TotalExpense grandTotalCost)
    {

    }


    /**
     * main method
     *
     * @param args the name of the VC
     */
    public static void main(String[] args)
    {

    }
}
