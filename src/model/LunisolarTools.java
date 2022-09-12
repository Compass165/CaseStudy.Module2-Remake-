package model;

import java.io.Serializable;

public abstract class LunisolarTools implements Serializable { //Đạo cụ âm dương

    private String toolsID; //ID
    private String name; //Tên
    private String classes; //Loại
    private int price; //Giá
    private int soulPower; //Sức mạnh linh hồn
    private String note; //Mô tả

    public LunisolarTools() {
    }

    public LunisolarTools(String toolsID, String name, String classes, int price, int soulPower, String note) {
        this.toolsID = toolsID;
        this.name = name;
        this.classes = classes;
        this.price = price;
        this.soulPower = soulPower;
        this.note = note;
    }

    public String getToolsID() {
        return toolsID;
    }

    public void setToolsID(String toolsID) {
        this.toolsID = toolsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoulPower() {
        return soulPower;
    }

    public void setSoulPower(int soulPower) {
        this.soulPower = soulPower;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public abstract String classification();

    @Override
    public String toString() {
        return "Đạo cụ Âm dương: " +
                "ID='" + toolsID + '\'' +
                ", Tên đạo cụ='" + name + '\'' +
                ", Lớp='" + classes + '\'' +
                ", Giá=" + price +
                ", Sức mạnh linh hồn=" + soulPower +
                " Và thuộc tính đặc biệt được cộng thêm của lớp ";
    }
}
