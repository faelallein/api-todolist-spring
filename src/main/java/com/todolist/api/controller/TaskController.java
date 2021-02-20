package com.todolist.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.todolist.api.model.Task;
import com.todolist.api.repository.TaskRepository;

//Indica que é uma classa RestController, 
@RestController

//Indica o caminho para acessar a classe
@RequestMapping("/api/tasks")
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;
	
	//Indica o retorno do verbo GET
	@GetMapping
	public List<Task> list(){		
		//Exemplo de um metodo ja fornecido pelo JPA
		return taskRepository.findAll();
	}
	
	//Indica o retorno do verbo POST
	@PostMapping
	//@RequestBody vai converter o corpo da requisição para o objeto java task
	public Task add(@RequestBody Task task) {
		return taskRepository.save(task);
	}
	
}
