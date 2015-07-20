package net.mashrur.learning.javaee.rest;


import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rs")
public class ApplicationConfig extends Application {

    private final Set<Class<?>> classes;

    public ApplicationConfig(){

        HashSet<Class<?>> c= new HashSet<Class<?>>();

        c.add(BookRestService.class);

        classes = Collections.unmodifiableSet(c);

    }
    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
