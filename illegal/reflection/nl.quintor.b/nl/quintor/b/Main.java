package nl.quintor.b;

import nl.quintor.external.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public Main() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object instance = Service.getInstance();
        Method method = instance.getClass().getMethod("test");
        method.invoke(instance);
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        new Main();
    }
}
