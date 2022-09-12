package views.login;

import views.system.RunByMaster;
import views.system.RunByTaoist;

import java.util.InputMismatchException;

public class CheckAccountForRole {

    static void checkAccount(String account, String password) {
        int checkRole = 0;
        checkRole = new CheckGetRole().checkGetRole(account, password, checkRole);
        try {
            if (checkRole == 1) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi Tông chủ thành công !!!");
                System.out.println("------------------------------------------------------------");
                RunByMaster.choiceTaoistOrTools();
            } else if (checkRole == 2) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi Đạo sĩ thành công !!!");
                System.out.println("----------------------------------------------------------");
                RunByTaoist.menuTaoist();
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng! Mời các hạ nhập lại: ");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                new Login().loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }


}
