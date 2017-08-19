package com.liukai.toto.web.autowriter.strategy;

/**
 * 业务状态代码代码生成策略
 * Created by liukai on 2017/6/9.
 */
public class BusinessStatusCodeGeneratorStrategy implements CodeGeneratorStrategy {

  private String sourceFile = filePath + "BusinessStatusEnum.txt";// 源文件

  private String targetFile = filePath + "BusinessStatusEnum_autoGenerate_code.txt";// 目标文件

  @Override
  public String generateCode(int lineNum, String line) {
    StringBuilder sb = new StringBuilder();
    switch (lineNum % 4) {
      case 0:
        sb.append("\"").append(line).append("\"").append("), ").append("\r");
        break;
      case 1:
        sb.append(line).append("(\"").append(line).append("\"").append(", ");
        break;
      case 2:
        sb.append("\"").append(line).append("\"").append(", ");
        break;
      case 3:
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
