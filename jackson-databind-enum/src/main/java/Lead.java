import java.util.ArrayList;
import java.util.List;

public class Lead {
    List<WorkTypes> workTypes = new ArrayList<>();

    public Lead() {
        workTypes.add(WorkTypes.ATTIC_FLOOR_INSULATION);
        workTypes.add(WorkTypes.AUDIT_BY_THERMOGRAPHY);
    }

    public void setWorkTypes(List<WorkTypes> workTypes) {
        this.workTypes = workTypes;
    }

    public List<WorkTypes> getWorkTypes() {
        return workTypes;
    }
}
