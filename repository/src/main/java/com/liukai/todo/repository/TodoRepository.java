package com.liukai.todo.repository;

import com.liukai.todo.model.ToDoItem;

import java.util.List;

/**
 * Created by liukai on 2017/6/5.
 */
public interface TodoRepository {

  ToDoItem findById(Integer id);

  Integer save(ToDoItem item);

  Integer update(ToDoItem item);

  Integer delete(Integer id);

  List<ToDoItem> list();

}
