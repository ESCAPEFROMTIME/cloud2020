package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @create 2022- 03-04-10:23
 */

@Configuration
public class MyselfRule {


    @Bean
    public IRule myRule(){

        return new RandomRule();

    }


}
