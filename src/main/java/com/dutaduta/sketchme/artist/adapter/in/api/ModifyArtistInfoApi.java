package com.dutaduta.sketchme.artist.adapter.in.api;

import com.dutaduta.sketchme.artist.adapter.in.api.dto.request.ArtistInfoRequest;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class ModifyArtistInfoApi {
    @PutMapping("/artist/info")
    public ResponseEntity<ResponseFormat<String>> modifyArtistInformation(@RequestPart(value = "dto") ArtistInfoRequest artistInfoRequest, @Nullable @RequestPart(value = "uploadFile") MultipartFile uploadFile, HttpServletRequest request) {
        return null;
    }
}
