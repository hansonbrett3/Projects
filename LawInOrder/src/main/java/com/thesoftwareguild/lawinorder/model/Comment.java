/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.lawinorder.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Comment {
    private int commentId;
    private int[] userIds;
    private String commentBody;
    private LocalDate commentDate;
    private int postId;

    public int getCommentId() {
        return commentId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.commentId;
        hash = 79 * hash + Arrays.hashCode(this.userIds);
        hash = 79 * hash + Objects.hashCode(this.commentBody);
        hash = 79 * hash + Objects.hashCode(this.commentDate);
        hash = 79 * hash + this.postId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comment other = (Comment) obj;
        if (this.commentId != other.commentId) {
            return false;
        }
        if (!Arrays.equals(this.userIds, other.userIds)) {
            return false;
        }
        if (!Objects.equals(this.commentBody, other.commentBody)) {
            return false;
        }
        if (!Objects.equals(this.commentDate, other.commentDate)) {
            return false;
        }
        if (this.postId != other.postId) {
            return false;
        }
        return true;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int[] getUserIds() {
        return userIds;
    }

    public void setUserIds(int[] userIds) {
        this.userIds = userIds;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    
}