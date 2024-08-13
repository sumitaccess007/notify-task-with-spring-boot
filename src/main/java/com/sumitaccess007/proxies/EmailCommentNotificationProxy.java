package com.sumitaccess007.proxies;

import com.sumitaccess007.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    public void sendComment(Comment comment){
        System.out.println("sending Comment : " + comment.getText()
                + " written by :" + comment.getAuthor());
    }
}
