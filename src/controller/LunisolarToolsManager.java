package controller;

import controller.System.Imanager;
import model.LunisolarTools;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LunisolarToolsManager implements Imanager {
//public static List<LunisolarTools> list1 = new ArrayList<>(); //debug

    @Override
    public int checkIndex(List arr, String toolsID) {
        List<LunisolarTools> lunisolarTools = (List<LunisolarTools>) arr;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(toolsID.equals(lunisolarTools.get(i).getToolsID())) {
                index = i;
            }
        } return index;
    }
    //Debug
//    public static int checkIndex1(List arr, String toolsID) {
//        List<LunisolarTools> lunisolarTools = (List<LunisolarTools>) arr;
//        int index = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            if(toolsID.equals(lunisolarTools.get(i).getToolsID())) {
//                index = i;
//            }
//        } return index;
//    }

    @Override
    public LunisolarTools search(List arr, String name) {
        List<LunisolarTools> lunisolarToolsList = arr;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (name.equals(lunisolarToolsList.get(i).getName())) {
                index = i;
            }
        } return lunisolarToolsList.get(index);
    }

    @Override
    public boolean validate(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //debug
//    public static void main(String[] args) {
//        LunisolarTools luni1 = new LunisolarSword("1", "Banh", "1",123, 23, "a");
//        LunisolarTools luni2 = new LunisolarSword("2", "Banh", "1",123, 23, "a");
//        list1.add(luni1);
//        list1.add(luni2);
//        checkIndex1(list1, "1");
//    }
}
