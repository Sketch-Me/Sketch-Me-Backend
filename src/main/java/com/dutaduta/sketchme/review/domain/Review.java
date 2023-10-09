package com.dutaduta.sketchme.review.domain;

import com.dutaduta.sketchme.artist.domain.Artist;
import com.dutaduta.sketchme.artist.domain.User;
import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.meeting.domain.Meeting;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 2, scale = 1)
    private BigDecimal rating;

    @Column(length = 2048)
    private String content;

    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;

    @OneToOne(fetch = FetchType.LAZY)
    private Meeting meeting;
}
