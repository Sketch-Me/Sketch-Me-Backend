package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public class DeleteDrawingOfArtistApi {
    @DeleteMapping("/drawing/artist")
    public ResponseEntity<ResponseFormat<String>> deleteDrawingOfArtist(@RequestBody Map<String, Long> pictureMap, HttpServletRequest request) {
        return null;
    }
}
