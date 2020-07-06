package shopide;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopide.config.kafka.KafkaProcessor;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void onEventByString(@Payload String eventString){
        System.out.println(eventString);
    }

}
