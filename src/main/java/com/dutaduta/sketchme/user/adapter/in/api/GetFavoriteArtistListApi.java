package com.dutaduta.sketchme.user.adapter.in.api;

import com.dutaduta.sketchme.artist.adapter.in.api.dto.response.ArtistResponse;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class GetFavoriteArtistListApi {
    @GetMapping("/user/artist")
    public ResponseEntity<ResponseFormat<List<ArtistResponse>>> seeFavoriteArtist(HttpServletRequest request) {
        return null;
    }
}
