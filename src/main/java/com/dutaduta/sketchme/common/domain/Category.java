package com.dutaduta.sketchme.common.domain;

import com.dutaduta.sketchme.artist.domain.Artist;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512)
    private String name;

    @Column(length = 1024)
    private String description;

    @Builder.Default // 초기값 = 공개
    private boolean isOpen = true;

    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;

    @Column
    private Long approximatePrice;
}
