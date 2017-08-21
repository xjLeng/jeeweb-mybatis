package cn.ileng.modules.task.task;


import cn.ileng.core.utils.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TaskTest {
    public final Logger log = Logger.getLogger(this.getClass());

    public void run() {
        for (int i = 0; i < 10; i++) {
            log.info(i + " run......................................" + (DateUtils.getDateTime()));
        }

    }

    public void run1() {
        for (int i = 0; i < 10; i++) {
            log.info(i + " run1......................................" + (DateUtils.getDateTime()));
        }
    }
}
