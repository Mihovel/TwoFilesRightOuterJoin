import java.util.Collections;
import java.util.List;

public class LinkedListJoinServiceImpl implements ListJoinService {
    public void rightOuterJoin(List<IdToValue> list1, List<IdToValue> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        //nlogn

        //2n
    }
}
