package com.example.slm_pruefung_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SlmPruefung2Application {

    public static void main(String[] args) {
        SpringApplication.run(SlmPruefung2Application.class, args);
    }

	@RequestMapping("api/info")
    public String info(){
        return "This API converts 24h time into AM/PM time";
    }
    @RequestMapping("api/time")
    public String time(@RequestParam int h) {
        String a;
        if (h <= 12) {
            return h + " AM";
        } else {
            h = h - 12;
            return h + " PM";
        }
    }
}

