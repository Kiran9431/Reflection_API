package org.example;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {

        Class<?> clz = Class.forName("org.example.Person");
        Object obj = clz.newInstance();

        System.out.println("Class name :" + clz.getName());
        System.out.println("Superclass: " + clz.getSuperclass().getName());

/*****TO SET A SINGLE FIELD******/

        System.out.println("SingleField : ");
        Field field = clz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(obj, 23);

        Person P = (Person) obj;
        P.getage();
        System.out.println("Fields called from :" + field);

/**********FOR SINGLE METHOD**************/

        System.out.println("SingleMethod: ");
        Method method = clz.getDeclaredMethod("getdetails");
        Object object1 = clz.newInstance();
        method.invoke(object1, null);
        System.out.println("Methods called from :" + method);

/***********For Getting Fields**************/

        System.out.println("AllFields:");
        Field[] fields = clz.getDeclaredFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }

/***********For Getting Methods**************/

        System.out.println("AllMethods:");
        Method[] methods = clz.getDeclaredMethods();
        for (Method method1 : methods) {
            System.out.println(method1.getName());
        }

/***************TO SET MUTLIPLE FIELDS****************/

        System.out.println("Multiple Fields");
        Field[] allfields = clz.getDeclaredFields();
        String[] fieldnames = {"field1","field2","field3"};
        Object[] fieldvalues = {};
    }
}