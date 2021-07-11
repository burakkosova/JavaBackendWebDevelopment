package dev.patika;

import java.util.Calendar;
import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance() {
        this.setName("Kasko");
        this.setPrice(145);
        this.setStartDate(new Date());
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.YEAR,2);
        this.setEndDate(c.getTime());
    }

    @Override
    public void calculate() {
        this.setPrice(this.getPrice() * 1.2);
    }
}
