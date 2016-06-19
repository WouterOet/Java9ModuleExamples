package nl.quintor.b;

import nl.quintor.external.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public Main() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        try {
            Object instance = Service.getInstance();
            Method method = instance.getClass().getMethod("test");
            method.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------------------------");

        try {
            Class.forName("nl.quintor.internal.Internal").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        new Main();
    }
}
