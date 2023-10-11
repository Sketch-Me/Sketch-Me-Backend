package com.dutaduta.sketchme.artist.adapter.in.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterAsArtistApi {
    @PostMapping("/artist/regist")
    public ResponseEntity<?> registArtist(HttpServletRequest request) {
        return null;
    }
}
