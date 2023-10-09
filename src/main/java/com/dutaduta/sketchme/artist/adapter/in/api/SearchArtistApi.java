package com.dutaduta.sketchme.artist.adapter.in.api;

import com.dutaduta.sketchme.artist.adapter.in.api.dto.response.ArtistResponse;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchArtistApi {
    @GetMapping("/search/artist")
    public ResponseEntity<ResponseFormat<List<ArtistResponse>>> searchArtists(@RequestParam String keyword, @RequestParam String orderBy) {
        return null;
    }
}
