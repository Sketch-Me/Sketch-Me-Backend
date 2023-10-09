package com.dutaduta.sketchme.artist.adapter.in.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeactivateArtistApi {
    @DeleteMapping("/artist/deactivate")
    public ResponseEntity<?> deactivateArtist(HttpServletRequest request) {
        return null;
    }

}
