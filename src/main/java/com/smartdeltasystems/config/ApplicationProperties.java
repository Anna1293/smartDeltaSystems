package com.smartdeltasystems.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring")
@Data
public class ApplicationProperties {

    @Getter
    @Setter
    public static class Data {
        public Mongodb mongodb;
    }

    @Getter
    @Setter
    public static class Mongodb {
        private String uri;
        private String database;
    }

    private Data data;
    private Mongodb mongodb;
}
