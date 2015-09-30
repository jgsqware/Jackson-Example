package be.snypit.jackson.codehaus;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;

public class TermDeserializer extends JsonDeserializer<Term> {
    @Override
    public Term deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        return Term.fromString(parser.getText());
    }
}
