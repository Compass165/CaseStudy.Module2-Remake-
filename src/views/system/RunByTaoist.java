package views.system;

import controller.LunisolarToolsManager;
import controller.TaoistManager;
import model.LunisolarTools;
import model.Taoist;
import storage.FileWriteRead;
import views.add.ChoiceAddLunisolarTools;
import views.edit.CheckInstanceToolsEdit;
import views.login.Login;
import views.remove.RemoveLunisolarTools;

import java.util.List;
import java.util.Scanner;

import static views.system.RunByMaster.pathFileLunisolarTools;
import static views.system.RunByMaster.pathFileTaoist;

public class RunByTaoist {

    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICEINTERACTIVE = 5;
    static final int CHOICESEARCH = 6;
    static final int CHOICEEXIT = 0;

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);

    static final String pathFile = "E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat";
    static FileWriteRead fileWriteRead = FileWriteRead.getInstance();
    static List<LunisolarTools> lunisolarToolsList = (List<LunisolarTools>) fileWriteRead.readFile(pathFile);
    public static void menuTaoist() {
        DisplayML.listLunisolarTools(lunisolarToolsList);
        DisplayML.menuTaoist();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD: //add
                    ChoiceAddLunisolarTools.addLunisolarTools(lunisolarToolsList, pathFile);
                    DisplayML.menuTaoist();
                case CHOICEEDIT: //edit
                    CheckInstanceToolsEdit.checkInstanceToolsEdit(lunisolarToolsList, pathFile);
                    DisplayML.menuTaoist();
                case CHOICEREMOVE: //remove
                    RemoveLunisolarTools.choiceRemove(lunisolarToolsList,pathFile);
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list
                    DisplayML.listLunisolarTools(lunisolarToolsList);
                    DisplayML.menuTaoist();
                    break;
                case CHOICEINTERACTIVE:
                    System.out.println("Mời nhập tên Đạo sĩ cần tương tác: ");
                    String name = scanner1.nextLine();
                    Taoist elementTaoist = new TaoistManager().search(fileWriteRead.readFile(pathFileTaoist), name);
                    System.out.println("Đạo sĩ cần tìm là : " + elementTaoist.toString());

                    System.out.println("Mời nhập Đạo cụ cần tương tác: ");
                    String nameTool = scanner1.nextLine();
                    LunisolarTools elementTools = new LunisolarToolsManager().search(fileWriteRead.readFile(pathFileLunisolarTools), name);
                    System.out.println("Đạo cụ cần tìm là: " + elementTools.toString());

                    System.out.println(" Đạo sĩ: " + name + " Được tăng Sức mạnh linh hồn khi kết hợp với " + nameTool + " là: " + elementTools.getSoulPower());
                    System.out.println("Mời nhập lựa chọn");
                    break;
                case CHOICESEARCH:
                    System.out.println("Mời nhập tên Đạo cụ cần tìm theo Pháp khí: ");
                    String nameTools = scanner1.nextLine();
                    LunisolarTools element = new LunisolarToolsManager().search(lunisolarToolsList, nameTools);
                    System.out.println("Đạo cụ cần tìm là: " + element.toString());
                    System.out.println("Mời các hạ nhập lựa chọn: ");
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");

            }
        }
    }
}
