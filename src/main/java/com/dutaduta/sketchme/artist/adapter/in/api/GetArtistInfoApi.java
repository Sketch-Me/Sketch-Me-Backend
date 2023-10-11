package com.dutaduta.sketchme.artist.adapter.in.api;

import com.dutaduta.sketchme.artist.adapter.in.api.dto.response.ArtistResponse;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetArtistInfoApi {
    @GetMapping("/artist/info/{id}")
    public ResponseEntity<ResponseFormat<ArtistResponse>> getArtistInfo(@PathVariable Long id, HttpServletRequest request) {
        return null;
    }
}
