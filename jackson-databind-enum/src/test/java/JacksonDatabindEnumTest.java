import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class JacksonDatabindEnumTest {

    @Test
    public void testSerializeEnum() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println(objectMapper.writeValueAsString(new Lead()));

    }

    @Test
    public void testDeserializeEnum() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Lead lead = objectMapper.readValue("{\"workTypes\":[4,7]}", Lead.class);

        System.out.println(lead.getWorkTypes());
    }

}
