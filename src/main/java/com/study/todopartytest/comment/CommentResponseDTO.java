package com.study.todopartytest.comment;

import com.study.todopartytest.CommonResponseDTO;
import com.study.todopartytest.user.UserDTO;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentResponseDTO extends CommonResponseDTO {
	private Long id;
	private String text;
	private UserDTO user;
	private LocalDateTime createDate;

	public CommentResponseDTO(Comment comment) {
		this.id = comment.getId();
		this.text = comment.getText();
		this.user = new UserDTO(comment.getUser());
		this.createDate = comment.getCreateDate();
	}
}
