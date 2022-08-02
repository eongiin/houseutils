package com.eongiin.houseutills.policy;

import com.eongiin.houseutills.constants.ActionType;
import com.eongiin.houseutills.exception.ErrorCode;
import com.eongiin.houseutills.exception.HouseUtilsException;

public class BrokeragePolicyFactory {

    private static final PurchaseBrokeragePolicy brokeragePolicy = new PurchaseBrokeragePolicy();
    private static final RentBrokeragePolicy rentBrokeragePolicy = new RentBrokeragePolicy();

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return rentBrokeragePolicy;
            case PURCHASE:
                return brokeragePolicy;
            default:
                throw new HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
