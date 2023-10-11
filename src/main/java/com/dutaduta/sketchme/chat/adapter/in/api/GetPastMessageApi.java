package com.dutaduta.sketchme.chat.adapter.in.api;

import com.dutaduta.sketchme.chat.adapter.in.api.dto.request.ChatHistoryRequestDTO;
import com.dutaduta.sketchme.chat.adapter.in.api.dto.response.ChatHistoryResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetPastMessageApi {
    @GetMapping("/chat/data")
    public List<ChatHistoryResponseDTO> getPastMessage(@ModelAttribute @Valid ChatHistoryRequestDTO requestDTO
            , @RequestParam("userID") Long userID) {
        return null;
    }
}
