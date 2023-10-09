package com.dutaduta.sketchme.artist.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtist is a Querydsl query type for Artist
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArtist extends EntityPathBase<Artist> {

    private static final long serialVersionUID = -1155407358L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtist artist = new QArtist("artist");

    public final com.dutaduta.sketchme.common.domain.QBaseEntity _super = new com.dutaduta.sketchme.common.domain.QBaseEntity(this);

    public final ListPath<ArtistHashtag, QArtistHashtag> artistHashtagList = this.<ArtistHashtag, QArtistHashtag>createList("artistHashtagList", ArtistHashtag.class, QArtistHashtag.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDateTime = _super.createdDateTime;

    public final StringPath description = createString("description");

    public final ListPath<FavoriteArtist, QFavoriteArtist> favoriteArtistList = this.<FavoriteArtist, QFavoriteArtist>createList("favoriteArtistList", FavoriteArtist.class, QFavoriteArtist.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDeactivated = createBoolean("isDeactivated");

    public final BooleanPath isOpen = createBoolean("isOpen");

    public final StringPath nickname = createString("nickname");

    public final StringPath profileImgUrl = createString("profileImgUrl");

    public final StringPath profileThumbnailImgUrl = createString("profileThumbnailImgUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDateTime = _super.updatedDateTime;

    public final QUser user;

    public QArtist(String variable) {
        this(Artist.class, forVariable(variable), INITS);
    }

    public QArtist(Path<? extends Artist> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtist(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtist(PathMetadata metadata, PathInits inits) {
        this(Artist.class, metadata, inits);
    }

    public QArtist(Class<? extends Artist> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

