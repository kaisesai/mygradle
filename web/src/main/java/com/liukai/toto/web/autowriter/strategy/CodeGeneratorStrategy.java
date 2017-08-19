package com.liukai.toto.web.autowriter.strategy;

/**
 * 抽象代码生成策略
 * Created by liukai on 2017/6/9.
 */
public interface CodeGeneratorStrategy {

  String filePath = "/Users/liukai/Downloads/";

  /**
   * 生成代码字符串
   * @param reader
   * @return
   */
  String generateCode(int lineNum, String line);

  String getSourceFile();

  String getTargetFile();
}
