package com.study.todopartytest.todo;

import java.util.List;

import com.study.todopartytest.user.UserDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class TodoListResponseDTO {
	private UserDTO user;
	private List<TodoResponseDTO> todoList;

	public TodoListResponseDTO(UserDTO user, List<TodoResponseDTO> todoList) {
		this.user = user;
		this.todoList = todoList;
	}
}
