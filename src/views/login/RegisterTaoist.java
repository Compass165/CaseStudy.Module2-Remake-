package views.login;

import java.util.Scanner;

public class RegisterTaoist {

    public void registerAccountTaoist() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎──────────────[GIA NHẬP MÔN PHÁI]──────────────┒");
        System.out.println("[\uD83D\uDD11] Mời các hạ nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập Pháp danh: ");
        String name = scanner.nextLine();
        System.out.println("┖─────────────────────────────────────┚");
        new IsAccount().checkAccountTaoist(account, password, name,false);
    }

}
