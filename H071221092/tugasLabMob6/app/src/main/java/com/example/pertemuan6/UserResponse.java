package com.example.pertemuan6;

import java.util.List;

public class UserResponse {

    private List<User> data; //u simpan data yg diterima dari API berupa objek" user
    public List<User> getData() {
        return data;
    }
    public void setData(List<User> data) {
        this.data = data;
    }
}
