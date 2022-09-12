package views.login;

import model.Taoist;
import storage.FileWriteRead;

import java.util.List;

public class CheckNameAccount {

    List<Taoist> listTaoist = FileWriteRead.getInstance().readFile("E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat");
    public boolean checkNameAccount(String accountTaoist) {
        for (Taoist account : listTaoist) {
            boolean checkAccountTaoist = accountTaoist.equals(account.getTaoistID());
            if (checkAccountTaoist) {
                return true;
            }
        } return false;
    }

}
