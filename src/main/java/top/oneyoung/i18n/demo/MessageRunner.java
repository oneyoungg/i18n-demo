package top.oneyoung.i18n.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import top.oneyoung.i18n.ErrorMessage;

import java.util.Locale;

/**
 * MessageRunner
 *
 * @author oneyoung
 * @since 2021/5/31 15:43
 */
@Component
public class MessageRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(MessageRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.error(ErrorMessage.of("ONEYOUNG-EXCEPTION").getMessage());
        log.error(ErrorMessage.of(Locale.US,"ONEYOUNG-EXCEPTION").getMessage());
    }
}
