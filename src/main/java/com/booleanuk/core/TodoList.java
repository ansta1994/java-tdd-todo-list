package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> Todo;

    public TodoList() {
        this.Todo = new ArrayList<>();
    }

    public boolean add(Task task) {
        Todo.add(task);
        return Todo.contains(task);
    }

    public boolean remove(Task task) {
        Todo.remove(task);
        return Todo.contains(task);
    }

}
