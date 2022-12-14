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
                    System.out.println("M???i nh???p t??n ?????o s?? c???n t????ng t??c: ");
                    String name = scanner1.nextLine();
                    Taoist elementTaoist = new TaoistManager().search(fileWriteRead.readFile(pathFileTaoist), name);
                    System.out.println("?????o s?? c???n t??m l?? : " + elementTaoist.toString());

                    System.out.println("M???i nh???p ?????o c??? c???n t????ng t??c: ");
                    String nameTool = scanner1.nextLine();
                    LunisolarTools elementTools = new LunisolarToolsManager().search(fileWriteRead.readFile(pathFileLunisolarTools), name);
                    System.out.println("?????o c??? c???n t??m l??: " + elementTools.toString());

                    System.out.println(" ?????o s??: " + name + " ???????c t??ng S???c m???nh linh h???n khi k???t h???p v???i " + nameTool + " l??: " + elementTools.getSoulPower());
                    System.out.println("M???i nh???p l???a ch???n");
                    break;
                case CHOICESEARCH:
                    System.out.println("M???i nh???p t??n ?????o c??? c???n t??m theo Ph??p kh??: ");
                    String nameTools = scanner1.nextLine();
                    LunisolarTools element = new LunisolarToolsManager().search(lunisolarToolsList, nameTools);
                    System.out.println("?????o c??? c???n t??m l??: " + element.toString());
                    System.out.println("M???i c??c h??? nh???p l???a ch???n: ");
                    break;
                default:
                    System.err.println("[???] L???a ch???n kh??ng t???n t???i, m???i c??c h??? nh???p l???i !!!");

            }
        }
    }
}
