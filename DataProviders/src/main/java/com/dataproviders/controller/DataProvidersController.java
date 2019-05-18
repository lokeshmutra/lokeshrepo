package com.dataproviders.controller;


import com.dataproviders.model.DataProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataProvidersController {

    @GetMapping({"/dataproviders"})
    public List<DataProvider> home() {
        List<DataProvider> al = new ArrayList<>();
        al.add(new DataProvider("BSNL", 110, 1, 2, "BSNL Basic plan", 9190910101L, "contact@bsnl.com", "/images/bsnl.jpg"));
        al.add(new DataProvider("Airtel", 450, 2, 3, "Airtel Basic plan", 7190450781L, "contact@airtel.com", "/images/airtel.jpg"));
        al.add(new DataProvider("Hathway", 600, 3, 4, "Hathway Basic plan", 9990410171L, "contact@hathway.com", "/images/hathway.jpg"));
        al.add(new DataProvider("BBNL/BNET", 850, 4, 4, "BBNL/BNET Basic plan", 9111910141L, "contact@bbnlbnet.com", "/images/bbnlbnet.jpg"));
        al.add(new DataProvider("ACT Broadband", 600, 5, 3, "ACT Broadband Basic plan", 9191234101L, "contact@act.com", "/images/act.jpg"));
        al.add(new DataProvider("YOU Broadband", 700, 6, 6, "YOU Broadband Basic plan", 8890910101L, "contact@youbroadband.com", "/images/youbroadband.jpg"));
        al.add(new DataProvider("Tikona Digital network", 400, 7, 2, "Tikona Digital network", 8888910101L, "contact@tikona.com", "/images/tikona.jpg"));
        al.add(new DataProvider("Railtel", 1500, 8, 10, "Railtel", 9190944667L, "contact@railtel.com", "/images/railtel.jpg"));
        al.add(new DataProvider("Reliance DSL", 900, 9, 10, "Reliance DSL", 9888910321L, "contact@reliance.com", "/images/reliance.jpg"));

        return al;
    }
}
