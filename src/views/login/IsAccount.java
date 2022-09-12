package views.login;

import controller.CRUD;
import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class IsAccount {

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat";
    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile(pathFile);
    public void checkAccountTaoist(String account, String password, String name, boolean role) {
        if (new CheckNameAccount().checkNameAccount(account)) {
            System.out.println("[❌] Tài khoản Đạo sĩ đã tồn tại. Vui lòng đăng ký lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new CRUD().add(listTaoist,new Taoist(account,password,name,role),pathFile);
            System.out.println("[\uD83D\uDC4C] Đăng ký thành công. Mời các hạ đăng nhập vào hệ thống !!!");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        new Login().loginSystem();
        }
    }

