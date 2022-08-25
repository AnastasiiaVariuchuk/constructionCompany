package main.constructionCompany.tasks;

public class Task2 {
    private int number;
    public final String word;

    public Task2() {
        word = "Hello";
    }

    public Task2(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    protected void printWord() {
        System.out.println(word);
    }

    //For Task2

    //Task2Main.getDeclaredFields();
    //Task2Main.getDeclaredField();
    //Task2Main.getFields();
    //Task2Main.getField();

    //Task2Main.getDeclaredMethods();
    //Task2Main.getDeclaredMethod();
    //Task2Main.getEnclosingMethod();
    //Task2Main.setAccessible1();
    //Task2Main.setAccessible2();

    //Task2Main.interfaceCheck();
}
