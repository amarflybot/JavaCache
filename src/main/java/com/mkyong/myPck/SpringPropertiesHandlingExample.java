package com.mkyong.myPck;

/**
 * Created by amarendra on 26/05/15.
 */
public class SpringPropertiesHandlingExample implements SpringPropertiesHandlingIf {

    private String valueFromConfigurer;
    private String valueFromOverrider;

    public SpringPropertiesHandlingExample()
    {
    }

    public String getValueFromConfigurer()
    {
        return this.valueFromConfigurer;
    }

    public void setValueFromConfigurer(final String valueFromConfigurer)
    {
        this.valueFromConfigurer = valueFromConfigurer;
    }

    public String getValueFromOverrider()
    {
        return this.valueFromOverrider;
    }

    public void setValueFromOverrider(final String valueFromOverrider)
    {
        this.valueFromOverrider = valueFromOverrider;
    }

}
