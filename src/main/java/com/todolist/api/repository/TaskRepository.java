package com.todolist.api.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.todolist.api.model.*;

@Repository //Indica que a inteface é um repository, repository é responsavel por interagir com o BD
public interface TaskRepository extends JpaRepository<Task, Long>{ //<Tipo da entidade, Tipo do ID>
	//Jpa fornece a implementação em tempo de execução
	//Jpa ja fornece os metodos principais
}
