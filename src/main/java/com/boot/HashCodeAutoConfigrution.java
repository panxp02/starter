package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author Panxp
 * @date 2019/11/25 20:14
 */
@Configuration  //配置类（相当于spring中application.xml）
// 如果AutoConfigruationProperties中有注解@ConfigurationProperties 那么这个类就
//会被加到spring上下文的容器中，也就是可以通过@Autowire来注入
@EnableConfigurationProperties(HashCodeProperties.class)
@ConditionalOnClass(HashCodeClass.class) //当类路径下有指定类的情况下 才进行下一步
public class HashCodeAutoConfigrution {

    @Autowired
    private HashCodeProperties autoConfigruationProperties;

    @ConditionalOnMissingBean //当spring容器中没有这个Bean的时候才进行下一步
    @Bean
    public HashCodeClass hashCodeClass() {
        return new HashCodeClass(autoConfigruationProperties.getTarget());
    }

}
