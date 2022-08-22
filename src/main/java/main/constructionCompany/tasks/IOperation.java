package main.constructionCompany.tasks;

@FunctionalInterface
public interface IOperation<T> {
    T getResult(T value1,T value2);
}
