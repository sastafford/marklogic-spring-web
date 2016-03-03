package com.marklogic.spring.http;

import org.springframework.beans.factory.annotation.Value;

/**
 * Simple config class that can be a Bean in a Spring Configuration class and look for common MarkLogic connection
 * properties - marklogic.mlHost and marklogic.mlRestPort.
 * 
 * The scheme attribute is there for future SSL support.
 */
public class RestConfig {

    @Value("${marklogic.mlHost:localhost}")
    private String host;

    @Value("${marklogic.mlRestPort:8000}")
    private Integer restPort;

    private String scheme = "http";

    public RestConfig() {

    }

    public RestConfig(String host, Integer restPort) {
        this.host = host;
        this.restPort = restPort;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getRestPort() {
        return restPort;
    }

    public void setRestPort(Integer restPort) {
        this.restPort = restPort;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

}