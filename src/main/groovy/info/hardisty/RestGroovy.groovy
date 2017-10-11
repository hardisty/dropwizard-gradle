package info.hardisty;

import info.hardisty.health.RestGroovyHealthCheck;
import info.hardisty.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment

class RestGroovy extends Application<RestGroovyConfiguration> {


    static void main(String[] args) throws Exception {
        System.out.println("waka wooooops");
        System.out.println("args = " + Arrays.toString(args));
        new RestGroovy().run(["server"]);
        //new RestGroovy().run(args);
    }

    @Override
    void run(RestGroovyConfiguration configuration, Environment environment) throws Exception {
        registerResources(environment);
        registerHealthChecks(environment);
        System.out.println("waka waka");
    }

    private void registerResources(Environment environment) {
        environment.jersey().register(HelloWorldResource.class);
    }

    private void registerHealthChecks(Environment environment) {
        environment.healthChecks().register("restGroovy", new RestGroovyHealthCheck());
    }
}
