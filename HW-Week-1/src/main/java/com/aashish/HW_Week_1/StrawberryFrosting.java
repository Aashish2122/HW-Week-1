package com.aashish.HW_Week_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting",havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }


}
