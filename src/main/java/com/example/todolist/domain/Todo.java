package com.example.todolist.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "todo")
public class Todo {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todo_id")
	private Long id;

    private String title;
    private String description;
    private LocalDateTime deadline;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean deleteYn;
    private Boolean doneYn;

    @ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public Todo(Long id, String title, String description, LocalDateTime deadline, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean deleteYn, Boolean doneYn, User user, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleteYn = deleteYn;
        this.doneYn = doneYn;
        this.user = user;
        this.category = category;
    }
}
