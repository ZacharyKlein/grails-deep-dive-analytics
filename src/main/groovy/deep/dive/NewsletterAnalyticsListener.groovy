package deep.dive

import groovy.util.logging.Slf4j
import io.micronaut.configuration.rabbitmq.annotation.Queue
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener

@Slf4j
@RabbitListener
class NewsletterAnalyticsListener {

    @Queue("analytics")
    void receiveAnalytics(String email) {
        println "Recieved analytics message for [$email]"
    }

}
