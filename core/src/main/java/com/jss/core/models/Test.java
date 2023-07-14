package com.jss.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class)
public class Test {

    @ValueMapValue

    @Default(values = "shubham")
    private String name;

    public String getName() {
        return name;
    }

}
