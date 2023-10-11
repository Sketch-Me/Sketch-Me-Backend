package com.dutaduta.sketchme.chat.domain;

import com.dutaduta.sketchme.artist.domain.Artist;
import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.meeting.domain.Meeting;
import com.dutaduta.sketchme.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "artist_id"}))
public class ChatRoom extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;

    @OneToOne(fetch = FetchType.LAZY)
    private Chat lastChat;

    @OneToMany(mappedBy = "chatRoom")
    private List<Meeting> meeting;
}
