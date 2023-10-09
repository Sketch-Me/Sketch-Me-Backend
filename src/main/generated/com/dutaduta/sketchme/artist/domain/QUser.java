package com.dutaduta.sketchme.artist.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 790454598L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final com.dutaduta.sketchme.common.domain.QBaseEntity _super = new com.dutaduta.sketchme.common.domain.QBaseEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDateTime = _super.createdDateTime;

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDebuted = createBoolean("isDebuted");

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final BooleanPath isLogined = createBoolean("isLogined");

    public final BooleanPath isOpen = createBoolean("isOpen");

    public final StringPath nickname = createString("nickname");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath profileImgUrl = createString("profileImgUrl");

    public final StringPath profileThumbnailImgUrl = createString("profileThumbnailImgUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDateTime = _super.updatedDateTime;

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist"), inits.get("artist")) : null;
    }

}

