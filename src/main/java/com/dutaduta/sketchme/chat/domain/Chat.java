package com.dutaduta.sketchme.chat.domain;

import com.dutaduta.sketchme.common.domain.BaseEntity;
import com.dutaduta.sketchme.user.domain.MemberType;
import com.dutaduta.sketchme.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chat extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private ChatRoom chatRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    private User receiver;

    @Column(length = 1024, nullable = false)
    private String content;

    @Enumerated(value = EnumType.STRING)
    private MemberType memberType;
}
