package com.sumitaccess007.services;

import com.sumitaccess007.model.Comment;
import com.sumitaccess007.proxies.CommentNotificationProxy;
import com.sumitaccess007.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    // Dependency Injection - Constructor Injection
    @Autowired
    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // Dependency Injection - Field Injection
    /*
    Fields are no longer final here, and they are marked with @Autowired.
    Spring uses the default constructor to create the instance of the class
    And then injects the two dependencies from its context.
    @Autowired
    private commentRepository = CommentRepository;
    @Autowired
    private commentNotificationProxy = commentNotificationProxy;
     */

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
