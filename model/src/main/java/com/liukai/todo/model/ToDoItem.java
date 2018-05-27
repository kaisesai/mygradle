package com.liukai.todo.model;

import org.springframework.util.CollectionUtils;

/**
 * Created by liukai on 2017/6/4.
 */
public class ToDoItem {

  private Integer id;

  private String name;

  private String desc;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "ToDoItem{" + "id=" + id + ", name='" + name + '\'' + ", desc='" + desc + '\'' + '}';
  }

  public static void main(String[] args) {
    // String name = "aaaa";
    // String newName = StringUtils.substring(name, 0, 255);
    // System.out.println(newName);
    // name = "fjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nfffffffffffffjiwenfiwenfinweifwnifnweifnweifnwiefnineiwnfini23j4iji32jrifneifnienfi2nffffffffffff";
    // newName = StringUtils.substring(name, 0, 255);
    // System.out.println(newName);

    // 冒泡排序,将最大先挑选出来
    int[] array = {100, 3, 32, 4, 15, 102, 87};
    int index = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        // 第一个元素
        int temp = array[i];
        // 下个元素
        int next = array[j];
        if (temp > next) {
          array[i] = next;
          array[j] = temp;
        }
        System.out.println("循环次数: " + ++index);
      }
    }

    // 5 + 4+ 3 +2 + 1 =
    System.out.println(CollectionUtils.arrayToList(array));

  }
}
