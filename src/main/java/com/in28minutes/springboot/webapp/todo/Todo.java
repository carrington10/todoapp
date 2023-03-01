package com.in28minutes.springboot.webapp.todo;

import java.time.LocalDate;

// database (mysequ1)
// static todo list class -> ddatabase (h2) (mysql)
public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private Boolean done;

    public Todo(int id, String username, String description, LocalDate targetDate, Boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return this.targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean isDone() {
        return this.done;
    }

    public Boolean getDone() {
        return this.done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", description='" + getDescription() + "'" +
            ", targetDate='" + getTargetDate() + "'" +
            ", done='" + isDone() + "'" +
            "}";
    }

    

}// end of todo
