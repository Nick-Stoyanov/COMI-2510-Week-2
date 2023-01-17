package week_2_project.poi;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;


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
    private XSSFWorkbook workbook = new XSSFWorkbook();

    /**
     * Default constructor
     */
    public PoiWriteDataList()
    {
        super();

    }

    /**
     * Adds the data list to the worksheet.
     *
     * @param worksheetName the name of the worksheet.
     */
    public void addWorksheet(String worksheetName)
    {
        Row row = null;
        Cell cell = null;
        ArrayList<Object> dataListRow = null;
        Object field = null;

        XSSFSheet sheet = this.getWorkbook().createSheet(worksheetName);
        ArrayList<ArrayList<Object>> dataList = getDataList();

        for (int i = 0; i < dataList.size(); i++)
        {
            row = sheet.createRow(i);
            dataListRow = dataList.get(i);
            for (int j = 0; j < dataListRow.size(); j++)
            {
                cell = row.createCell(j);
                field = dataListRow.get(j);
                logger.debug("Field-" + field.toString());

                setCell(cell, field);
            }
        }

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
    private XSSFWorkbook getWorkbook()
    {
        return workbook;
    }

    /**
     * Sets workbook
     * @param workbook the workbook to set
     */
    private void setWorkbook(XSSFWorkbook workbook){
        this.workbook = workbook;
    }

    /**
     * Initializes
     */
    public void Initialize() {
        this.setWorkbook(new XSSFWorkbook());
    }

    /**
     * Sets the field value into the cell
     *
     * @param cell  the cell to update
     * @param field the field value into the cell
     */
    private void setCell(Cell cell,
                         Object field)
    {
        if (field instanceof String)
        {
            cell.setCellValue((String) field);
        } else if (field instanceof Integer)
        {
            cell.setCellValue((Integer) field);
        } else if (field instanceof Double)
        {
            cell.setCellValue((Double) field);
        } else if (field instanceof Character)
        {
            String str = String.valueOf(field);
            cell.setCellValue(str.charAt(0));
        }
        logger.error("ERROR. Unable to add dell data to: Cell-" + cell.toString() + "Field-" + field.toString());

    }

    /**
     * True if a unique id should be added to the file name.
     * (Helps prevent incorrectly overwriting a file.)
     *
     * @return True if a unique id should be added to the file name
     */
    protected abstract boolean useNameUnique();

    /**
     * Write the worksheet to the Excel file.
     */
    public void writeFile()
    {
        try
        {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getFilePath());
            sb.append(this.getFileNamePrefix());

            if (this.useNameUnique())
            {
                sb.append(",");
                sb.append(UUID.randomUUID());
            }
            sb.append(this.getFileNameSuffix());

            logger.debug(sb.toString());

            FileOutputStream outputStream = new FileOutputStream(sb.toString());
            this.getWorkbook().write(outputStream);
            this.getWorkbook().close();

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


}

