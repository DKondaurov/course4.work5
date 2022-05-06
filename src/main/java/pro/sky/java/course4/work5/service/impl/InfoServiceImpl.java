package pro.sky.java.course4.work5.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.sky.java.course4.work5.service.InfoService;

@Service
@Profile("production")
public class InfoServiceImpl implements InfoService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getPort() {
        return port;
    }
}
