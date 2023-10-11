package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.product.adapter.in.api.dto.response.PictureResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class SearchDrawings {
    @GetMapping("/search/drawing")
    public ResponseEntity<ResponseFormat<List<PictureResponse>>> searchPictures(@RequestParam String keyword, @RequestParam String orderBy) {
        return null;
    }

}
