package com.smartdelta;

import com.smartdeltasystems.SmartDeltaSystemsApplication;
import org.springframework.boot.SpringApplication;

public class TestSmartDeltaApplication {

    public static void main(String[] args) {
        SpringApplication.from(SmartDeltaSystemsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
