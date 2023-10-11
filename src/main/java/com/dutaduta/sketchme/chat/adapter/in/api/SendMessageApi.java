package com.dutaduta.sketchme.chat.adapter.in.api;

import com.dutaduta.sketchme.chat.adapter.in.api.dto.request.MessageDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SendMessageApi {
    /**
     * KAFKA Cluster에 메시지를 전송한다.
     *
     * @param messageDTO 전송할 메시지
     */
    @MessageMapping("/publish")
    public void sendMessage(@RequestBody @Valid MessageDTO messageDTO) {
    }

    @PostMapping("/test/publish")
    public void sendMessageTest(@RequestBody @Valid MessageDTO messageDTO) {
    }
}
