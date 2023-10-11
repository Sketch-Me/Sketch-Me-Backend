package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.product.adapter.in.api.dto.response.MyPictureResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GetMyPictureApi {
    @GetMapping("/my-drawings")
    public ResponseEntity<ResponseFormat<List<MyPictureResponse>>> seePicturesIBought(HttpServletRequest request) {
        return null;
    }
}
