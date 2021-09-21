class OnlyoneFlower { /* … */ }     //「世界に1つだけの花」クラス

public class Main {
    public static void main(String[] args) {
        OnlyoneFlower f1 = new OnlyoneFlower();
        OnlyoneFlower f2 = new OnlyoneFlower();     /* 2つ目の花ができてしまう */
    }
}