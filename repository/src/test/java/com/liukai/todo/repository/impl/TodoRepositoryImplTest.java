package com.liukai.todo.repository.impl;

import com.liukai.todo.model.ToDoItem;
import com.liukai.todo.repository.TodoRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by liukai on 2017/6/11.
 */
public class TodoRepositoryImplTest {

  private TodoRepository todoRepository;

  @Before
  public void setUp() {
    todoRepository = new TodoRepositoryImpl();
  }

  @Test
  public void save() throws Exception {
    int itemNum = 1;
    String items = System.getProperty("items");
    if (items != null) {
      itemNum = Integer.parseInt(items);
    }

    createAndInsertTodoItem(itemNum);
    List<ToDoItem> list = todoRepository.list();
    // 断言
//    Assert.notEmpty(list);
    System.out.println(list);
    //    Assert.assertNull(id);
    //    Assert.assertNotNull(id);
    //    ToDoItem presisitedTodoItem = todoRepository.findById(id);
    // 断言
    //        Assert.assertNotNull(list);
    //    Assert.assertEquals(newToDoItem, presisitedTodoItem);

  }

  private void createAndInsertTodoItem(int itemNum) {
    System.out.println("start create todoItem and insert...");

    for (int i = 0; i < itemNum; i++) {
      ToDoItem newToDoItem = new ToDoItem();
      newToDoItem.setName("sephiroth " + i);
      newToDoItem.setDesc("crazy man " + i);
      Integer id = todoRepository.save(newToDoItem);
    }
  }

  @Test
  public void update() throws Exception {

  }

  @Test
  public void delete() throws Exception {

  }

  @Test
  public void list() throws Exception {

  }

}
