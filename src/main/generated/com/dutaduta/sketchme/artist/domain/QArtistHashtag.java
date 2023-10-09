package com.dutaduta.sketchme.artist.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArtistHashtag is a Querydsl query type for ArtistHashtag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArtistHashtag extends EntityPathBase<ArtistHashtag> {

    private static final long serialVersionUID = -739603606L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtistHashtag artistHashtag = new QArtistHashtag("artistHashtag");

    public final QArtist artist;

    public final com.dutaduta.sketchme.common.domain.QHashtag hashtag;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QArtistHashtag(String variable) {
        this(ArtistHashtag.class, forVariable(variable), INITS);
    }

    public QArtistHashtag(Path<? extends ArtistHashtag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtistHashtag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtistHashtag(PathMetadata metadata, PathInits inits) {
        this(ArtistHashtag.class, metadata, inits);
    }

    public QArtistHashtag(Class<? extends ArtistHashtag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.artist = inits.isInitialized("artist") ? new QArtist(forProperty("artist"), inits.get("artist")) : null;
        this.hashtag = inits.isInitialized("hashtag") ? new com.dutaduta.sketchme.common.domain.QHashtag(forProperty("hashtag")) : null;
    }

}

