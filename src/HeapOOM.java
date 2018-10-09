import java.util.ArrayList;

/**
 * Created by lenovo on 2018/9/5.
 */
public class HeapOOM {

    public static class OOMObject {

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        while (true) list.add(new OOMObject());
    }

}
