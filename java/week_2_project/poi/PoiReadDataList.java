package week_2_project.poi;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * The data list that results from reading an Excel file
 *
 * @author Nick
 */
public class PoiReadDataList
{
    /**
     * Get instance of the logger
     */
    private static final Logger logger = LogManager.getLogger(PoiReadDataList.class.getName());
    /**
     * The maximum number of columns
     */
    private int maxColumns;
    /**
     * The maximum number of rows
     */
    private int maxRows;

    /**
     * The data list
     */
    private ArrayList<ArrayList<PoiData>> testDataList;

    /**
     * Constructor
     *
     * @param fileName  file name
     * @param worksheet worksheet
     */
    public PoiReadDataList(String fileName, int worksheet)
    {

        testDataList = new ArrayList<>();
        try
        {
            FileInputStream excelFile = new FileInputStream(fileName);
            @SuppressWarnings("resource")
            Workbook workbook = new XSSFWorkbook(excelFile);

            // worksheets are numbered starting at 0
            Sheet datatypeSheet = workbook.getSheetAt(worksheet);

            for (Row currentRow : datatypeSheet)
            {
                logger.debug("--Row Begin--");
                for (Cell currentCell : currentRow)
                {
                    if (currentCell.getCellType() == CellType.STRING)
                    {
                        logger.debug("\tCellType.STRING=" + currentCell.getStringCellValue());
                        testDataList.add((ArrayList<PoiData>) currentCell);
                    } else if (currentCell.getCellType() == CellType.NUMERIC)
                    {
                        logger.debug("\tCellType.NUMERIC=" + currentCell.getNumericCellValue());
                    } else
                    {
                        logger.error("\tCellType._NONE=");
                    }
                } // end while for cols
                logger.debug("--Row End--");
            }

        } catch (FileNotFoundException e)
        {

            e.printStackTrace();
            logger.error(ExceptionUtils.getStackTrace(e));
        } catch (IOException e)
        {
            e.printStackTrace();
            logger.error(ExceptionUtils.getStackTrace(e));
        }
    }


    /**
     * This is an overloaded method that adds the value to the list
     *
     * @param rowDataList the list add to
     * @param row         the row number
     * @param col         the column number
     * @param cellValue   the cell value
     */
    private void addCellData(ArrayList<PoiData> rowDataList,
                             int row,
                             int col,
                             double cellValue)
    {

    }

    /**
     * This is an overloaded method that adds the value to the list
     *
     * @param rowDataList the list add to
     * @param row         the row number
     * @param col         the column number
     * @param cellValue   the cell value
     */
    private void addCellData(ArrayList<PoiData> rowDataList,
                             int row,
                             int col,
                             String cellValue)
    {

    }

    /**
     * Reads the Excel file and adds the result to the data list
     *
     * @param fileName  the file name
     * @param worksheet the worksheet number
     */
    private void getExcelData(String fileName,
                              int worksheet)
    {

    }

    /**
     * Returns a string representation
     *
     * @return string representation
     */
    @Override
    public String toString()
    {
        return "PoiReadDataList{" +
                "maxColumns=" + maxColumns +
                ", maxRows=" + maxRows +
                ", testDataList=" + testDataList +
                '}';
    }

    /**
     * This method will transpose the in the list so that
     * the rows become the columns and the columns become the rows.
     *
     * @return the transposed data list
     */
    public ArrayList<ArrayList<PoiData>> getTransposedTestDataList()
    {

        return testDataList;

    }


    /**
     * Returns the maximum number of columns
     *
     * @return the maxColumns
     */
    public int getMaxColumns()
    {
        return maxColumns;
    }

    /**
     * Sets the maximum number of columns
     *
     * @param maxColumns the maxColumns to set
     */
    private void setMaxColumns(int maxColumns)
    {
        this.maxColumns = maxColumns;
    }

    /**
     * Returns the maximum number of rows
     *
     * @return the maxRows
     */
    public int getMaxRows()
    {
        return maxRows;
    }

    /**
     * Sets the maximum number of rows
     *
     * @param maxRows the maxRows to set
     */
    private void setMaxRows(int maxRows)
    {
        this.maxRows = maxRows;
    }

    /**
     * Returns the data list that results from reading an Excel file
     *
     * @return the testDataList
     */
    public ArrayList<ArrayList<PoiData>> getTestDataList()
    {
        return testDataList;
    }

    /**
     * Sets the data list that results from reading an Excel file
     *
     * @param testDataList the testDataList to set
     */
    private void setTestDataList(ArrayList<ArrayList<PoiData>> testDataList)
    {
        this.testDataList = testDataList;
    }
}
