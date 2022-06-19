import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyArrayList2<M> {
    List<M> mList;

    public List<M> getmList() { return mList;}

    public void setmList(List<M> mList) {this.mList = mList;}

    public void setMyArrayList(int n) {
        Random random = new Random();
        this.mList = new ArrayList<>(n);
        for (int i = 0; i < this.mList.size(); i++) {
            Integer element = random.nextInt(100);
            mList.add((M) element);
        }
    }

    @Override
    public String toString() {
        return "MyArrayList2{" +
                "mList=" + mList +
                '}';
    }
}
