package com.dutaduta.sketchme.artist.adapter.in.api;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class OpenArtistProfileApi {
    @PutMapping("/artist")
    public ResponseEntity<?> changeArtistIsOpen(@RequestParam Boolean isOpen, HttpServletRequest request) {
        return null;
    }
}
