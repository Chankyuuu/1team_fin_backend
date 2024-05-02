package com.example.todolist.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TodoDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime deadline;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean deleteYn;
    private Boolean doneYn;

    private String userId;
    private Long categoryId;

    public static Todo toEntity(TodoDTO todoDTO) {
        return Todo.builder()
                .id(todoDTO.getId())
                .title(todoDTO.getTitle())
                .description(todoDTO.getDescription())
                .deadline(todoDTO.getDeadline())
                .createdAt(todoDTO.getCreatedAt())
                .updatedAt(todoDTO.getUpdatedAt())
                .deleteYn(todoDTO.getDeleteYn())
                .doneYn(todoDTO.getDoneYn())
                .userId(todoDTO.getUserId())
                .categoryId(todoDTO.getCategoryId())
                .build();
    }

    public TodoDTO(Long id, String title, String description, LocalDateTime deadline, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean deleteYn, Boolean doneYn, Long userId, Long categoryId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleteYn = deleteYn;
        this.doneYn = doneYn;
        this.userId = userId;
        this.categoryId = categoryId;
    }
}
