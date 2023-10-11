package com.dutaduta.sketchme.artist.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetArtistDescriptionApi {
    @GetMapping("/artist/desc/{id}")
    public ResponseEntity<ResponseFormat<String>> getArtistDescription(@PathVariable(name = "id") Long id) {
        return null;
    }
}
