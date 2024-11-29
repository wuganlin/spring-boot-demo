package org.example.demoautotable;

import com.tangzc.autotable.springboot.EnableAutoTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoTable
@SpringBootApplication
public class DemoAutotableApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAutotableApplication.class, args);
    }

}
