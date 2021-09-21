public class Main {
    public static void main(String[] args) {
        int age = 33;           // 今年の年齢
        assert (++age >= 20);   // 来年20歳以上であるハズだ
        System.out.println("あなたの来年の年齢は" + age);
    }
}