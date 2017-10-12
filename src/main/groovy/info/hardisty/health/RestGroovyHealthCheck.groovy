package info.hardisty.health

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

class RestGroovyHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy()
    }
}
