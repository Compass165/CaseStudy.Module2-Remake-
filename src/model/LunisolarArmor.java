package model;

public class LunisolarArmor extends LunisolarTools{ //giáp

    private int HP; //Máu
    private int magicalResistance; //Kháng phép

    public LunisolarArmor() {
    }

    public LunisolarArmor(String toolsID, String name, String classes, int price, int soulPower, String note) {
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

    public LunisolarArmor(String toolsID, String name, String classes, int price, int soulPower, String note, int HP, int magicalResistanceKh) {
        super(toolsID, name, classes, price, soulPower, note);
        this.HP = HP;
        this.magicalResistance = magicalResistance;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public void setMagicalResistance(int magicalResistance) {
        this.magicalResistance = magicalResistance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Giáp Linh hồn: " +
                "Máu=" + HP +
                ", Kháng phép=" + magicalResistance +
                " Mô tả " + classification() +
                '\'';
    }
//    "http://vlcm.zing.vn/su-kien/tran-hung-xung-vuong/tran-hung-xung-vuong.html"
//    <td class="EvenRow" style="text-align: center;"><strong>(.*?)</strong></td>
//    E:\IntelliJ\CaseStudy.Module2\src\crawls\LunisolarTools.dat
}
