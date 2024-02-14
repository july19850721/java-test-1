package org.example.src.YeWuDaiBiaoMoShi;

public class BusinessDelegate {
    private final BusinessLookUp lookupService = new BusinessLookUp();
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        BusinessService businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
