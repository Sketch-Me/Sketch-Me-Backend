package com.dutaduta.sketchme.user.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequiredArgsConstructor
public class RegisterFavoriteArtistApi {
    @PostMapping("/user/artist")
    public ResponseEntity<ResponseFormat<String>> registFavoriteArtist(@RequestBody Map<String, Long> artistMap, HttpServletRequest request) {
        return null;
    }
}
