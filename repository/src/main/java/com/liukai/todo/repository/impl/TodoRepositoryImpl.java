package com.liukai.todo.repository.impl;

import com.liukai.todo.model.ToDoItem;
import com.liukai.todo.repository.TodoRepository;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by liukai on 2017/6/8.
 */
public class TodoRepositoryImpl implements TodoRepository {

  private AtomicInteger atomicIdGenerator = new AtomicInteger(0);
  private ConcurrentHashMap<Integer, ToDoItem> storeMap = new ConcurrentHashMap<>();

  @Override
  public ToDoItem findById(Integer id) {
    return storeMap.get(id);
  }

  @Override
  public Integer save(ToDoItem item) {
    item.setId(atomicIdGenerator.incrementAndGet());
    storeMap.putIfAbsent(item.getId(), item);
    return item.getId();
  }

  @Override
  public Integer update(ToDoItem item) {
    ToDoItem toDoItem = storeMap.get(item.getId());
    storeMap.replace(item.getId(), item);
    return item.getId();
  }

  @Override
  public Integer delete(Integer id) {
    storeMap.remove(id);
    return id;
  }

  @Override
  public List<ToDoItem> list() {
    return storeMap.values().stream().collect(Collectors.toList());

  }


  /**
   * 获获取每毫升的价格
   * @param name
   * @return
   */
  public static long getPriceForPerMilliliter(String name) {
    // 提取ml之前的数字
    int index = name.indexOf("ml");
    if(index <=0){
      return index;
    }
    // 抽取数字
    StringBuilder sb = new StringBuilder();
    for (int i = index-1; i >= 0 ; i--) {
      char c = name.charAt(i);
      if(!ArrayUtils.contains(NUMS, c)){
        break;
      }
      sb.append(c);
      //      sb.insert(0, c);
    }
    long volume;
    try {
      volume = Long.parseLong(sb.reverse().toString());
    } catch (NumberFormatException e) {
      volume = -1;
    }
    return volume;
  }

  public static void main(String[] args) {
    long priceForPerMilliliter = getPriceForPerMilliliter("djie 100ml");
    System.out.println(priceForPerMilliliter);
  }


  /**
   * 容量单位（毫升）
   */
  public static final String VOLUME_UNIT_ML = "ml";

  /**
   * 字符常量
   */
  public static final char[] NUMS= {'0','1','2','3','4','5','6','7','8','9','.'};
}
