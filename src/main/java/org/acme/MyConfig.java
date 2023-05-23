package org.acme;

import java.util.List;
import java.util.Optional;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "my")
@StaticInitSafe
public interface MyConfig {

    Optional<List<Server>> servers();

    interface Server {
        String id();

        String name();
    }

}
