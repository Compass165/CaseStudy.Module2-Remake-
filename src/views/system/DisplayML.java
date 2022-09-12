package views.system;

import model.Taoist;

import java.util.List;

public class DisplayML {

    public static void menuMaster() {

            System.out.println("╔============================================================╗");
            System.out.println("║           ▂ ▃ ▅ ▆ █  QUẢN LÝ MÔN PHÁI  █ ▆ ▅ ▃ ▂           ║");
            System.out.println("╠============================================================╣");
            System.out.println("║>[1]. Thêm Âm dương Đạo cụ                                  ║");
            System.out.println("║>[2]. Sửa Âm dương Đạo cụ                                   ║");
            System.out.println("║>[3]. Xóa Âm dương Đạo cụ                                   ║");
            System.out.println("║>[4]. Danh sách Âm dương Đạo cụ                             ║");
            System.out.println("║>[5]. Kết hợp giữa Âm dương Đạo sĩ và Đạo cụ                ║");
            System.out.println("║>[6]. Tìm kiếm Âm dương Đạo cụ theo Pháp khí                ║");
            System.out.println("║>[7]. Quản lý Âm dương Đạo sĩ                               ║");
            System.out.println("║>[0]. Đăng xuất                                             ║");
            System.out.println("╚============================================================╝");
            System.out.print(" Mời Tông chủ lựa chọn: ");

    }

    public static void menuTaoist() {
        System.out.println("╔============================================================╗");
        System.out.println("║     ▂ ▃ ▅ ▆ █ QUẢN LÝ ĐẠO CỤ KHU TÀ DIỆT QUỶ  █ ▆ ▅ ▃ ▂    ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Thêm Đạo cụ                                           ║");
        System.out.println("║>[2]. Sửa Đạo cụ                                            ║");
        System.out.println("║>[3]. Xóa Đạo cụ                                            ║");
        System.out.println("║>[4]. Danh sách Đạo cụ                                      ║");
        System.out.println("║>[5]. Tính sát thương của Đạo sĩ kết hợp với Đạo cụ         ║");
        System.out.println("║>[6]. Tìm kiếm Đạo cụ theo tên                              ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
        System.out.print(" Mời Đạo sĩ lựa chọn: ");
    }
    public static void listLunisolarTools (List lunisolarToolsList) {
        for (int i = 0; i < lunisolarToolsList.size(); i++) {
            System.out.print(" Index: " + i + " " + lunisolarToolsList.get(i).toString() + ". " + '\n');
        }
    }

    public static void listTaoist(List<Taoist> taoistList) {
        String role;
        for (int i = 0; i < taoistList.size(); i++) {
            role = (taoistList.get(i).isRole() == true) ? "Tông chủ" : "Đạo sĩ";
            System.out.print(" Index: " + i + ", ID Đạo sĩ:  " + taoistList.get(i).getTaoistID()
            + ", Pháp danh:  " + taoistList.get(i).getName()+" , password:   " + taoistList.get(i).getPassWord() + ", role:   " + role + ". " + '\n'); //Xóa nếu ko muốn hiển thị khi đăng nhập
        }
    }
    public static void menuAdd() {
        System.out.println("╔===========================================╗");
        System.out.println("║      ▂ ▃ ▅ ▆ █ THÊM ĐẠO CỤ  █ ▆ ▅ ▃ ▂     ║");
        System.out.println("╠===========================================╣");
        System.out.println("║>[1]. Âm dương Kiếm                        ║");
        System.out.println("║>[2]. Bách họa Phù triền                   ║");
        System.out.println("║>[3]. Âm dương Giáp                        ║");
        System.out.println("║>[0]. Trở lại lựa chọn trước đó            ║");
        System.out.println("╚===========================================╝");
        System.out.print(" Mời các hạ nhập lựa chọn: ");
    }
    public static void menuLogin() {
        System.out.println("╔============================================╗");
        System.out.println("║  ▂ ▃ ▅ ▆ █  TRUY CẬP MÔN PHÁI  █ ▆ ▅ ▃ ▂   ║");
        System.out.println("╠============================================╣");
        System.out.println("║>[1]. Đạo sĩ Đăng nhập                      ║");
        System.out.println("║>[2]. Đăng ký tài khoản Đạo sĩ              ║");
        System.out.println("║>[0]. Thoát                                 ║");
        System.out.println("╚============================================╝");
        System.out.print("[\uD83D\uDC4B] Mời đạo sĩ lựa chọn: ");
    }
    public static void choiceLunisolarToolsTaoist() {
        System.out.println("╔============================================================╗");
        System.out.println("║           ▂ ▃ ▅ ▆ █  QUẢN LÝ MÔN PHÁI  █ ▆ ▅ ▃ ▂           ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Quản lý Âm dương Đạo cụ                               ║");
        System.out.println("║>[2]. Quản lý Âm dương Đạo sĩ                               ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
        System.out.print(" Mời Tông chủ lựa chọn: ");
    }
    public static void menuChoiceTaoist() {
        System.out.println("╔============================================================╗");
        System.out.println("║           ▂ ▃ ▅ ▆ █  QUẢN LÝ MÔN PHÁI  █ ▆ ▅ ▃ ▂           ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Thêm Âm dương Đạo sĩ                                  ║");
        System.out.println("║>[2]. Sửa Âm dương Đạo sĩ                                   ║");
        System.out.println("║>[3]. Xóa Âm dương Đạo sĩ                                   ║");
        System.out.println("║>[4]. Danh Sách Âm dương Đạo sĩ                             ║");
        System.out.println("║>[5]. Quản lý Âm dương Đạo cụ                               ║");
        System.out.println("║>[6]. Tìm kiếm Âm dương Đạo sĩ theo Pháp danh               ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
        System.out.print(" Mời Tông chủ lựa chọn: ");
    }
}
