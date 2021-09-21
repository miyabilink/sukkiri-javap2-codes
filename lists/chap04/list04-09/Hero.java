public class Hero implements Cloneable {
    String name;    // 名前
    int hp;         // HP
    Sword sword;    // 装備している武器 

    public Hero clone() {
        Hero result = new Hero(name);
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }

    public Hero(String name) {
        this.name = name;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}