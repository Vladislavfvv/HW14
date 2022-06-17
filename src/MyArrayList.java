import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MyArrayList {
    Collection<MyIntElement> list;

    public MyArrayList() {
        Random random = new Random();
        this.list = new ArrayList<>(100);
        for (int i = 0; i < list.size(); i++) {
            MyIntElement element = new MyIntElement(random.nextInt());
            list.add(element);
        }
    }
}
