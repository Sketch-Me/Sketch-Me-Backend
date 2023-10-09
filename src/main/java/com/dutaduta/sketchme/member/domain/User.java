package com.dutaduta.sketchme.member.domain;

import com.dutaduta.sketchme.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1024)
    private String email;

    @Column(length = 128)
    private String nickname;

    @Column(length = 512)
    private String phoneNo;

    @Column(length = 1024)
    private String profileImgUrl;

    @Column(length = 1024)
    private String profileThumbnailImgUrl;

    @Column(length = 1024)
    private String description;

    private boolean isLogined;

    private boolean isDebuted;

    private boolean isOpen;

    private boolean isDeleted;

    @OneToOne(fetch = FetchType.LAZY)
    private Artist artist;
}
