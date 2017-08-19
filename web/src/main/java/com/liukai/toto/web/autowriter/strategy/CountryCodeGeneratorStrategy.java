package com.liukai.toto.web.autowriter.strategy;

/**
 * 国家三字码代码生成策略类
 * Created by liukai on 2017/6/9.
 */
public class CountryCodeGeneratorStrategy implements CodeGeneratorStrategy {

  private String sourceFile = filePath + "CountryCode.txt";// 源文件

  private String targetFile = filePath + "CountryCode_autoGenerate_code.txt";// 目标文件

  private static final String CODE_PREFFIX = "COUNTRY_CODE_";

  @Override
  public String generateCode(int lineNum, String line) {
    // a101("101","阿富汗","afuhan");
    StringBuilder sb = new StringBuilder();
    switch (lineNum % 3) {
      case 0:
        sb.append("\"").append(line).append("\"").append("), ").append("\r");
        break;
      case 1:
        sb.append(CODE_PREFFIX).append(line).append("(\"").append(line).append("\"").append(", ");
        break;
      case 2:
        sb.append("\"").append(line).append("\"").append(", ");
        break;
      default:
        break;
    }
    return sb.toString();
  }

  public String getSourceFile() {
    return sourceFile;
  }

  public String getTargetFile() {
    return targetFile;
  }
}
