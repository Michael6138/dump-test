package app.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

@Service
@Slf4j
public class CroneRunner{

    @Scheduled(fixedDelay = 300000)
    public void scheduledTask(){
        log.info("scheduledTask start");
        GenericContainer genericContainer = new GenericContainer(DockerImageName.parse("misha6138/deploy-test"));
        genericContainer.start();
        log.info("sheduledTask process....");
        genericContainer.stop();
        log.info("scheduledTask finish");

    }
}
