package com.liukai.todo.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

/**
 * Excel工具类
 *
 * @author liukai
 */
public class ExcelUtils {

  public static void main(String[] args) throws IOException, InvalidFormatException {
    String fileName = "/Users/liukai/Desktop/look品类.xlsx";
    // 1. 读取Excel文件 Use a file
    Workbook wb = readExcel(fileName);
    // 遍历sheet
    for (Sheet sheet : wb) {
      System.out
          .println("[read excel: " + fileName + "][current sheet: " + sheet.getSheetName() + "]");
      // 遍历行
      for (Row row : sheet) {
        StringBuilder sb = new StringBuilder(
            "insert into sto_cate_info (`cate_lv1`,`cate_lv2`,`cate_lv3`,`cate_code`) values (");
        for (Cell cell : row) {
          sb.append("'").append(cell.getStringCellValue()).append("'").append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(");");
        System.out.println(sb);
      }
    }
  }

  /**
   * 读取Excel文件
   *
   * @param fileName
   * @return
   * @throws IOException
   * @throws InvalidFormatException
   */
  public static Workbook readExcel(String fileName) throws IOException, InvalidFormatException {
    return WorkbookFactory.create(new File(fileName));
  }
}
