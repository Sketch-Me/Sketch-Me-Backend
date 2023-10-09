package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.product.adapter.in.api.dto.response.PictureResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GetDrawingsOfArtistApi {
    @GetMapping("/drawing/artist")
    public ResponseEntity<ResponseFormat<List<PictureResponse>>> seeDrawingsOfArtist(HttpServletRequest request) {
        return null;
    }
}
