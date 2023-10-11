package com.dutaduta.sketchme.chat.adapter.in.api;

import com.dutaduta.sketchme.chat.adapter.in.api.dto.request.CreateOrGetRoomRequestDTO;
import com.dutaduta.sketchme.chat.adapter.in.api.dto.response.CreateOrGetRoomResponseDTO;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateOrGetChatRoomApi {

    @PostMapping("/chatroom/get")
    public ResponseEntity<ResponseFormat<CreateOrGetRoomResponseDTO>>
    createRoom(@RequestBody @Valid CreateOrGetRoomRequestDTO createOrGetRoomRequestDTO,
               HttpServletRequest request) {
        return null;
    }
}
