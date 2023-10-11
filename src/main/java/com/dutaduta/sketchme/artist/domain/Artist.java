package com.dutaduta.sketchme.artist.domain;

import com.dutaduta.sketchme.common.domain.BaseEntity;
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
public class Artist extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512)
    private String nickname;

    @Column(length = 1024)
    private String profileImgUrl;

    @Column(length = 1024)
    private String profileThumbnailImgUrl;

    @Column(length = 1024)
    private String description;

    private boolean isOpen;

    private boolean isDeactivated;

    @OneToOne(mappedBy = "artist", fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "artist")
    private List<ArtistHashtag> artistHashtagList;

    @OneToMany(mappedBy = "artist")
    private List<FavoriteArtist> favoriteArtistList;
}
