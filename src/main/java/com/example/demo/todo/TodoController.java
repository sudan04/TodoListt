package com.example.demo.todo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	ArrayList<Todo> todoList = new ArrayList<>();

    
	@GetMapping("/newTodo")
	public String showTodo(Model model)
	{
		model.addAttribute("todos",todoList);
		return "todolist";
	}
	
//	@GetMapping("/newTodo/add/{x}")
//	public String addTodo(@PathVariable("x")String x , Model model)
//	{
//		todoList.add(new Todo(x));
//		return showTodo(model);
//	}
	
	@PostMapping("/newTodo/add")
	public String addTodo(@RequestParam(name = "title") String title,@RequestParam(name = "desc") String desc, Model model)
	{
//		System.out.println(todo);
		
		todoList.add(new Todo(title, desc));
		return showTodo(model);
	}
	
	
	@GetMapping("/newTodo/delete/{id}")
	public String deleteTodo(@PathVariable("id") int id, Model model)
	{
		todoList.removeIf(t->t.getId()==id);
		return showTodo(model);
	}
}