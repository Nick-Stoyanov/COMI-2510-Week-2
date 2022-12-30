package week_2_project.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import week_2_project.common.UniqueKeyCounter;
import week_2_project.expense.TotalExpense;

import java.util.ArrayList;

/**
 * Total expense test calculations
 *
 * @author Nick
 */
public class TotalExpenseTestCalculations extends UniqueKeyCounter
{
    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(TotalExpenseTestCalculations.class.getName());

    /**
     * Automobile expense test data
     */
    private AutomobileExpenseTestData automobileExpenseTestData;

    /**
     * Sets the automobile test data
     *
     * @param automobileTestData the automobileTestData to set
     */
    public void setAutomobileTestData(AutomobileTestData automobileTestData)
    {
        this.automobileTestData = automobileTestData;
    }

    /**
     * Automobile test data
     */
    private AutomobileTestData automobileTestData;

    /**
     * Unique object key
     */
    private int key;

    /**
     * Sales trip test data
     */
    private SalesTripTestData salesTripTestData;

    /**
     * total cost list
     */
    private ArrayList<TotalExpense> totalCostList;

    /**
     * Travel and entertainment expense test data
     */
    private TravelEntertainmentExpenseTestData travelEntertainmentExpenseTestData;

    /**
     * Constructor
     */
    public TotalExpenseTestCalculations()
    {
    }

    /**
     * Calculates the grand totals of the expenses
     *
     * @return the grand totals of the expenses
     */
    public TotalExpense calculateGrandTotals()
    {
        return null;
    }


    /**
     * Calculate the expense totals
     *
     * @return the expense totals
     */
    public ArrayList<TotalExpense> calculateTotals()
    {
        return null;
    }

    /**
     * Returns the automobile test data
     *
     * @return the AutomobileTestDataPoi
     */
    public AutomobileTestData getAutomobileTestData()
    {
        return null;
    }

    /**
     * Returns the automobile expense test data
     *
     * @return the AutomobileExpenseTestDataPoi
     */
    public AutomobileExpenseTestData getExpenseTestData()
    {
        return null;
    }

    /**
     * Returns the sales trip test data
     *
     * @return the SalesTripTestDataPoi
     */
    public SalesTripTestData getSalesTripTestData()
    {
        return null;
    }

    /**
     * Sets the sales trip test data
     *
     * @param salesTripTestData the salesTripTestData to set
     */
    public void setSalesTripTestData(SalesTripTestData salesTripTestData)
    {

    }

    /**
     * Returns the total cost list
     *
     * @return the total cost list
     */
    public ArrayList<TotalExpense> getTotalCostList()
    {
        return null;
    }

    /**
     * Sets the total cost list
     *
     * @param totalCostList the totalCostList to set
     */
    public void setTotalCostList(ArrayList<TotalExpense> totalCostList)
    {

    }

    /**
     * Returns the travel and entertainment test data
     *
     * @return the TravelEntertainmentExpenseTestDataPoi
     */
    public TravelEntertainmentExpenseTestData getTravelExpenseData()
    {
        return null;
    }

    /**
     * Sets the automobile test data
     *
     * @param automobileExpenseTestData the automobileTestData to set
     */
    public void setAutomobileExpenseTestData(AutomobileExpenseTestData automobileExpenseTestData)
    {

    }

    /**
     * Sets the travel and entertainment expense data
     *
     * @param travelEntertainmentExpenseTestData the travelEntertainmentExpenseTestData to set
     */
    public void setTravelEntertainmentExpenseData(TravelEntertainmentExpenseTestData travelEntertainmentExpenseTestData)
    {

    }


    /**
     * Returns the key
     *
     * @return the key
     */
    @Override
    public int getKey()
    {
        return 0;
    }

    /**
     * Returns the key for the object
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
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
        return "TotalExpenseTestCalculations{" +
                "automobileExpenseTestData=" + automobileExpenseTestData +
                ", automobileTestData=" + automobileTestData +
                ", key=" + key +
                ", salesTripTestData=" + salesTripTestData +
                ", totalCostList=" + totalCostList +
                ", travelEntertainmentExpenseTestData=" + travelEntertainmentExpenseTestData +
                '}';
    }
}
