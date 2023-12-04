package com.study.todoPartyTest.entity;

import com.study.todopartytest.todo.Todo;
import com.study.todopartytest.todo.TodoRequestDTO;
import com.study.todopartytest.todo.TodoResponseDTO;

public interface TodoTest extends CommonTest {


    Long TEST_TODO_ID = 1L;
    String TEST_TODO_TITLE = "title";
    String TEST_TODO_CONTENT = "content";

    TodoRequestDTO TEST_TODO_REQUEST_DTO = TodoRequestDTO.builder()
        .title(TEST_TODO_TITLE)
        .content(TEST_TODO_CONTENT)
        .build();

    TodoResponseDTO TEST_TODO_RESPONSE_DTO = TodoResponseDTO.builder()
        .title(TEST_TODO_TITLE)
        .content(TEST_TODO_CONTENT)
        .build();

    Todo TEST_TODO = Todo.builder()
        .title(TEST_TODO_TITLE)
        .content(TEST_TODO_CONTENT)
        .build();
    Todo TEST_ANOTHER_TODO = Todo.builder()
        .title(ANOTHER_PREFIX + TEST_TODO_TITLE)
        .content(ANOTHER_PREFIX + TEST_TODO_CONTENT)
        .build();
}
