package be.snypit.jackson.codehaus.arrays;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import java.io.IOException;
import java.util.List;

public class ArrayDeserializer extends JsonDeserializer<MyArray> {

    @Override
    public MyArray deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectMapper objectMapper = (ObjectMapper) jp.getCodec();

        return objectMapper.readValue(jp, TypeFactory.defaultInstance().constructCollectionType(List.class,
                Contact.class));
    }
}
