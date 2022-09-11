package com.appstoragecontroll.core.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestRequest {
    @JsonProperty("valor_a")
    private double a;

    @JsonProperty("valor_b")
    private double b;

    @JsonProperty("valor_c")
    private double c;
}
