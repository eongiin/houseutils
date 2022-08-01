package com.eongiin.houseutills.controller;

import com.eongiin.houseutills.constants.ActionType;
import com.eongiin.houseutills.policy.BrokeragePolicy;
import com.eongiin.houseutills.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(
            @RequestParam ActionType actionType,
            @RequestParam Long price
    ) {

        // TODO: 중개수수료 계산하는 로직
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
