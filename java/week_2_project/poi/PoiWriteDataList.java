package week_2_project.poi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;


/**
 * Abstract class to write the data list to an Excel file
 *
 * @author Nick
 */
public abstract class PoiWriteDataList
{


    /**
     * Get an instance of the Logger
     */
    private static final Logger logger = LogManager.getLogger(PoiWriteDataList.class.getName());


    /**
     * The workbook
     */
    private XSSFWorkbook workbook;

    /**
     * Default constructor
     */
    public PoiWriteDataList()
    {
    }

    /**
     * Adds the data list to the worksheet.
     *
     * @param worksheetName the name of the worksheet.
     */
    public void addWorksheet(String worksheetName)
    {

    }

    /**
     * Returns the list (rows) of lists (columns) that represent
     * the result to be written to the worksheet
     *
     * @return the list (rows) of lists (columns) that represent
     * the result to be written to the worksheet
     */
    public abstract ArrayList<ArrayList<Object>> getDataList();

    /**
     * Returns the file name prefix (e.g. 'FileName')
     *
     * @return returns the file name prefix
     */
    protected abstract String getFileNamePrefix();

    /**
     * Returns the file name suffix (e.g. '.xlsx')
     *
     * @return returns the file name prefix
     */
    protected abstract String getFileNameSuffix();

    /**
     * Returns the path of the file
     *
     * @return the path of the file
     */
    protected abstract String getFilePath();


    /**
     * Returns the workbook
     *
     * @return the workbook
     */
    private org.apache.poi.xssf.usermodel.XSSFWorkbook getWorkbook()
    {
        return workbook;
    }

    /**
     * Sets the field value into the cell
     *
     * @param cell  the cell to update
     * @param field the field value into the cell
     */
    private void setCell(org.apache.poi.ss.usermodel.Cell cell,
                         Object field)
    {

    }

    /**
     * True if a unique id should be added to the file name.
     * (Helps prevent incorrectly overwriting a file.)
     *
     * @return True if a unique id should be added to the file name
     */
    protected abstract boolean useNameUnique();

    /**
     * Write the worksheet to the excel file.
     */
    public void writeFile()
    {

    }


}

