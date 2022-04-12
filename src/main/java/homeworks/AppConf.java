package homeworks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"homeworks.repository", "homeworks.service"})
public class AppConf {
}
