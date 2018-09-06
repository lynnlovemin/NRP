package com.rtucloud.cs.proxy.config;

import com.rtucloud.cs.proxy.domain.Proxy;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 应用程序配置属性.
 */
@Data
@Component("appConfig")
@ConfigurationProperties(prefix = "app-config")
public class AppConfig {

    private long interval;

    private List<Proxy> proxy = new ArrayList<>();

    private int port;

}
