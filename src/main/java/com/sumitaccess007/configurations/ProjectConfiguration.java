package com.sumitaccess007.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"proxies", "services", "repositories"})
public class ProjectConfiguration {

    // Dependency Injection - using @Bean method
    /*
    For this we need to remove the stereotype annotation (@Component) of the CommentService class
    and its two dependencies.
    Also, we no longer need to use @ComponentScan annotation
    We need to create bean for each of the two dependencies

    @Bean
    public CommentRepository commentrepository(){
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailCommentNotificationProxy();
    }

    We use parameters of the @Bean method (which are now defined with the interface type)
    to instruct Spring to provide references for beans from its context, compatible with
    the type of the parameters.
    @Bean
    public CommentService commentService(
        CommentRepository commentRepository,
        CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentRepository, commentNotificationProxy);
    }
     */
}
