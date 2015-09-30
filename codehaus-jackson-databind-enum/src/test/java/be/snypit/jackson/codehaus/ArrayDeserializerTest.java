package be.snypit.jackson.codehaus;

import be.snypit.jackson.codehaus.arrays.MyArray;
import com.google.common.io.Resources;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayDeserializerTest {

    @Test
    public void testDeserializeArray() throws Exception {
        String myArrayJson = Resources.toString(Resources.getResource("myArray.json"), Charset.defaultCharset());

        ObjectMapper objectMapper = new ObjectMapper();
        MyArray contacts = objectMapper.readValue(myArrayJson, MyArray.class);
        assertThat(contacts.size(),equalTo(2));

    }


}