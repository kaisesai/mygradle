package com.liukai.todo.repository.impl;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by liukai on 2017/6/14.
 */
public class StringTest {

  static final char[] NUMS = {'0','1','2','3','4','5','6','7','8','9'};

  /** 根据毫秒计算天数 */
  public static String getDaysHoursMinutesByMillis(long millis){
    StringBuilder result = new StringBuilder();
    BigDecimal days = new BigDecimal(millis).divide(new BigDecimal(24 * 60 * 60 * 1000), 3, BigDecimal.ROUND_HALF_UP);
    String daysStr = days.toString();
    String[] daysArray = daysStr.split("\\.");
    if(ArrayUtils.isEmpty(daysArray)){
      return result.toString();
    }
    int day = Integer.parseInt(daysArray[0]);
    if(day > 0){
      result.append(day).append("天");
    }

    if(daysArray.length == 1){
      return result.toString();
    }

    String hoursStr = String.valueOf(Double.parseDouble("0." + daysArray[1]) * 24);
    String[] hoursArray = hoursStr.split("\\.");
    if(ArrayUtils.isEmpty(hoursArray)){
      return result.toString();
    }

    int hour = Integer.parseInt(hoursArray[0]);
    if(hour > 0){
      result.append(hour).append("时");
    }

    if(hoursArray.length == 1){
      return result.toString();
    }

    String minutesStr = String.valueOf(Double.parseDouble("0." + hoursArray[1]) * 60);
    String[] minutesArray = minutesStr.split("\\.");
    if(ArrayUtils.isEmpty(hoursArray)){
      return result.toString();
    }

    int minute = Integer.parseInt(minutesArray[0]);
    if(minute > 0){
      result.append(minute).append("分");
    }
    return result.toString();
  }

  @Test
  public void dateTest(){
    String[] split = "0.1111".split("\\.");
    System.out.println(Arrays.asList(split));

    System.out.println(getDaysHoursMinutesByMillis(1000000000));
  }


  /**
   * 测试提取字符串
   */
  @Test
  public void charTest(){
    StringBuilder sb = new StringBuilder();
    String name = "化妆品 AMBC 100ml 高级";
    boolean flag = StringUtils.contains(name, "ml");
    if(flag){
      // 提取ml之前的数字
      int index = name.indexOf("ml");
      if(index>0){
        // 抽取数字
        for (int i = index-1; i >= 0 ; i--) {
          char c = name.charAt(i);
          if(!ArrayUtils.contains(NUMS, c)){
            break;
          }
          sb.insert(0, c);
        }
      }

    }
    System.out.println(sb);
  }

  @Test
  public void testBigDecimal(){
    BigDecimal bigDecimal = new BigDecimal(-0.5);
    System.out.println(bigDecimal);
    System.out.println(bigDecimal.longValue());
  }

}
