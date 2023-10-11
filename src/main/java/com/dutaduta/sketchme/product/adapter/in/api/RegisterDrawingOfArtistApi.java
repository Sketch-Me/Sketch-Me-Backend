package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.user.adapter.in.api.dto.response.ImgUrlResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class RegisterDrawingOfArtistApi {
    @PostMapping("/drawing/artist")
    public ResponseEntity<ResponseFormat<List<ImgUrlResponse>>> registDrawingsOfArtist(MultipartFile[] uploadFiles, HttpServletRequest request) {
        return null;
    }
}
