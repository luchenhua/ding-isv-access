package com.dingtalk.isv.access.api.constant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessSuiteConfig {

    private String aes;
    private String token;
    private String suiteKey;
    private Long[] appId;
}
