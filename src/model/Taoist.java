package model;

import java.io.Serializable;

public class Taoist implements Serializable {

    private String taoistID; //ID đạo sĩ
    private String passWord; //Password
    private String name; //Tên

    private boolean role = false; //Kiểm tra xem có phải Tông chủ không?

    public Taoist() {
    }

    public Taoist(String taoistID, String passWord, String name, boolean role) {
        this.taoistID = taoistID;
        this.passWord = passWord;
        this.name = name;
        this.role = role;
    }

    public String getTaoistID() {
        return taoistID;
    }

    public void setTaoistID(String taoistID) {
        this.taoistID = taoistID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Đạo sĩ: " +
                "ID'" + taoistID + '\'' +
                ", Mật khẩu'" + passWord + '\'' +
                ", Pháp danh'" + name + '\'' +
                ", Chức danh " + role +
                '\n';
    }
}
