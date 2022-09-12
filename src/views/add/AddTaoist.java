package views.add;

import java.util.Scanner;

public class AddTaoist {

    public void addTaoist() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎──────────[THÊM ÂM DƯƠNG ĐẠO SĨ]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời Tông chủ nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Pháp danh: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập vai trò (Tông chủ - Đạo sĩ): ");
        String role = scanner.nextLine();
        boolean roleReal=false;
        if(role.equals("Tông chủ")){
            roleReal=true;
        }
        System.out.println("┖─────────────────────────────────────┚");
        new IsAccountAdd().checkAccountTaoist(account, password, name,roleReal);
    }

}
