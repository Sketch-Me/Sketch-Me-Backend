package com.dutaduta.sketchme.global.responseformat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ToString
@Builder
public class ResponseFormat<T> {
    private final String message;
    @JsonIgnore
    private final int httpStatusCode;
    private final T data;

    public static <T> ResponseFormat<T> success(T data) {
        return ResponseFormat.<T>builder()
                .httpStatusCode(HttpStatus.OK.value())
                .message("성공했습니다.")
                .data(data).build();
    }

    public static <T> ResponseFormat<T> success() {
        return ResponseFormat.<T>builder()
                .httpStatusCode(HttpStatus.OK.value())
                .message("성공했습니다.")
                .build();
    }

    public static <T> ResponseFormat<T> successWithCustomMsg(T data, String msg) {
        return ResponseFormat.<T>builder()
                .httpStatusCode(HttpStatus.OK.value())
                .message(msg)
                .data(data).build();
    }

    public static <T> ResponseFormat<T> fail(T data, HttpStatus status, String msg) {
        return ResponseFormat.<T>builder()
                .httpStatusCode(status.value())
                .message(msg)
                .data(data).build();
    }

    public static <T> ResponseFormat<T> fail(HttpStatus status, String msg) {
        return ResponseFormat.<T>builder()
                .httpStatusCode(status.value())
                .message(msg)
                .build();
    }

    public ResponseEntity<ResponseFormat<T>> toEntity() {
        return new ResponseEntity<>(this, HttpStatus.valueOf(httpStatusCode));
    }
}