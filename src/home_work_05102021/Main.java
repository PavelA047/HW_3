package home_work_05102021;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arr i = new Arr(new Integer[]{1, 4, 7, 8});
        Arr s = new Arr(new String[]{"qwe", "asd", "zxc", "rty"});
        System.out.println(Arrays.toString(i.changeArr(0, 3, i.getArr())));
        System.out.println(s.changeObj(s, 1, 2));
        //объединил первые 2 задания

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox = new Box<>();
        appleBox.putFruit(apple1);
        appleBox.putFruit(apple2);
        appleBox.putFruit(apple3);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.putFruit(orange1);
        orangeBox.putFruit(orange2);
        orangeBox.putFruit(orange3);

        System.out.println(appleBox.getBoxWeight());
        System.out.println(orangeBox.getBoxWeight());
        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.shift(newAppleBox);
        System.out.println(appleBox.getBoxWeight());
        System.out.println(newAppleBox.getBoxWeight());
    }
}