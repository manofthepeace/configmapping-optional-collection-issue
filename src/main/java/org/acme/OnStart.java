package org.acme;

import org.jboss.logging.Logger;

import io.quarkus.runtime.Startup;

@Startup
public class OnStart {

    OnStart(Logger log, MyConfig conf) {
        var serversList = conf.servers();
        log.info("ctor done");
    }

}
