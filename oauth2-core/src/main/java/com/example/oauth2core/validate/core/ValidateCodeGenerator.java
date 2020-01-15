package com.example.oauth2core.validate.core;

import org.springframework.web.context.request.ServletWebRequest;

public interface ValidateCodeGenerator {
    ValidateCode generate(ServletWebRequest request);
}
