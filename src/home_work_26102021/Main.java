package home_work_26102021;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void start(Class testClass) {
        Method[] methods = testClass.getDeclaredMethods();
        Map<Integer, List<Method>> methodMap = new TreeMap<>();
        boolean flagBefore = false;
        boolean flagAfter = false;

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (!flagBefore) {
                    flagBefore = true;
                } else {
                    throw new RuntimeException("more then 1 BeforeSuite");
                }
            }
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if (!flagAfter) {
                    flagAfter = true;
                } else {
                    throw new RuntimeException("more then 1 AfterSuite");
                }
            }
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                try {
                    m.invoke(testClass.getConstructor().newInstance());
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                if (methodMap.containsKey(m.getAnnotation(Test.class).value())) {
                    methodMap.get(m.getAnnotation(Test.class).value()).add(m);
                } else {
                    methodMap.put(m.getAnnotation(Test.class).value(), new ArrayList<>());
                    methodMap.get(m.getAnnotation(Test.class).value()).add(m);
                }
            }
        }

        for (Map.Entry<Integer, List<Method>> pair : methodMap.entrySet()) {
            Iterator<Method> it = pair.getValue().iterator();
            while (it.hasNext()) {
                try {
                    it.next().invoke(testClass.getConstructor().newInstance());
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuite.class)) {
                try {
                    m.invoke(testClass.getConstructor().newInstance());
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        start(Car.class);
    }
}

