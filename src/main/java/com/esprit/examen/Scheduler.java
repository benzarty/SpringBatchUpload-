package com.esprit.examen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Scheduler {

    @Autowired
    private BatchLauncher batchLauncher;

    
    /*1. Lancer le batch (traitement de lots de données)
     *  grace au batch runner*/
   
	@Scheduled(cron = "* */1 * * * *")
    public void perform() throws Exception {
        log.info("Batch programmé pour tourner toutes les 1 minute");
        batchLauncher.run();
    }
}
