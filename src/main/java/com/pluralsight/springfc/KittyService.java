package com.pluralsight.springfc;

import org.springframework.stereotype.Service;

@Service
public class KittyService {
    public KittyResponse getOneKitty(KittyRequest request) {
        return KittyResponse.builder()
                .name(request.getName())
                .color("Black")
                .weightInPounds(12.6)
                .mood("Crazy")
                .build();
    }
}
