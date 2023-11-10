package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class LowercaseGetter {

    @JsonProperty("ac:xFrac")
    private Double xVal;

    @JsonProperty("ac:yFrac")
    @Getter
    private Double valY;

    public Double getxVal(){
        return xVal;
    }


}
