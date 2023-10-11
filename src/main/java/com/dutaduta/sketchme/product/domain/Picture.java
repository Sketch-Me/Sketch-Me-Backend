package com.dutaduta.sketchme.product.domain;

import com.dutaduta.sketchme.artist.domain.Artist;
import com.dutaduta.sketchme.artist.domain.User;
import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.common.domain.Category;
import com.dutaduta.sketchme.meeting.domain.Meeting;
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
public class Picture extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isOpen;
    private boolean isDeleted;
    @Column(length = 1024)
    private String url;
    @Column(length = 1024)
    private String thumbnailUrl;
    private boolean isDrawnInApp;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @OneToOne(fetch = FetchType.LAZY)
    private Meeting meeting;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;
    @OneToMany(mappedBy = "picture")
    private List<PictureHashtag> hashtagList;
}
