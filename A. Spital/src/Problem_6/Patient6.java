package Problem_6;

public class Patient6 {
    private String name;
    private String condition;
    private boolean requiresHospitalization;

    public Patient6(String name, String condition, boolean requiresHospitalization) {
        this.name = name;
        this.condition = condition;
        this.requiresHospitalization = requiresHospitalization;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public boolean requiresHospitalization() {
        return requiresHospitalization;
    }
}
