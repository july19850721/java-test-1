package org.example.src.YeWuDaiBiaoMoShi;

public class Client1 {

    BusinessDelegate businessService;

    public Client1(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
