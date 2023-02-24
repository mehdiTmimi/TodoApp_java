package com.estf.todoapp.presentation.views;

import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.estf.todoapp.beans.Todo;
import com.estf.todoapp.business.DefaultServices;

public class TodoList extends JPanel{

	private List<Todo> todos;
	public TodoList() {
		super();
		todos=DefaultServices.getInstance().getAllTodos();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (Todo todo : todos) {
			add(new TodoItemPanel(todo));
		}
	}
}
