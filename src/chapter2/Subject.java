package chapter2;

public interface Subject {
    public void registerObserver(Observer b);
    public void removeObserver(Observer b);
    public void notifyObservers();
}
