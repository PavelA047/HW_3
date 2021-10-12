package home_work_05102021;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void putFruit(T fruit) {
        list.add(fruit);
    }

    public float getBoxWeight() {
        try {
            return (float) list.size() * list.get(0).getWeight();
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Box is empty, weight: ");
            return 0.0f;
        }
    }

    public boolean compare(Box<? extends Fruit> boxNew) {
        float size = (float) this.list.size();
        float weight = this.list.get(0).getWeight();
        try {
            return Math.abs(size * weight - (float) boxNew.list.size() * boxNew.list.get(0).getWeight()) < 0.0001;
        } catch (IndexOutOfBoundsException e) {
            System.out.print("One of boxes is empty, or both of them are empty! Result: ");
            return false;
        }
    }

    public Box<T> shift(Box<T> boxNew) {
        boxNew.list.addAll(this.list);
        this.list.clear();
        return boxNew;
    }
}
