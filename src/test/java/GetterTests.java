import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.LombokGetter;
import org.example.LowercaseGetter;
import org.example.UppercaseGetter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class GetterTests {

    private static final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
    private static final Double xVal = 0.1;
    private static final Double yVal = 0.3;

    @Test
    void lombokGetterTest() {
        var pojo = new LombokGetter(xVal, yVal);
        var serializedPojo = mapper.valueToTree(pojo);
        System.out.println("Serialized Pojo with Lombok getter: \n" + serializedPojo.toPrettyString());
        assertThat(serializedPojo.get("ac:xFrac").asDouble()).isEqualTo(xVal);
        assertThat(serializedPojo.get("ac:yFrac").asDouble()).isEqualTo(yVal);
        assertThat(serializedPojo.get("xval").asDouble()).isEqualTo(xVal);
        assertThat(serializedPojo.get("yval")).isNull();

    }

    @Test
    void uppercaseGetterTest() {
        var pojo = new UppercaseGetter(xVal, yVal);
        var serializedPojo = mapper.valueToTree(pojo);
        System.out.println("Serialized Pojo with getXVal(): \n" + serializedPojo.toPrettyString());
        assertThat(serializedPojo.get("ac:xFrac").asDouble()).isEqualTo(xVal);
        assertThat(serializedPojo.get("ac:yFrac").asDouble()).isEqualTo(yVal);
        assertThat(serializedPojo.get("xval").asDouble()).isEqualTo(xVal);
        assertThat(serializedPojo.get("yval")).isNull();
    }

    @Test
    void lowercaseGetterTest() {
        var pojo = new LowercaseGetter(xVal, yVal);
        var serializedPojo = mapper.valueToTree(pojo);
        System.out.println("Serialized Pojo with getxVal(): \n" + serializedPojo.toPrettyString());
        assertThat(serializedPojo.get("ac:xFrac").asDouble()).isEqualTo(xVal);
        assertThat(serializedPojo.get("ac:yFrac").asDouble()).isEqualTo(yVal);
        assertThat(serializedPojo.get("xval")).isNull();
        assertThat(serializedPojo.get("yval")).isNull();
    }


}
