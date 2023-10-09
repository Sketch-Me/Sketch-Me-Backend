package com.dutaduta.sketchme.product.domain;

import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.meeting.domain.Meeting;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Timelapse extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1024)
    private String url;
    @Column(length = 1024)
    private String thumbnailUrl;
    @OneToOne(fetch = FetchType.LAZY)
    private Meeting meeting;
    private boolean isOpen;
    private boolean isDeleted;
}
