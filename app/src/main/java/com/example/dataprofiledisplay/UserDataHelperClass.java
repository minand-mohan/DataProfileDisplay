package com.example.dataprofiledisplay;

import android.text.Editable;
import android.widget.EditText;

public class UserDataHelperClass {
    private String userName;
    private String userFullName;
    private String userEmail;
    private String userPassword;
    private String userNumber;

    public UserDataHelperClass() {
    }


    public UserDataHelperClass(EditText username,  EditText fullName, EditText email, EditText password, EditText number) {
        this.userName = username.getText().toString();
        this.userFullName = fullName.getText().toString();
        this.userEmail = email.getText().toString();
        this.userPassword = password.getText().toString();
        this.userNumber = number.getText().toString();
    }

    public UserDataHelperClass(String userName,  String userFullName, String userEmail, String userPassword, String userNumber) {
        this.userName = userName;
        this.userFullName = userFullName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
