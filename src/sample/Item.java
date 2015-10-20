package sample;

/**
 * Created by benjamindrake on 10/20/15.
 */
public class Item {
    String text;
    boolean isDone;

    public Item(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        String done = "";
        if (isDone) {
            done = "(done)";
        }
        return String.format("%s %s", text, done);
    }
}
