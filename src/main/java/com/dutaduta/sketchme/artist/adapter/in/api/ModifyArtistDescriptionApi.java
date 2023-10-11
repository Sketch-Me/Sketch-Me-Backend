package com.dutaduta.sketchme.artist.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ModifyArtistDescriptionApi {
    @PutMapping("/artist/desc")
    public ResponseEntity<ResponseFormat<String>> modifyArtistDescription(@RequestBody Map<String, String> descriptionMap, HttpServletRequest request) {
        return null;
    }

    /**
     * 비활성화한 작가 계정을 다시 활성화한다.
     * (테스트 목적으로만 사용된다. 실제 배포할 때는 해당 API는 쓰지 않는다.
     * 추후에 삭제 예정)
     */
    @PutMapping("/artist/test/activate")
    public ResponseEntity<?> reactivateArtist(HttpServletRequest request) {
        return null;
    }
}
