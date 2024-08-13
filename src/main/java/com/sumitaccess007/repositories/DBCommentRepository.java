package com.sumitaccess007.repositories;


import com.sumitaccess007.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    public void storeComment(Comment comment){
        System.out.println("storing comment : " + comment.getText());
    }
}
