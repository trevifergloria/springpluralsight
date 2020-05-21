package com.pluralsight.springfc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/kitty")
public class KittyController {

    @Autowired
    private KittyService kittyService;

    @PostMapping(path = "/one", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public KittyResponse getOneKitty(@RequestBody KittyRequest request) {
        if(null == request) throw new RuntimeException("request is null");
        return kittyService.getOneKitty(request);
    }
}
