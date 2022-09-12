package views.remove;

import controller.CRUD;
import controller.TaoistManager;
import model.Taoist;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class RemoveTaoist {

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat";
    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile(pathFile);

    public void  removeTaoist() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎───────────────────[XÓA ÂM DƯƠNG ĐẠO SĨ]─────────────────┒");
        System.out.println("[\uD83D\uDD11] Mời Tông chủ nhập mã Đạo sĩ cần xóa:");
        System.out.println("-----------------------------------------------------");
        String taoistID = scanner.nextLine();
        int indexRemove = new TaoistManager().checkIndex(listTaoist, taoistID);
        new CRUD().remove(indexRemove, listTaoist, pathFile);
        System.out.println("Tông chủ đã xóa Đạo sĩ thành công!");
    }


}
