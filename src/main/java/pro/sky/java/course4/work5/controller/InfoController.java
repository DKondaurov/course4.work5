package pro.sky.java.course4.work5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course4.work5.service.InfoService;

@RestController
public class InfoController {

    private final InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }


    @GetMapping("/getPort")
    public String getPort() {
        return infoService.getPort();
    }

}
