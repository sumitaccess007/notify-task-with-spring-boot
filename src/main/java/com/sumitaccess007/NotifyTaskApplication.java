package com.sumitaccess007;

import com.sumitaccess007.configurations.ProjectConfiguration;
import com.sumitaccess007.model.Comment;
import com.sumitaccess007.services.CommentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class NotifyTaskApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(NotifyTaskApplication.class);

        var comment = new Comment();
        comment.setText("This project uses Spring Boot Dependency Injection feature");
        comment.setAuthor("Sumit SHARMA");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
