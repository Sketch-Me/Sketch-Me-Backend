package com.dutaduta.sketchme.global.responseformat;

import lombok.Builder;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ToString
@Builder
public class ResponseFormat<T> {
    private final String message;
    private final T data;

    public static <T> ResponseFormat<T> success(T data) {
        return ResponseFormat.<T>builder()
                .message("성공했습니다.")
                .data(data).build();
    }

    public static <T> ResponseFormat<T> success() {
        return ResponseFormat.<T>builder()
                .message("성공했습니다.")
                .build();
    }

    public static <T> ResponseFormat<T> successWithCustomMsg(T data, String msg) {
        return ResponseFormat.<T>builder()
                .message(msg)
                .data(data).build();
    }

    public static <T> ResponseFormat<T> fail(T data, String msg) {
        return ResponseFormat.<T>builder()
                .message(msg)
                .data(data).build();
    }

    public static <T> ResponseFormat<T> fail(String msg) {
        return ResponseFormat.<T>builder()
                .message(msg)
                .build();
    }

    public ResponseEntity<ResponseFormat<T>> toEntity(HttpStatus httpStatusCode) {
        return new ResponseEntity<>(this, httpStatusCode);
    }
}
