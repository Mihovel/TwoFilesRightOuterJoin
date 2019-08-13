import java.util.LinkedList;
import java.util.List;

public class ListDataProvider {
    public static List<IdToValue> createListIdToValue1() {
        IdToValue a = new IdToValue("1", "A");
        IdToValue a2 = new IdToValue("2", "C");
        IdToValue a3 = new IdToValue("3", "D");
        IdToValue a4 = new IdToValue("2", "B");
        IdToValue a5 = new IdToValue("5", "D");
        List<IdToValue> idToValues = new LinkedList<IdToValue>();
        idToValues.add(a);
        idToValues.add(a2);
        idToValues.add(a3);
        idToValues.add(a4);
        idToValues.add(a5);
        return idToValues;
    }
    public static List<IdToValue> createListIdToValue2() {
        IdToValue a = new IdToValue("2", "A");
        IdToValue a2 = new IdToValue("4", "B");
        IdToValue a3 = new IdToValue("3", "E");
        List<IdToValue> idToValues = new LinkedList<IdToValue>();
        idToValues.add(a);
        idToValues.add(a2);
        idToValues.add(a3);
        return idToValues;
    }
}
