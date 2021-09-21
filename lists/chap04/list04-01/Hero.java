public class Hero {
    private String name;   private int hp, mp;
    /* : */
    public String toString() {  /* ObjectクラスのtoStringをオーバーライド */
        return "勇者(名前=" + this.name +
           "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }
}