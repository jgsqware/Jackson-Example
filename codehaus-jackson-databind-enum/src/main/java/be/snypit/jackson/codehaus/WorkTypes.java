package be.snypit.jackson.codehaus;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

public enum WorkTypes {

    CAVITY_WALL_INSULATION_WOOL("1"),
    OUTSIDE_WALL_INSULATION("2"),
    PITCHED_ROOFS_INSULATION("3"),
    FLAT_ROOF_INSULATION("8"),
    ATTIC_FLOOR_INSULATION("4"),
    FLOOR_INSULATION("5"),
    ENERGY_AUDIT("6"),
    AUDIT_BY_THERMOGRAPHY("7"),
    CAVITY_WALL_INSULATION_EPS("9"),
    FRAME("10");

    private final String id;

    WorkTypes(String id) {
        this.id = id;
    }

    @JsonCreator
    public static WorkTypes forValue(String value) {
        for (WorkTypes workTypes : values()) {
            if (workTypes.getId().equalsIgnoreCase(value)) {
                return workTypes;
            }
        }
        return null;
    }

    @JsonValue
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "WorkTypes{" +
                "id=" + id +
                '}';
    }
}
