import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum WorkTypes {

    CAVITY_WALL_INSULATION_WOOL(1),
    OUTSIDE_WALL_INSULATION(2),
    PITCHED_ROOFS_INSULATION(3),
    FLAT_ROOF_INSULATION(8),
    ATTIC_FLOOR_INSULATION(4),
    FLOOR_INSULATION(5),
    ENERGY_AUDIT(6),
    AUDIT_BY_THERMOGRAPHY(7),
    CAVITY_WALL_INSULATION_EPS(9),
    FRAME(10);

    private final int id;

    WorkTypes(int id) {
        this.id = id;
    }

    @JsonValue
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "WorkTypes{" +
                "id=" + id +
                '}';
    }
}
