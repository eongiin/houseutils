package com.eongiin.houseutills.policy;

public interface BrokeragePolicy {
    default Long calculate(Long price) {
        // TODO:가격을 받아서 중개수수료를 게산한다
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }

    BrokerageRule createBrokerageRule(Long price);
}
