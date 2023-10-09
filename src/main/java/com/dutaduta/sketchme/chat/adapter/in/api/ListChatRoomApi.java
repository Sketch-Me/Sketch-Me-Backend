package com.dutaduta.sketchme.chat.adapter.in.api;

import com.dutaduta.sketchme.chat.adapter.in.api.dto.request.BunchOfChatRoomRequestDTO;
import com.dutaduta.sketchme.chat.adapter.in.api.dto.response.BunchOfChatRoomResponseDTO;
import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListChatRoomApi {
    @GetMapping("/chatroom/list")
    public ResponseEntity<ResponseFormat<List<BunchOfChatRoomResponseDTO>>>
    getBunchOfChatRoom(@ModelAttribute @Valid BunchOfChatRoomRequestDTO getBunchOFChatRoomRequest,
                       HttpServletRequest request) {
        return null;
    }
}
