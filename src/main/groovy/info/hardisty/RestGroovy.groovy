package info.hardisty

import info.hardisty.health.RestGroovyHealthCheck
import info.hardisty.resource.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Environment

class RestGroovy extends Application<RestGroovyConfiguration> {

    static void main(String[] args) throws Exception {
        new RestGroovy().run(['server'])
    }

    @Override
    void run(RestGroovyConfiguration configuration, Environment environment) throws Exception {
        registerResources(environment)
        registerHealthChecks(environment)
    }

    private void registerResources(Environment environment) {
        environment.jersey().register(HelloWorldResource)
    }

    private void registerHealthChecks(Environment environment) {
        environment.healthChecks().register('restGroovy', new RestGroovyHealthCheck())
    }
}
