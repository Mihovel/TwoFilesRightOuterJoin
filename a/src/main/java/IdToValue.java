import lombok.*;

@Data
@AllArgsConstructor
public class IdToValue implements Comparable<IdToValue> {
    private String id;
    private String value;

    public int compareTo(IdToValue o) {
        return this.id.compareTo(o.id);
    }
}
