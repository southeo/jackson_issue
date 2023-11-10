package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LombokGetter {

    @JsonProperty("ac:xFrac")
    private Double xVal;

    @JsonProperty("ac:yFrac")
    private Double valY;

}
