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
public class Post {
    private int postId;
    private String title;
    private int[] userIds;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.postId;
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Arrays.hashCode(this.userIds);
        hash = 47 * hash + Objects.hashCode(this.postBody);
        hash = 47 * hash + Objects.hashCode(this.postDate);
        hash = 47 * hash + Objects.hashCode(this.postExcerpt);
        hash = 47 * hash + Objects.hashCode(this.lastEditDate);
        hash = 47 * hash + (this.isPrivate ? 1 : 0);
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
        final Post other = (Post) obj;
        if (this.postId != other.postId) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.equals(this.userIds, other.userIds)) {
            return false;
        }
        if (!Objects.equals(this.postBody, other.postBody)) {
            return false;
        }
        if (!Objects.equals(this.postDate, other.postDate)) {
            return false;
        }
        if (!Objects.equals(this.postExcerpt, other.postExcerpt)) {
            return false;
        }
        if (!Objects.equals(this.lastEditDate, other.lastEditDate)) {
            return false;
        }
        if (this.isPrivate != other.isPrivate) {
            return false;
        }
        return true;
    }
    private String postBody;
    private LocalDate postDate;
    private String postExcerpt;
    private LocalDate lastEditDate;
    private boolean isPrivate;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int[] getUserIds() {
        return userIds;
    }

    public void setUserIds(int[] userIds) {
        this.userIds = userIds;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public LocalDate getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(LocalDate lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    
}