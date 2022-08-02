package com.eongiin.houseutills.policy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BrokeragePolicyTest {
    PurchaseBrokeragePolicy purchaseBrokeragePolicy;
    RentBrokeragePolicy rentBrokeragePolicy;

    @BeforeEach
    void setup() {
        purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();
        rentBrokeragePolicy = new RentBrokeragePolicy();
    }

    @Test
    void testPurchaseBrokeragePolicy() {
        assertThat(purchaseBrokeragePolicy.calculate(30_000_000L))
                .isEqualTo(180_000L);
        assertThat(purchaseBrokeragePolicy.calculate(100_000_000L))
                .isEqualTo(500_000L);
        assertThat(purchaseBrokeragePolicy.calculate(500_000_000L))
                .isEqualTo(2_000_000L);
        assertThat(purchaseBrokeragePolicy.calculate(800_000_000L))
                .isEqualTo(4_000_000L);
        assertThat(purchaseBrokeragePolicy.calculate(1_000_000_000L))
                .isEqualTo(9_000_000L);
    }

    @Test
    void testRentBrokeragePolicy() {
        assertThat(rentBrokeragePolicy.calculate(30_000_000L))
                .isEqualTo(150_000L);
        assertThat(rentBrokeragePolicy.calculate(100_000_000L))
                .isEqualTo(300_000L);
        assertThat(rentBrokeragePolicy.calculate(500_000_000L))
                .isEqualTo(2_000_000L);
        assertThat(rentBrokeragePolicy.calculate(800_000_000L))
                .isEqualTo(6_400_000L);
        assertThat(rentBrokeragePolicy.calculate(1_000_000_000L))
                .isEqualTo(8_000_000L);
    }
}