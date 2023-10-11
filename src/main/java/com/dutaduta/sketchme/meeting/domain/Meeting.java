package com.dutaduta.sketchme.meeting.domain;

import com.dutaduta.sketchme.artist.domain.Artist;
import com.dutaduta.sketchme.chat.domain.ChatRoom;
import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.common.domain.Category;
import com.dutaduta.sketchme.product.domain.Picture;
import com.dutaduta.sketchme.product.domain.Timelapse;
import com.dutaduta.sketchme.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Meeting extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private ChatRoom chatRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;

    private LocalDateTime startDateTime;

    @Column(length = 1024)
    private String content;

    private boolean isOpen;

    @Enumerated(value = EnumType.STRING)
    @Builder.Default // Waiting이 기본 값
    private MeetingStatus meetingStatus = MeetingStatus.WAITING;

    private Long exactPrice;

    @Column(unique = true)
    private String videoConferenceRoomSessionId;

    @OneToOne(mappedBy = "meeting", fetch = FetchType.LAZY)
    private Timelapse timelapse;

    @OneToOne(mappedBy = "meeting", fetch = FetchType.LAZY)
    private Picture picture;

    // 고객 비디오 연결 ID
    private String userVideoConnectionId;

    // 아티스트 비디오 연결 ID
    private String artistVideoConnectionId;

    // 아티스트 캔버스 연결 ID
    private String artistCanvasConnectionId;
}
