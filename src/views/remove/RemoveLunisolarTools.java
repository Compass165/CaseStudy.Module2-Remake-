package views.remove;

import controller.CRUD;

import java.util.List;
import java.util.Scanner;

public class RemoveLunisolarTools {

    public static void choiceRemove(List lunisolarToolsList, String pathFile) {
        System.out.println("Mời các hạ nhập index của Đạo cụ cần xóa:");
        Scanner scanner= new Scanner(System.in);
        int index= scanner.nextInt();
        new CRUD().remove(index, lunisolarToolsList, pathFile);
        System.out.println("Xóa Âm dương Đạo cụ thành công");

    }

}
