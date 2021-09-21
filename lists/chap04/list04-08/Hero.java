class Hero implements Cloneable {   /* (1) */
    String name;    // 名前
    int hp;         // HP
    Sword sword;    // 装備している武器
    /* : */
    public Hero clone() {           /* (2) */
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
}