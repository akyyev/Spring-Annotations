package com.codekerki.Spring.Annotations.configproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app")
@Data
@Component
public class AppProperties {

    private String name;
    private String description;
    private String uploadDir;

    private Security security;

    @Data
    public static class Security {

        private String username;
        private String password;
        private List<String> roles;
        private boolean enabled;

        private Map<String, String> permissions;
    }
}
