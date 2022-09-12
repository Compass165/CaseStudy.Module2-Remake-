package views.login;

import views.system.DisplayML;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Login login = new Login();
        login.choiceLogin();

    }

    public void choiceLogin() throws NumberFormatException {
        do {
            DisplayML.menuLogin();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
                    new RegisterTaoist().registerAccountTaoist();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");
                    break;
            }
        } while (true);
    }
    void loginManager() {
        try {
            System.out.println("┎──────────────[ĐĂNG NHẬP ĐẠO SĨ]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản Đạo sĩ: ");
            String account = scanner.nextLine();
            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            CheckAccountForRole.checkAccount(account, password);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    void loginSystem() {
        try {
            choiceLogin();
        } catch (Exception e) {
            System.out.println("[❌] Các hạ đã nhập sai dữ liệu! Vui lòng nhập lại!");
            System.out.println("---------------------------------------------------");
            loginSystem();
        }
    }


}
