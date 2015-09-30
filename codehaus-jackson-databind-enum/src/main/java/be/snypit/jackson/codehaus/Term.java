package be.snypit.jackson.codehaus;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum Term {
    WITHIN_3_MONTHS("Within 3 months"),
    BETWEEN_3_AND_6_MONTHS("Between 3 and 6 months"),
    WITHIN_MORE_THAN_6_MONTHS("Within more than 6 months"),
    UNDECIDED("Undecided");

    private final String value;

    Term(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Term fromString(String value) {
        for (Term term : values()) {
            if (term.getValue().equalsIgnoreCase(value)) {
                return term;
            }
        }

        return null;
    }
}
