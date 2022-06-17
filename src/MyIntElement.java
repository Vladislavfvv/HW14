public class MyIntElement {
    private int el;

    public MyIntElement(int el) {
        this.el = el;
    }

    public int getEl() {
        return el;
    }

    @Override
    public String toString() {
        return "element: " + getEl() + "\n";
    }

    public void setEl(int el) {
        this.el = el;
    }
}
