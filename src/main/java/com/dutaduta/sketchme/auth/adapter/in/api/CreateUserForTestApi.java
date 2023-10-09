package com.dutaduta.sketchme.auth.adapter.in.api;


import com.dutaduta.sketchme.artist.domain.Artist;
import com.dutaduta.sketchme.artist.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@Slf4j
public class CreateUserForTestApi {

    @PostMapping("/test/create/user")
    public User createUser(@RequestBody User user) {
        return null;
    }

    @PostMapping("/test/create/user/{userId}")
    public String createArtist(@RequestBody Artist artist, @PathVariable("userId") Long userId) {
        return null;
    }
}