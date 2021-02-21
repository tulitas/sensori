package sensori.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sensori.repositories.MetricsRepository;

@Controller
@RequestMapping("/")
public class OptionsController {
    private MetricsRepository metricsRepository;

    @GetMapping(value = "/metrics")
    private String getAllMetrics() {
        System.out.println("blin");
        System.out.println(metricsRepository.findAll());
        return "/";
    }
}
