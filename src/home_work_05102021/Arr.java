package home_work_05102021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr<T> {
    private T[] arr;

    public Arr(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Arr{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    /**
     * Метод вносит изменения в массив через объект
     *
     * @return новый объект
     */
    public Arr<T> changeObj(Arr<T> mass, int a, int b) {
        List<T> list = new ArrayList<>(Arrays.asList(mass.getArr()));
        T first = list.get(a);
        T second = list.get(b);
        list.set(a, second);
        list.set(b, first);
        mass.setArr((T[]) list.toArray());
        return mass;
    }

    /**
     * Метод вносит изменения в массив напрямую
     *
     * @return новый массив
     */
    public T[] changeArr(int a, int b, T... mass) {
        List<T> list = new ArrayList<>(Arrays.asList(mass));
        T first = list.get(a);
        T second = list.get(b);
        list.set(a, second);
        list.set(b, first);
        mass = (T[]) list.toArray();
        return mass;
    }
}
