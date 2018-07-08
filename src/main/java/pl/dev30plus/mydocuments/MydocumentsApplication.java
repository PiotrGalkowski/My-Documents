package pl.dev30plus.mydocuments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.dev30plus.mydocuments.service.MySearchEngine;
import pl.dev30plus.mydocuments.service.SearchEngine;

@SpringBootApplication
public class MydocumentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydocumentsApplication.class, args);
    }
}
