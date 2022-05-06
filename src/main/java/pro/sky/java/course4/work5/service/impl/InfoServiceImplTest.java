package pro.sky.java.course4.work5.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pro.sky.java.course4.work5.service.InfoService;

@Service
@Profile("!production")
public class InfoServiceImplTest implements InfoService {
    @Override
    public String getPort() {
        String port = "Test";
        return port;
    }
}
