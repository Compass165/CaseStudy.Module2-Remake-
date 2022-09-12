package controller.System;

import java.util.List;

public interface Imanager<E> {

    int checkIndex(List<E> arr, String element);
    E search(List<E> arr, String element);
    boolean validate(String regex, String input);

}
