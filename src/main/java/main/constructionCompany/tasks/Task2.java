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
}
