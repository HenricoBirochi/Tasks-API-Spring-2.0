package com.henrico.tasks.domain;

import com.henrico.tasks.domain.enums.UserRole;
import com.henrico.tasks.domain.exception.InvalidPasswordException;

public class User {

    private String userId;
    private String userName;
    private String name;
    private String email;
    private String password;
    private Integer totalCoins;
    private UserRole userRole;

    private void isPasswordValid(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).+$";
        if(password.length() < 8) {
            throw new InvalidPasswordException("The password has less words then 8!");
        }
        if(!password.matches(regex)) {
            throw new InvalidPasswordException("The password needs at least 1 number, 1 special character and 1 capital character!");
        }
    }

    public User() {
    }

    public User(String userId, String userName, String name, String email, String password, Integer totalCoins, UserRole userRole) {
        //* Validating if the password is correct before instantiate the object
        isPasswordValid(password);

        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.totalCoins = totalCoins;
        this.userRole = userRole;
    }

    public User(String userName, String name, String email, String password) {
        //* Validating if the password is correct before instantiate the object
        isPasswordValid(password);

        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(Integer totalCoins) {
        this.totalCoins = totalCoins;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

}
