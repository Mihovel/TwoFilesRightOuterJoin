import java.util.List;

public class ArrayListJoinServiceImpl implements ListJoinService {
    public void rightOuterJoin(List<IdToValue> list1, List<IdToValue> list2) {
        for (int i = 0; i < list1.size(); i++) {
            boolean isMatches = false;
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i).getId().equals(list2.get(j).getId())) {
                    System.out.println(list1.get(i).toString()+list2.get(j).toString());
                    isMatches = true;
                }
            }
/*
            if (!isMatches) {
                System.out.println(idListSecondFile.get(i) + "     " + valueListSecondFile.get(i));
            }*/
        }
    }
}
