package com.pluralsight.springfc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KittyResponse {
    private String name;
    private double weightInPounds;
    private String color;
    private String mood;
}
