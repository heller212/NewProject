package Homework_11;


import java.util.ArrayList;
import java.util.Arrays;

public class Elements<T> {
    private T [] object;

    public Elements(T [] object) {
        this.object = object;
    }

    public void setObject(T [] object) {
        this.object = object;
    }

    public Object [] getObject() {
        return object;
    }

    public void replace(int a, int b) {
        T c = null;
        c = object[a];
        object[a] = object[b];
        object[b] = c;
    }

    public void makeAnArray() {
        ArrayList<T> list = new ArrayList<T> (Arrays.asList(object));
        System.out.println(list);
    }



}
