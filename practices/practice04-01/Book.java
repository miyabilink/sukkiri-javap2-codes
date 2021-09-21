import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String commnet;
    public int hashCode() {
        int r = 1;
        r = 31 * r + publishDate.hashCode();
        r = 31 * r + title.hashCode();
        return r;
    }
    public boolean equals(Object o) {
        if(this == o) {
        	return true;
        }
        if(o == null) {
        	return false;
        }
        if(!(o instanceof Book)) {
        	return false;
        }
        Book b = (Book)o;
        if(!publishDate.equals(b.publishDate)) {
        	return false;
        }
        if(!title.equals(b.title)) {
        	return false;
        }
        return true;
    }
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }
    public Book clone() {
        Book b = new Book();
        b.title = this.title;
        b.commnet = this.commnet;
        b.publishDate = (Date)this.publishDate.clone();
        return b;
    }
    //  :  (フィールド宣言、getter/setterの宣言は省略)
}
