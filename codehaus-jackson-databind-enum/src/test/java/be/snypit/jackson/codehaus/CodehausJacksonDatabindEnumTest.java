package be.snypit.jackson.codehaus;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class CodehausJacksonDatabindEnumTest {
    @Test
    public void testSerializeEnum() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        assertThat(objectMapper.writeValueAsString(new Contract(Term.WITHIN_3_MONTHS)),is("{\"term\":\"Within 3 months\"}"));
    }

    @Test
    public void testDeserializeEnum() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Lead lead = objectMapper.readValue("{\"workTypes\":[\"4\",\"7\"]}", Lead.class);
        assertThat(lead.getWorkTypes().size(),is(2));
    }

    @Test
    public void testDeserializeUnknownEnum() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Contract contract = objectMapper.readValue("{\"term\":\"\"}", Contract.class);
        assertThat(contract.getTerm(), nullValue());
    }
}
