package home_work_26102021;

public class Car {
    int weight;
    String colour;
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", colour=" + colour +
                ", name='" + name + '\'' +
                '}';
    }

    @BeforeSuite
    public void goBefore() {
        System.out.print("BeforeSuite: ");
        System.out.println(this);
    }

    @AfterSuite
    public void goAfter() {
        System.out.print("AfterSuite: ");
        System.out.println(this);
    }

    @Test(value = 10)
    public void goTest1() {
        System.out.print("Test1: ");
        System.out.println(this);
    }

    @Test(value = 9)
    public void goTest2() {
        System.out.print("Test2: ");
        System.out.println(this);
    }

    @Test(value = 8)
    public void goTest3() {
        System.out.print("Test3: ");
        System.out.println(this);
    }

    @Test(value = 8)
    public void goTest4() {
        System.out.print("Test4: ");
        System.out.println(this);
    }

    @Test(value = 7)
    public void goTest5() {
        System.out.print("Test5: ");
        System.out.println(this);
    }

    @Test(value = 6)
    public void goTest6() {
        System.out.print("Test6: ");
        System.out.println(this);
    }

    @Test(value = 5)
    public void goTest7() {
        System.out.print("Test7: ");
        System.out.println(this);
    }

    @Test(value = 4)
    public void goTest8() {
        System.out.print("Test8: ");
        System.out.println(this);
    }

    @Test(value = 3)
    public void goTest9() {
        System.out.print("Test9: ");
        System.out.println(this);
    }

    @Test(value = 2)
    public void goTest10() {
        System.out.print("Test10: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest11() {
        System.out.print("Test11: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest12() {
        System.out.print("Test12: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest13() {
        System.out.print("Test13: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest14() {
        System.out.print("Test14: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest15() {
        System.out.print("Test15: ");
        System.out.println(this);
    }

    @Test(value = 1)
    public void goTest16() {
        System.out.print("Test16: ");
        System.out.println(this);
    }
}
