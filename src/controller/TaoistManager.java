package controller;

import controller.System.Imanager;
import model.Taoist;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaoistManager implements Imanager {

    @Override
    public int checkIndex(List arr, String taoistID) {
        List<Taoist> taoistList = (List<Taoist>) arr;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (taoistID.equals(taoistList.get(i).getTaoistID())) {
                index = i;
            }
        } return index;
    }

    @Override
    public Taoist search(List arr, String name) {
        List<Taoist> taoistList = arr;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (name.equals(taoistList.get(i).getName())) {
                index = i;
            }
        } return taoistList.get(index);
    }

    @Override
    public boolean validate(String regex, String input) {
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        return matcher.matches();
    }
}
