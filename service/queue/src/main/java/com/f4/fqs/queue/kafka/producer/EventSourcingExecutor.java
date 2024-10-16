package com.f4.fqs.queue.kafka.producer;

import com.f4.fqs.commons.domain.message.QueueCommand;
import com.f4.fqs.commons.domain.util.CommonConstraints;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EventSourcingExecutor {

    private final EventProducerService eventProducerService;

    public void createEvent(QueueCommand queueCommand) {
        log.info("send from producer :: {}", queueCommand);
        eventProducerService.send(CommonConstraints.EVENT, queueCommand);
    }

}
