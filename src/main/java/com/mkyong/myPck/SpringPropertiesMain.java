package com.mkyong.myPck;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amarendra on 26/05/15.
 */
public class SpringPropertiesMain {
    /**
     * Main executable starting Spring Container.
     *
     * @param arguments Command-line arguments; none anticipated.
     */
    public static void main(final String arguments[])
    {
        final ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-properties-example.xml");
        final SpringPropertiesHandlingIf propertiesExample =
                (SpringPropertiesHandlingExample)
                        context.getBean("SpringPropertiesHandlingBean");
        System.err.println(  "Configurer Value: "
                + propertiesExample.getValueFromConfigurer());
        System.err.println(  "Overrider Value: "
                + propertiesExample.getValueFromOverrider());
    }
}
