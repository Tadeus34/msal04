package com.urbanisationsi.microservicesassure.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component    
@ConfigurationProperties("urbanisationsi.clairprev") 
public class ApplicationPropertiesConfiguration {
     private int limiteNombreAssure;

    public int getLimiteNombreAssure() {
        return limiteNombreAssure;
    }

    public void setLimiteNombreAssure(int limiteNombreAssure) {
        this.limiteNombreAssure = limiteNombreAssure;
    }
}
