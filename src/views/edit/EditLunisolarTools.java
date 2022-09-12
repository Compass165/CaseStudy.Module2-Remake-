package views.edit;

import controller.CRUD;
import controller.TaoistManager;
import model.LunisolarArmor;
import model.LunisolarEdema;
import model.LunisolarSword;
import model.LunisolarTools;

import java.util.List;
import java.util.Scanner;

public class EditLunisolarTools {

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);

    public static void editSword(List lunisolarToolsList, int index, String pathFile) {
        System.out.println("Mời các hạ nhập ID Đạo cụ(S01 - E03 - A06): ");
        System.out.println("Chú thích: S - Kiếm, E - Phù triền, A - Giáp Linh hồn");
        String toolsID = scanner1.nextLine();
        System.out.println("Mời các hạ Nhập tên Đạo cụ(Ghi cụ thể tên vật phẩm): ");
        String name = scanner1.nextLine();
        System.out.println("Mời các hạ nhập lớp đạo cụ(Kiếm - Phù triền - Giáp linh hồn): ");
        String classes = scanner.nextLine();
        System.out.println("Mời các hạ nhập giá thành: ");
        //        int price = scanner.nextInt();
        int price;
        boolean regex;
        do {
            price = scanner.nextInt();
            regex = new TaoistManager().validate("^[0-9]{1,8}$", String.valueOf(price));
        } while (!regex);
        System.out.println("Mời các hạ nhập Sức mạnh linh hồn: ");
        int soulPower = scanner.nextInt();
        System.out.println("Mời các hạ nhập chú thích: ");
        String note = scanner1.nextLine();
        System.out.println("Mời các hạ nhập Sức tấn công vật lý: ");
        int dame = scanner.nextInt();
        System.out.println("Mời các hạ nhập tốc độ đánh cộng thêm: ");
        int speed = scanner.nextInt();

        LunisolarTools lunisolarTools = new LunisolarSword(toolsID, name, classes, price, soulPower, note, dame, speed);
        new CRUD().edit(index, lunisolarToolsList, lunisolarTools, pathFile);
        System.out.println("Sửa Đạo cụ lớp Âm dương kiếm thành công");

    }
    public static void editEdema(List lunisolarToolsList, int index, String pathFile) {
        System.out.println("Mời các hạ nhập ID Đạo cụ(S01 - E03 - A06): ");
        System.out.println("Chú thích: S - Kiếm, E - Phù triền, A - Giáp Linh hồn");
        String toolsID = scanner1.nextLine();
        System.out.println("Mời các hạ Nhập tên Đạo cụ(Ghi cụ thể tên vật phẩm): ");
        String name = scanner1.nextLine();
        System.out.println("Mời các hạ nhập lớp đạo cụ(Kiếm - Phù triền - Giáp linh hồn): ");
        String classes = scanner.nextLine();
        System.out.println("Mời các hạ nhập giá thành: ");
        //        int price = scanner.nextInt();
        int price;
        boolean regex;
        do {
            price = scanner.nextInt();
            regex = new TaoistManager().validate("^[0-9]{1,8}$", String.valueOf(price));
        } while (!regex);
        System.out.println("Mời các hạ nhập Sức mạnh linh hồn: ");
        int soulPower = scanner.nextInt();
        System.out.println("Mời các hạ nhập chú thích: ");
        String note = scanner1.nextLine();
        System.out.println("Mời các hạ nhập Sức mạnh phép thuật: ");
        int abilityPower = scanner.nextInt();
        System.out.println("Mời các hạ nhập máu cộng thêm: ");
        int HP = scanner.nextInt();

        LunisolarTools lunisolarTools = new LunisolarEdema(toolsID, name, classes, price, soulPower, note, abilityPower, HP);
        new CRUD().edit(index, lunisolarToolsList, lunisolarTools, pathFile);
        System.out.println("Sửa Đạo cụ lớp Âm dương Phù triền thành công");

    }
    public static void editArmor(List lunisolarToolsList, int index, String pathFile) {
        System.out.println("Mời các hạ nhập ID Đạo cụ(S01 - E03 - A06): ");
        System.out.println("Chú thích: S - Kiếm, E - Phù triền, A - Giáp Linh hồn");
        String toolsID = scanner1.nextLine();
        System.out.println("Mời các hạ Nhập tên Đạo cụ(Ghi cụ thể tên vật phẩm): ");
        String name = scanner1.nextLine();
        System.out.println("Mời các hạ nhập lớp đạo cụ(Kiếm - Phù triền - Giáp linh hồn): ");
        String classes = scanner.nextLine();
        System.out.println("Mời các hạ nhập giá thành: ");
        //        int price = scanner.nextInt();
        int price;
        boolean regex;
        do {
            price = scanner.nextInt();
            regex = new TaoistManager().validate("^[0-9]{1,8}$", String.valueOf(price));
        } while (!regex);
        System.out.println("Mời các hạ nhập Sức mạnh linh hồn: ");
        int soulPower = scanner.nextInt();
        System.out.println("Mời các hạ nhập chú thích: ");
        String note = scanner1.nextLine();
        System.out.println("Mời các hạ nhập máu cộng thêm: ");
        int HP = scanner.nextInt();
        System.out.println("Mời các hạ nhập kháng sức mạnh linh hồn: ");
        int magicalResistance = scanner.nextInt();

        LunisolarTools lunisolarTools = new LunisolarArmor(toolsID, name, classes, price, soulPower, note, HP, magicalResistance);
        new CRUD().edit(index, lunisolarToolsList, lunisolarTools, pathFile);
        System.out.println("Sửa Đạo cụ lớp Linh hồn Giáp thành công");

    }
}
