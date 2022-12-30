package week_2_project.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import week_2_project.expense.TotalExpense;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

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
    private static final String WORKSHEET_NAME_EXCEL = "Excel Data Results";
    /**
     * Excel worksheet name for fixed (e.g. hard coded) data
     */
    private static final String WORKSHEET_NAME_FIXED = "Hard-coded Results";
    /**
     * object to write the total expense excel data file
     */
    private static TotalExpenseWriteDataFile totalExpenseWriteDataFile;

    /**
     * Default constructor
     */
    public TotalExpenseTest()
    {
        super();
    }

    /**
     * Formats the expense as a string
     *
     * @param totalExpense the expense to format
     * @return formatted expense
     */
    private static String formatString(TotalExpense totalExpense)
    {
        StringBuilder sb = new StringBuilder();

        NumberFormat format = NumberFormat.getCurrencyInstance();

        sb.append("Car name=").append(totalExpense.getName()).append("\n\n");
        sb.append("Purchase price=").append(format.format(totalExpense.getPurchasePrice())).append("\n\n");
        sb.append("Tires Cost=").append(format.format(totalExpense.getFourTires())).append("\n\n");
        sb.append("Oil Cost=").append(format.format(totalExpense.getOilChange())).append("\n\n");
        sb.append("Fuel Cost").append(format.format(totalExpense.getFuelCost())).append("\n\n");
        sb.append("Hotel=").append(format.format(totalExpense.getHotelCost())).append("\n\n");
        sb.append("Food=").append(format.format(totalExpense.getFoodCost())).append("\n\n");
        sb.append("Total=").append(format.format(totalExpense.getGrandTotalCost())).append("\n\n");

        return sb.toString();
    }


    /**
     * Returns the results to display
     *
     * @param totalExpenseList the list of total expense
     * @return the results to display
     */
    private static String getDisplayResults(ArrayList<TotalExpense> totalExpenseList)
    {
        StringBuilder sb = new StringBuilder();
        Iterator<TotalExpense> i = totalExpenseList.iterator();
        TotalExpense total = null;

        while (i.hasNext()){
            total = i.next();
            logger.debug("totalCost=" + total.toString());
            sb.append(formatString(total)).append("\n\n");
        }
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
        StringBuilder sb = new StringBuilder();
        sb.append("____________________");
        sb.append("\n");
        sb.append("____________________");
        sb.append("\n");

        if (args.length == 0)
        {
            sb.append("Horrible args! No glory.");
        } else
        {
            sb.append("All hail our Glorious Leader: ");
            for (int i = 0; i < args.length; i++)
            {
                sb.append(args).append(" ");
            }
            sb.append("!!!\n");
            sb.append("____________________");
            sb.append("\n");
            sb.append("____________________");
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Uses the data staged from excel or fixed (e.g. hard coded) to test logic and write the results to excel.
     *
     * @param useExcel true to use data from excel; false to use fixed (e.g. hard coded) data
     * @return the results of the test
     */
    private static String stageData(boolean useExcel)
    {
        StringBuilder sb = new StringBuilder();

        AutomobileTestData automobileTestData = new AutomobileTestData(useExcel);
        TotalExpenseTestCalculations totalExpenseTestCalculations = new TotalExpenseTestCalculations();
        TravelEntertainmentExpenseTestData travelEntertainmentExpenseTestData = new TravelEntertainmentExpenseTestData(useExcel);
        SalesTripTestData salesTripTestData = new SalesTripTestData(useExcel);
        AutomobileExpenseTestData automobileExpenseTestData = new AutomobileExpenseTestData(useExcel);

        logger.debug("automobileTestData: " + automobileTestData.toString());
        logger.debug("totalExpenseTestCalculations: " + totalExpenseTestCalculations.toString());
        logger.debug("travelEntertainmentExpenseTestData: " + travelEntertainmentExpenseTestData.toString());
        logger.debug("salesTripTestData" + salesTripTestData.toString());
        logger.debug("automobileExpenseTestData: " + automobileExpenseTestData.toString());

        totalExpenseTestCalculations.setAutomobileTestData(automobileTestData);
        totalExpenseTestCalculations.setAutomobileExpenseTestData(automobileExpenseTestData);
        totalExpenseTestCalculations.setSalesTripTestData(salesTripTestData);
        totalExpenseTestCalculations.setTravelEntertainmentExpenseData(travelEntertainmentExpenseTestData);

        ArrayList<TotalExpense> totalExpenses = totalExpenseTestCalculations.calculateTotals();
        totalExpenseTestCalculations.setTotalCostList(totalExpenses);

        sb.append(TotalExpenseTest.getDisplayResults(totalExpenses));

        TotalExpense grandTotal = totalExpenseTestCalculations.calculateGrandTotals();

        logger.debug("\n\n grandTotalCost: " + grandTotal.toString());

        sb.append(TotalExpenseTest.formatString(grandTotal)).append("\n\n");
        writeResults(useExcel, totalExpenses, grandTotal);


        return sb.toString();
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
        Iterator<TotalExpense> i = null;
        TotalExpense totalCost = null;

        String name;
        if (useExcel)
        {
            name = WORKSHEET_NAME_EXCEL;
        } else
        {
            name = WORKSHEET_NAME_FIXED;
        }

        totalExpenseWriteDataFile.setDataList(new ArrayList<ArrayList<Object>>());
        totalExpenseWriteDataFile.addTotalExpenseHeading();

        while (i.hasNext())
        {
            totalCost = i.next();
            totalExpenseWriteDataFile.addTotalExpense(totalCost);
            totalExpenseWriteDataFile.addWorksheet(name);

        }
    }


    /**
     * main method
     *
     * @param args the name of the VC
     */
    public static void main(String[] args)
    {
    StringBuilder sb = new StringBuilder();
    totalExpenseWriteDataFile = new TotalExpenseWriteDataFile();

    sb.append(gloriousArgs(args));
    sb.append(stageData(false));

        JOptionPane.showMessageDialog(null, sb.toString());

        sb.setLength(0);
        sb.append(stageData(true));

        JOptionPane.showMessageDialog(null, sb.toString());

        totalExpenseWriteDataFile.writeFile();


    }
}
