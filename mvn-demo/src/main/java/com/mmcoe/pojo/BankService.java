package com.mmcoe.pojo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankService {

    private static final Logger logger =
            LogManager.getLogger(BankService.class);

    public void transferMoney(String from, String to, double amount) {

        logger.info("Transfer started.");

        logger.debug("Sender: {}", from);
        logger.debug("Receiver: {}", to);
        logger.debug("Amount: {}", amount);

        if(amount <= 0) {
            logger.error("Invalid transfer amount.");
            return;
        }

        if(amount > 100000) {
            logger.warn("Large transaction detected.");
        }

        logger.info("Money transferred successfully.");
    }
}
