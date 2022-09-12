package views.edit;

import controller.TaoistManager;
import model.Taoist;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class EditTaoist {

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat";

    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile(pathFile);

    public void editTaoist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("┎───────────────────[SỬA ÂM DƯƠNG ĐẠO SĨ]─────────────────┒");
        System.out.println("[\uD83D\uDD11] Mời Tông chủ nhập Index Đạo sĩ cần sửa:");
        System.out.println("-----------------------------------------------------");
        String taoistID = scanner.nextLine();
        int indexRemove = new TaoistManager().checkIndex(listTaoist, taoistID);
        System.out.println("[\uD83D\uDD11] Mời Tông chủ nhập thông tin:");
        System.out.println("-----------------------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Pháp danh: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Chức danh (Tông chủ - Đạo sĩ): ");
        String role = scanner.nextLine();
        boolean roleReal = false;
        if (role.equals("Tông chủ")) {
            roleReal = true;
        }
        System.out.println("┖────────────────────────────────────────────────────┚");
        new IsAccountEdit().checkAccountTaoist(indexRemove, account, password, name, roleReal);
    }
}
