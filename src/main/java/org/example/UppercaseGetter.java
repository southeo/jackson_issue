package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UppercaseGetter {
    @JsonProperty("ac:xFrac")
    private Double xVal;

    @Getter
    @JsonProperty("ac:yFrac")
    private Double valY;

    public Double getXVal(){
        return xVal;
    }

}
