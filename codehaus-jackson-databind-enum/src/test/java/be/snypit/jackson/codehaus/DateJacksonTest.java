package be.snypit.jackson.codehaus;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateJacksonTest {
    @Test
    public void testSerializeDate() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();


        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-08-19 14:33:24");

        String valueAsString = objectMapper.writeValueAsString(date);

        System.out.println(valueAsString);

    }

    @Test
    public void testDeserializeDate() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        Date date = objectMapper.readValue("1441118306115", Date.class);

        System.out.println(date);

    }
}
