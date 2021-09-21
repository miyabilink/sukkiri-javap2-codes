public abstract class Character {
    protected String name;
    /* : */
    public final void introduce() {         /* (1)のメソッド */
        System.out.println("私の名前は、" + this.name + "です。");
        doIntroduce();                      /* (2)を呼び出し */
        System.out.println("よろしくお願いします。");
    }
    protected abstract void doIntroduce();  /* (2)のメソッド */
}