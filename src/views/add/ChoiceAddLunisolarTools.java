package views.add;

import views.system.DisplayML;

import java.util.List;
import java.util.Scanner;

public class ChoiceAddLunisolarTools {

    static final int LunisolarSword = 1;
    static final int LunisolarEdema = 2;
    static final int LunisolarArmor = 3;
    static final int EXIT = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void addLunisolarTools (List lunisolarToolsList, String pathFile) {
        DisplayML.menuAdd();
        while (true) {
            int choice = scanner.nextInt();
            if (choice == LunisolarSword) {
                AddLuniSolarTools.choiceSword(lunisolarToolsList, pathFile);
                break;
            } else if (choice == LunisolarEdema) {
                AddLuniSolarTools.choiceEdema(lunisolarToolsList, pathFile);
                break;
            } else if (choice == LunisolarArmor) {
                AddLuniSolarTools.choiceArmor(lunisolarToolsList, pathFile);
                break;
            } else if (choice == EXIT) {
                break;
            }else
                System.err.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");

            }

    }

}
