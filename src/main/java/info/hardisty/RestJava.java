package info.hardisty;

import info.hardisty.health.RestJavaHealthCheck;
import info.hardisty.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class RestJava extends Application<RestJavaConfiguration> {


    public static void main(String[] args) throws Exception {
        System.out.println("waka wooooops");
        new RestJava().run(args);
    }

    @Override
    public void run(RestJavaConfiguration configuration, Environment environment) throws Exception {
        registerResources(environment);
        registerHealthChecks(environment);
        System.out.println("waka waka");
    }

    private void registerResources(Environment environment) {
        environment.jersey().register(HelloWorldResource.class);
    }

    private void registerHealthChecks(Environment environment) {
        environment.healthChecks().register("restjava", new RestJavaHealthCheck());
    }
}
