package com.devcolibri.secure.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class User {

    private int id;
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {

    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    /* create table user(id int NOT NULL AUTO_INCREMENT, username varchar(256) not null,
    pass char(32) not null, amount double, PRIMARY KEY ( id ));
 */
    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false, length = 256)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "pass", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
