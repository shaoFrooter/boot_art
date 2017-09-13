package boot.art;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by shaofeng on 2017/9/12.
 */
@SpringBootApplication
@MapperScan("boot.art.dao")
public class BootArtApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootArtApplication.class,args);
    }
}
