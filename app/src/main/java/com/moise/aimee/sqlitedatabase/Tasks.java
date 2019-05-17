package com.moise.aimee.sqlitedatabase;

public class Tasks {
    private int _id;
    private String _username;
    private String _password;
    public void Tasks(){

    }
    public Tasks(String username,String password){
        this._username=username;
        this._password=password;
    }

    public int get_id() {
        return _id;
    }

    public String get_password() {
        return _password;
    }

    public String get_username() {
        return _username;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public void set_username(String _username) {
        this._username = _username;
    }
}
