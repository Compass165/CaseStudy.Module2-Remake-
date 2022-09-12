package views.system;

import controller.LunisolarToolsManager;
import controller.TaoistManager;
import model.*;
import storage.FileWriteRead;
import views.add.AddTaoist;
import views.add.ChoiceAddLunisolarTools;
import views.edit.CheckInstanceToolsEdit;
import views.edit.EditTaoist;
import views.login.Login;
import views.remove.RemoveLunisolarTools;
import views.remove.RemoveTaoist;

import java.util.List;
import java.util.Scanner;

public class RunByMaster {

    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICELUNISOLAR = 5;
    static final int CHOICEEXIT = 0;
    static final int CHOICEUSER = 7;

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);

    static final String pathFileLunisolarTools = "E:\\IntelliJ\\CaseStudy.Module2\\database\\lunisolarTools.dat";
    static final String pathFileTaoist = "E:\\IntelliJ\\CaseStudy.Module2\\database\\taoist.dat";
    static FileWriteRead fileWriteRead = FileWriteRead.getInstance();
    static List<LunisolarTools> lunisolarToolsList = (List<LunisolarTools>) fileWriteRead.readFile(pathFileLunisolarTools);
    static List<Taoist> taoistList = (List<Taoist>) fileWriteRead.readFile(pathFileTaoist);

    public static void choiceTaoistOrTools () {
        DisplayML.choiceLunisolarToolsTaoist();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: //Quản lý đạo cụ
                    menuToolsMaster();
                    break;
                case 2: //Quản lý đạo sĩ
                    menuTaoistManager();
                    break;
                case CHOICEEXIT:
                    new Login().choiceLogin();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");
            }
        }
    }

    public static void menuTaoistManager() {
        DisplayML.listTaoist(fileWriteRead.readFile(pathFileTaoist));
        DisplayML.menuChoiceTaoist();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: //add
                    new AddTaoist().addTaoist();
                    break;
                case 2: //edit
                    new EditTaoist().editTaoist();
                    break;
                case 3: //remove
                    new RemoveTaoist().removeTaoist();
                    RunByMaster.menuTaoistManager();
                    break;
                case CHOICEEXIT: //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW: //detail list
                    RunByMaster.menuTaoistManager();
                    break;
                case 5: //lunisolar Manager
                    menuToolsMaster();
                    break;
                case 6:
                    System.out.println("Mời nhập Pháp danh Âm dương Đạo sĩ cần tìm: ");
                    String name = scanner1.nextLine();
                    Taoist element = new TaoistManager().search(fileWriteRead.readFile(pathFileTaoist), name);
                    System.out.println("Đối tượng cần tìm là : "+element.toString());
                    System.out.println("Mời nhập lựa chọn:");
                    break;
                default: System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }

    public static void menuToolsMaster() {
        DisplayML.listLunisolarTools(fileWriteRead.readFile(pathFileLunisolarTools));
        DisplayML.menuMaster();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD: //add
                    ChoiceAddLunisolarTools.addLunisolarTools(lunisolarToolsList, pathFileLunisolarTools);
                    DisplayML.menuMaster();
                    break;
                case CHOICEEDIT: //edit
                    CheckInstanceToolsEdit.checkInstanceToolsEdit(lunisolarToolsList,pathFileLunisolarTools);
                    DisplayML.menuMaster();
                    break;
                case CHOICEREMOVE: //remove
                    RemoveLunisolarTools.choiceRemove(lunisolarToolsList, pathFileLunisolarTools);
                    break;
                case CHOICEEXIT: //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW: //detail list
                    DisplayML.listLunisolarTools(lunisolarToolsList);
                    DisplayML.menuMaster();
                    break;
                case CHOICEUSER:
                    menuTaoistManager();
                    break;
                case 5:
                    System.out.println("Mời nhập tên Đạo sĩ cần tương tác: ");
                    String name = scanner1.nextLine();
                    Taoist elementTaoist = new TaoistManager().search(fileWriteRead.readFile(pathFileTaoist), name);
                    System.out.println("Đạo sĩ cần tìm là : " + elementTaoist.toString());

                    System.out.println("Mời nhập Đạo cụ cần tương tác: ");
                    String nameTools = scanner1.nextLine();
                    LunisolarTools elementTools = new LunisolarToolsManager().search(fileWriteRead.readFile(pathFileLunisolarTools), nameTools);
                    System.out.println("Đạo cụ cần tìm là: " + elementTools.toString());

                    System.out.println(" Đạo sĩ: " + name + " Được tăng Sức mạnh linh hồn khi kết hợp với " + nameTools + " là: " + elementTools.getSoulPower());
                    System.out.println("Mời nhập lựa chọn");
                    break;
                case 6:
                    System.out.println("Mời nhập Đạo cụ cần tìm theo Pháp khí: ");
                    String nameTool = scanner1.nextLine();
                    LunisolarTools elementName = new LunisolarToolsManager().search(lunisolarToolsList, nameTool);
                    System.out.println("Đạo cụ cần tìm là: " + elementName.toString());
                    System.out.println("Mời nhập lựa chọn: ");
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời các hạ nhập lại !!!");
            }
        }
    }

}
