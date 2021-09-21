public class Pocket<String> {
    private String data;
    public void put(String d) { this.data = d; }        /* すべてのEがStringに置き換わった */
    public String get() { return this.data; }
}
