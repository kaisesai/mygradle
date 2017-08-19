package com.liukai.toto.web.autowriter;

import com.liukai.toto.web.autowriter.strategy.BusinessStatusCodeGeneratorStrategy;
import com.liukai.toto.web.autowriter.strategy.CodeGeneratorStrategy;
import com.liukai.toto.web.autowriter.strategy.CountryCodeGeneratorStrategy;

import java.io.*;

/**
 * 类名：自动写代码工具类
 *
 * @desc 通过读取目标文件内容，定义相关的格式生成指定的代码
 * Created by liukai on 2017/6/9.
 */
public class AutoWriteCodeApp {

  public static void main(String[] args) {

    //生成如下格式的文件：53("53", "无状态", "WO", ""),NONE("53", "无状态", "WO", ""),
    LineNumberReader reader = null;
    BufferedWriter writer = null;
    try {
      CodeGeneratorStrategy strategy = new CountryCodeGeneratorStrategy();

      // 读取文件
      File file = new File(strategy.getSourceFile());
      reader = new LineNumberReader(new FileReader(file));

      // 写入文件
      File outFile = new File(strategy.getTargetFile());
      writer = new BufferedWriter(new FileWriter(outFile));

      // 读取内容
      String line;
      while ((line = reader.readLine()) != null) {
        String code = strategy.generateCode(reader.getLineNumber(), line);
        writer.write(code);
      }

      writer.flush();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      releaseResource(reader);
      releaseResource(writer);
    }

  }

  /**
   * 释放资源
   *
   * @param reader
   */
  private static void releaseResource(Reader reader) {
    if (reader != null) {
      try {
        reader.close();
      } catch (IOException e) {
      }
    }
  }

  /**
   * 释放资源
   *
   * @param reader
   */
  private static void releaseResource(Writer writer) {
    if (writer != null) {
      try {
        writer.close();
      } catch (IOException e) {
      }
    }
  }

}
