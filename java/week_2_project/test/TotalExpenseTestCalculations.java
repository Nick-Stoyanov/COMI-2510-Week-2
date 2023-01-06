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
        super();

        this.key = super.getInternalCounter();


    }

    /**
     * Calculates the grand totals of the expenses
     *
     * @return the grand totals of the expenses
     */
    public TotalExpense calculateGrandTotals()
    {

        TotalExpense totalExpense = new TotalExpense("Grand Total");
        for (int i = 0; i < totalCostList.size(); i++)
        {
            totalExpense.addFoodCost(totalCostList.get(i).getFoodCost());
            totalExpense.addHotelCost(totalCostList.get(i).getHotelCost());
            totalExpense.addFuelCost(totalCostList.get(i).getFuelCost());
            totalExpense.addOilChange(totalCostList.get(i).getOilChange());
            totalExpense.addFourTires(totalCostList.get(i).getFourTires());
            totalExpense.addPurchasePrice(totalCostList.get(i).getPurchasePrice());
        }

        return totalExpense;
    }

    /**
     * Calculate the expense totals
     *
     * @return the expense totals
     */
    public ArrayList<TotalExpense> calculateTotals()
    {
        totalCostList = new ArrayList<>();
        for (int i = 0; i < automobileTestData.getTestDataList().size(); i++)
        {
            String name = automobileTestData.getTestDataList().get(i).getName();
            TotalExpense expense = new TotalExpense(name);

            for (int j = 0; j < travelEntertainmentExpenseTestData.testDataList.size(); j++)
            {
                if (name.equals(travelEntertainmentExpenseTestData.getTestDataList().get(j).getFood().getName()))
                {
                    expense.setFoodCost(travelEntertainmentExpenseTestData.getFoodExpense(name).getExpense());
                    expense.setHotelCost(travelEntertainmentExpenseTestData.getFoodExpense(name).getExpense());
                }
            }

            for (int k = 0; k < automobileExpenseTestData.testDataList.size(); k++)
            {
                if (name.equals(automobileExpenseTestData.getTestDataList().get(k).getName()))
                {
                    expense.addFuelCost(automobileExpenseTestData.getFuelExpense(name).getExpense());
                    expense.addOilChange(automobileExpenseTestData.getOilExpense(name).getExpense());
                    expense.addFourTires(automobileExpenseTestData.getOilExpense(name).getExpense());
                    expense.addPurchasePrice(automobileExpenseTestData.getPurchasePriceExpense(name).getExpense());
                }
            }


            totalCostList.add(expense);

        }
        return totalCostList;
    }

    /**
     * Returns the automobile test data
     *
     * @return the AutomobileTestDataPoi
     */
    public AutomobileTestData getAutomobileTestData()
    {
        return automobileTestData;
    }

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
     * Returns the automobile expense test data
     *
     * @return the AutomobileExpenseTestDataPoi
     */
    public AutomobileExpenseTestData getExpenseTestData()
    {
        return automobileExpenseTestData;
    }

    /**
     * Returns the sales trip test data
     *
     * @return the SalesTripTestDataPoi
     */
    public SalesTripTestData getSalesTripTestData()
    {
        return salesTripTestData;
    }

    /**
     * Sets the sales trip test data
     *
     * @param salesTripTestData the salesTripTestData to set
     */
    public void setSalesTripTestData(SalesTripTestData salesTripTestData)
    {
        this.salesTripTestData = salesTripTestData;
    }

    /**
     * Returns the total cost list
     *
     * @return the total cost list
     */
    public ArrayList<TotalExpense> getTotalCostList()
    {
        return totalCostList;
    }

    /**
     * Sets the total cost list
     *
     * @param totalCostList the totalCostList to set
     */
    public void setTotalCostList(ArrayList<TotalExpense> totalCostList)
    {
        this.totalCostList = totalCostList;
    }

    /**
     * Returns the travel and entertainment test data
     *
     * @return the TravelEntertainmentExpenseTestDataPoi
     */
    public TravelEntertainmentExpenseTestData getTravelExpenseData()
    {
        return travelEntertainmentExpenseTestData;
    }

    /**
     * Sets the automobile test data
     *
     * @param automobileExpenseTestData the automobileTestData to set
     */
    public void setAutomobileExpenseTestData(AutomobileExpenseTestData automobileExpenseTestData)
    {
        this.automobileExpenseTestData = automobileExpenseTestData;
    }

    /**
     * Sets the travel and entertainment expense data
     *
     * @param travelEntertainmentExpenseTestData the travelEntertainmentExpenseTestData to set
     */
    public void setTravelEntertainmentExpenseData(TravelEntertainmentExpenseTestData travelEntertainmentExpenseTestData)
    {
        this.travelEntertainmentExpenseTestData = travelEntertainmentExpenseTestData;
    }


    /**
     * Returns the key
     *
     * @return the key
     */
    @Override
    public int getKey()
    {
        return key;
    }

    /**
     * Returns the key for the object
     *
     * @param key the key
     */
    @Override
    protected void setKey(int key)
    {
        this.key = key;
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
