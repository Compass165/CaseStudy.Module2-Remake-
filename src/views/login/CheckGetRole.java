package views.login;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class CheckGetRole {

    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat");
    public int checkGetRole(String account, String password, int checkRole) {
        try {
            for (Taoist x : listTaoist) {
                if (account.equals(x.getTaoistID()) && password.equals(x.getPassWord())) {
                    if (x.isRole()) checkRole = 1;
                    else checkRole = 2;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("[❌] Đăng nhập thất bại. Vui lòng đăng nhập lại !!!");
            System.out.println("-------------------------------------------------------");
            new Login().loginSystem();
        }
    return checkRole;
    }

}
