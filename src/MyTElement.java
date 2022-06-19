public class MyTElement<T>{
    private T el; //private int el;

    public MyTElement(T el) {
        this.el = el;
    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }

    //@Override
    //public T getArrayList() {
//
    //    return null;
   // }

    // public MyIntElement(T el) {
    //    this.el = el;
    //}
//    public MyIntElement(int el) {
//        this.el = el;
//    }

   // public T getEl() {
   //     return el;
   // }

   // @Override
    //public String toString() {
//        return getEl() + " ";
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MyIntElement)) return false;
//        MyIntElement element = (MyIntElement) o;
//        return getEl() == element.getEl();
//    }
//
//    @Override
//    public T hashCode() {
//        return Objects.hash(getEl());
//    }
//
//    public void setEl(int el) {
//        this.el = el;
//    }
}
