package views.edit;

import model.LunisolarEdema;
import model.LunisolarSword;

import java.util.List;
import java.util.Scanner;

public class CheckInstanceToolsEdit {

    static Scanner scanner= new Scanner(System.in);

    public static void checkInstanceToolsEdit(List lunisolarToolsList, String pathFile) {
        System.out.println("Mời Tông chủ nhập index của Đạo cụ cần chỉnh sửa: ");
        int index = scanner.nextInt();
        if (lunisolarToolsList.get(index) instanceof LunisolarSword) {
            EditLunisolarTools.editSword(lunisolarToolsList, index, pathFile);
        } else if (lunisolarToolsList.get(index) instanceof LunisolarEdema) {
            EditLunisolarTools.editEdema(lunisolarToolsList, index, pathFile);
        } else {
            EditLunisolarTools.editArmor(lunisolarToolsList, index, pathFile);
        }
    }

}
