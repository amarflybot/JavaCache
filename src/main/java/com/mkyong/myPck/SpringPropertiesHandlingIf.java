package com.mkyong.myPck;

/**
 * Created by amarendra on 26/05/15.
 */
public interface SpringPropertiesHandlingIf {
    String getValueFromConfigurer();

    String getValueFromOverrider();

    void setValueFromConfigurer(final String valueFromConfigurer);

    void setValueFromOverrider(final String valueFromOverrider);
}
