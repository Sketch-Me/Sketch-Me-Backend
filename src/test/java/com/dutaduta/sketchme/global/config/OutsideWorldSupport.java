package com.dutaduta.sketchme.global.config;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

public abstract class OutsideWorldSupport {
    private static final String MYSQL_VERSION = "mysql:8";
    private static final String REDIS_VERSION = "redis:alpine3.18";

    protected static final MySQLContainer<?> MY_SQL_CONTAINER;
    protected static final GenericContainer<?> REDIS_CONTAINER;

    static {
        MY_SQL_CONTAINER = new MySQLContainer<>(MYSQL_VERSION);
        MY_SQL_CONTAINER.start();
        REDIS_CONTAINER = new GenericContainer<>(DockerImageName.parse(REDIS_VERSION))
                .withExposedPorts(6379);
        REDIS_CONTAINER.start();
    }

}
