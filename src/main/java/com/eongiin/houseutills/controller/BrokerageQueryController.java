package com.eongiin.houseutills.controller;

import com.eongiin.houseutills.constants.ActionType;
import com.eongiin.houseutills.policy.BrokeragePolicy;
import com.eongiin.houseutills.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eongiin
 *
 * 중개수수료가 얼마인지 조회하는 컨트롤러
 */
@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(
            @RequestParam ActionType actionType,
            @RequestParam Long price
    ) {
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
