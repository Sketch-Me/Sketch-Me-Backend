package com.dutaduta.sketchme.artist.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFavoriteArtist is a Querydsl query type for FavoriteArtist
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFavoriteArtist extends EntityPathBase<FavoriteArtist> {

    private static final long serialVersionUID = -820705346L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFavoriteArtist favoriteArtist = new QFavoriteArtist("favoriteArtist");

    public final com.dutaduta.sketchme.common.domain.QBaseEntity _super = new com.dutaduta.sketchme.common.domain.QBaseEntity(this);

    public final QArtist artist;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDateTime = _super.createdDateTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDateTime = _super.updatedDateTime;

    public final QUser user;

    public QFavoriteArtist(String variable) {
        this(FavoriteArtist.class, forVariable(variable), INITS);
    }

    public QFavoriteArtist(Path<? extends FavoriteArtist> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFavoriteArtist(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFavoriteArtist(PathMetadata metadata, PathInits inits) {
        this(FavoriteArtist.class, metadata, inits);
    }

    public QFavoriteArtist(Class<? extends FavoriteArtist> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist"), inits.get("artist")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

