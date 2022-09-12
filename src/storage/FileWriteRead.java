package storage;

import controller.System.IOUploadFile;
import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements IOUploadFile {
    //Đã xài được Singleton
//    private List list;
//    private String pathFile;
    public static void main(String[] args) {
        List<Taoist> taoistList = new ArrayList<>();

        taoistList.add(new Taoist("01", "123456", "Phong Phũ Phàng", true));
        taoistList.add(new Taoist("02", "123456", "Lương Lém Lỉnh", false));
        taoistList.add(new Taoist("03", "123456", "Bảnh Bụng Bự", false));
        taoistList.add(new Taoist("04", "123456", "Huy Hững Hờ", false));
        taoistList.add(new Taoist("05", "123456", "Hân Hóm Hỉnh", false));
        taoistList.add(new Taoist("06", "123456", "Hằng Hợm Hĩnh", false));
        taoistList.add(new Taoist("07", "123456", "Trung Trống Trịu", false));
        taoistList.add(new Taoist("08", "123456", "Linh Lỳ Lợm", false));
        taoistList.add(new Taoist("09", "123456", "Hoàng Hung Hăng", false));
        taoistList.add(new Taoist("10", "123456", "Cuân Cáu Cỉnh", false));
        FileWriteRead.getInstance().writeFile(taoistList, "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat");
        System.out.println(FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat"));

        List<LunisolarTools> lunisolarToolsList = new ArrayList<>();
        lunisolarToolsList.add(new LunisolarSword("S01", "Âm dương Kiếm", "Kiếm", 500, 750, "Kiếm xịn", 5000, 400));
        lunisolarToolsList.add(new LunisolarSword("S02", "Ỷ thiên kiếm", "Kiếm", 650, 1100, "Kiếm xịn", 8000, 700));
        lunisolarToolsList.add(new LunisolarSword("S03", "Long phượng song kiếm", "Kiếm", 400, 400, "Kiếm bình thường", 4000, 450));
        lunisolarToolsList.add(new LunisolarSword("S04", "Long ảnh đao", "Đao", 400, 350, "Đao bình thường", 3500, 350));
        lunisolarToolsList.add(new LunisolarSword("S05", "Thất tinh đao", "Kiếm", 100, 200, "Đao lởm", 2000, 200));
        lunisolarToolsList.add(new LunisolarEdema("E01", "Tâm linh Phù triền", "Phù triền", 400, 1000, "Kim phù",1000,10000));
        lunisolarToolsList.add(new LunisolarEdema("E02", "Chỉ binh mã phù", "Phù triền", 600, 700, "Binh phù",1500,12000));
        lunisolarToolsList.add(new LunisolarEdema("E03", "Nguyên soái kỳ", "Cờ lệnh", 800, 900, "Cờ lệnh",500,20000));
        lunisolarToolsList.add(new LunisolarEdema("E04", "Thống soái ấn", "Ấn", 900, 300, "Ấn",2000,2000));
        lunisolarToolsList.add(new LunisolarEdema("E05", "Bát quái kính", "Kính trừ tà", 200, 200, "Kính trừ tà",300,5000));
        lunisolarToolsList.add(new LunisolarArmor("A01","Tâm linh giáp", "Giáp", 600, 500, "Huyền Giáp", 6000, 6000));
        lunisolarToolsList.add(new LunisolarArmor("A02","Duy ác ngoa", "Ngoa", 400, 400, "Linh hồn Giày", 4000, 4000));
        lunisolarToolsList.add(new LunisolarArmor("A03","Hắc long lân giáp", "Giáp", 800, 800, "Long Giáp", 8000, 8000));
        lunisolarToolsList.add(new LunisolarArmor("A04","Phú ma nhẫn thuẫn", "Thuẫn", 300, 300, "Thần khiên", 3000, 3000));
        lunisolarToolsList.add(new LunisolarArmor("A05","Huyền Thiết giáp", "Giáp", 500, 500, "Huyễn Giáp", 3000, 3000));
        FileWriteRead.getInstance().writeFile(lunisolarToolsList, "E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat");
        System.out.println(FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat"));

    }
    private static FileWriteRead instance=null;

    private FileWriteRead() {
    }

//    private FileWriteRead(List list, String pathFile) {
//        this.list = list;
//        this.pathFile = pathFile;
//    }

//    public static FileWriteRead getInstance(List list, String pathFile){
    public static FileWriteRead getInstance(){
//        if (instance == null) instance = new FileWriteRead(list, pathFile);
        if (instance == null) instance = new FileWriteRead();
        return instance;
    }
    @Override
    public void writeFile(List list, String pathFile) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFile(String pathFile) {
        try {
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List list = (List) ob;
            ois.close();
            fis.close();
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
