/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrary.model;

import java.util.Objects;

/**
 *
 * @author bretthanson
 */
public class Dvd {
    private int dvdId;
    private String title;
    private String released;
    private String mpaa;
    private String director;
    private String studio;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.dvdId;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + Objects.hashCode(this.released);
        hash = 79 * hash + Objects.hashCode(this.mpaa);
        hash = 79 * hash + Objects.hashCode(this.director);
        hash = 79 * hash + Objects.hashCode(this.studio);
        hash = 79 * hash + Objects.hashCode(this.rating);
        hash = 79 * hash + Objects.hashCode(this.note);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dvd other = (Dvd) obj;
        if (this.dvdId != other.dvdId) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.released, other.released)) {
            return false;
        }
        if (!Objects.equals(this.mpaa, other.mpaa)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.rating, other.rating)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        return true;
    }
    private String rating;
    private String note;

    public int getDvdId() {
        return dvdId;
    }

    public void setDvdId(int dvdId) {
        this.dvdId = dvdId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getMpaa() {
        return mpaa;
    }

    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

