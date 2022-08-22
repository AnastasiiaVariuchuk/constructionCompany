package main.constructionCompany.tasks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task2Main {
    public static void getDeclaredFields() {
        System.out.println("1 => getDeclaredFields()");
        Class<Task2> task2Class = Task2.class;
        Field[] declaredFields = task2Class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }

    public static void getDeclaredField() {
        System.out.println("2 => getDeclaredField()");
        Class<Task2> task2Class = Task2.class;
        try {
            Field declaredField = task2Class.getDeclaredField("word");
            System.out.println(declaredField);
            Field noDeclaredField = task2Class.getDeclaredField("wordWord");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    public static void getFields() {
        System.out.println("3 => getFields()");
        Class<Task2> task2Class = Task2.class;
        Field[] fields = task2Class.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    public static void getField() {
        System.out.println("4 => getField()");
        Class<Task2> task2Class = Task2.class;
        try {
            Field field1 = task2Class.getField("word");
            System.out.println(field1);
            Field field2 = task2Class.getField("number");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    public static void getDeclaredMethods() {
        System.out.println("5 => getDeclaredMethods()");
        Class<Task2> task2Class = Task2.class;
        Method[] declaredMethods = task2Class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }

    public static void getDeclaredMethod() {
        System.out.println("6 => getDeclaredMethod()");
        Class<Task2> task2Class = Task2.class;
        try {
            Method declaredMethod = task2Class.getDeclaredMethod("printWord");
            System.out.println(declaredMethod);
            Method noDeclaredMethod = task2Class.getDeclaredMethod("wordWord");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }

    public static void getEnclosingMethod() {
        System.out.println("7 => getEnclosingMethod()");
        Task2 task2 = new Task2() {
            @Override
            protected void printWord() {
            }
        };
        Method enclosingMethod = task2.getClass().getEnclosingMethod();
        System.out.println(enclosingMethod);
    }

    public static void setAccessible1() {
        System.out.println("8 => setAccessible1");
        Task2 task2 = new Task2(500, "1233");
        Class<? extends Task2> task2Class = task2.getClass();
        Field field = null;
        try {
            field = task2Class.getDeclaredField("number");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        field.setAccessible(true);
        int numberValue = 0;
        try {
            numberValue = field.getInt(task2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numberValue);
    }

    public static void setAccessible2() {
        System.out.println("2 => setAccessible2");
        Task2 task2 = new Task2(500, "1233");
        Class<? extends Task2> task2Class = task2.getClass();
        Field field = null;
        try {
            field = task2Class.getDeclaredField("number");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        field.setAccessible(true);
        int numberValue = 0;
        try {
            numberValue = field.getInt(task2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Before => " + numberValue);

        //field.setAccessible(true);
        numberValue = 0;
        try {
            field.setInt(task2, 9);
            numberValue = field.getInt(task2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After => " + numberValue);
    }

    public static void interfaceCheck() {
        ICheck iCheck =  x -> x > 0;
        System.out.println(iCheck.test(10));

        IOperation<String> sum = ((value1, value2) -> value1 + value2);
        System.out.println(sum.getResult("get", "Result"));
    }
}
