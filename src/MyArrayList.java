import java.util.*;

public class MyArrayList {
    Collection<MyTElement> list;
    // Collection<MyIntElement> list;



    public MyArrayList() {
        this.list = new ArrayList<>();
    }

    public void setMyArrayList(int n) {
        Random random = new Random();
        this.list = new ArrayList<>(n);
        for (int i = 0; i < this.list.size(); i++) {
            MyTElement element = new MyTElement(random.nextInt());
            list.add(element);
        }


//        Random random = new Random();
//        this.list = new ArrayList<>(100);
//        MyIntElement element;
//        for (int i = 0; i < this.list.size(); i++) {
//            element = new MyIntElement(random.nextInt(10));
//            this.list.add(element);
//            System.out.println(element);
//        }
    }

//    public MyArrayList() {
//        Random random = new Random();
//        this.list = new ArrayList<>(100);
//        MyIntElement element;
//        for (int i = 0; i < this.list.size(); i++) {
//            element = new MyIntElement(random.nextInt(10));
//            this.list.add(element);
//            System.out.println(element);
//        }
//    }

//    public void setListOfElements(int n) {
//        Random random = new Random();
//        this.list = new ArrayList<>(n);
//        for (int i = 0; i < this.list.size(); i++) {
//            MyIntElement element = new MyIntElement(random.nextInt());
//            list.add(element);
//        }
//    }

//    public void setListOfElements(int n) {
//        Random random = new Random();
//        this.list = new ArrayList<>(n);
//        for (int i = 0; i < this.list.size(); i++) {
//            MyIntElement element = new MyIntElement(random.nextInt());
//            list.add(element);
//        }
//    }
}
