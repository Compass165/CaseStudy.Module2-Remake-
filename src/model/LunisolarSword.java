package model;

public class LunisolarSword extends LunisolarTools { // Âm dương kiếm

    private int dame; //công vật lý
    private int speed; //tốc độ chạy

    public LunisolarSword() {
    }

    public LunisolarSword(String toolsID, String name, String classes, int price, int soulPower, String note) {
        super(toolsID, name, classes, price, soulPower, note);
    }

    @Override
    public String classification() {
        if (super.getSoulPower() <= 350) {
            return "Đồ Lởm!";
        } else if (super.getSoulPower() <= 500) {
            return "Made in Chai Lọ!";
        } else if (super.getSoulPower() <= 650) {
            return "Cũng ra gì và này nọ đấy!";
        } else if (super.getSoulPower() <= 1000) {
            return "Xời, tuyệt vời!";
        } else {
            return "U là trời, không phải con người nữa rồi!";
        }
    }

    public LunisolarSword(String toolsID, String name, String classes, int price, int soulPower, String note, int dame, int speed) {
        super(toolsID, name, classes, price, soulPower, note);
        this.dame = dame;
        this.speed = speed;
    }

    public int getDame() {
        return dame;
    }

    public void setDame(int dame) {
        this.dame = dame;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
}

    @Override
    public String toString() {
        return super.toString() +
                "Kiếm sẽ được cộng thêm: " +
                "Công vật lý=" + dame +
                ", Tốc độ di chuyển=" + speed +
                " Mô tả " + classification() +
                '\'';
    }
}