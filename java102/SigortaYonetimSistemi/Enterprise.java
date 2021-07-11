package dev.patika;

import java.util.ArrayList;

public class Enterprise extends Account{

    public Enterprise() {
        this.setAuthentication(AuthenticationStatus.FAIL);
        this.setInsurances(new ArrayList<>());
    }

    public Enterprise(User user) {
        this();
        this.setUser(user);
    }

    @Override
    public void addAddress(String address) {
        AddressManager.addAddress(this.getUser(), new BusinessAddress(address));
    }
}
