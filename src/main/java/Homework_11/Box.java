package Homework_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box <T extends Fruit> {
    private T [] fruit;

    public Box(T[] fruit) {
        this.fruit = fruit;
    }

    public void getFruit() {
        ArrayList<T> list = new ArrayList<> (Arrays.asList(fruit));
        System.out.println(list);
    }

    public void setFruit (T [] a) {
        this.fruit = a;
    }

    public T[] addFruit(T a) {
        if (fruit[0] == null) {
            fruit[0] = a;
        } else {
            ArrayList<Fruit> list = new ArrayList<Fruit>(Arrays.asList(fruit));
            list.add(a);
        } return fruit;
    }

    public float getWeight() {
        float sum = 0.0f;
        for (T t : fruit) {
            sum += t.getFruitWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> another) {
        return (this.getWeight() == another.getWeight());

    }

    public void trowFruit(Box<T> a) {
        T[] b = this.fruit;
        a.setFruit(b);
        this.fruit = null;
    }

}
