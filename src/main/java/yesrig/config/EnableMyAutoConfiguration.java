package yesrig.config;

import org.springframework.context.annotation.Import;
import yesrig.config.autoconfig.DispatcherServletConfig;
import yesrig.config.autoconfig.TomcatWevServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({DispatcherServletConfig.class, TomcatWevServerConfig.class})
public @interface EnableMyAutoConfiguration {
}
