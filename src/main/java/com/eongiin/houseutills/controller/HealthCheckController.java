package com.eongiin.houseutills.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eongiin
 *
 * 서비스 헬스 체크 컨트롤러
 */
@RestController
public class HealthCheckController {
    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }
}
