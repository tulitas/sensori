package sensori.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sensori.models.Metrics;
import sensori.repositories.MetricsRepository;
import sensori.repositories.SensorsRepository;

@Controller
@RequestMapping("/")
public class OptionsController {
    private MetricsRepository metricsRepository;
    private SensorsRepository sensorsRepository;
    private Metrics metrics;
    @GetMapping(value = "/metrics")
    private String getAllMetrics() {
        System.out.println("blin");
        metrics.getMetric_name();
//        System.out.println(metricsServices.findAll());
//        System.out.println(sensorsRepository.findAll());
//        System.out.println(metricsRepository.findAll());
        return "/";
    }
}
