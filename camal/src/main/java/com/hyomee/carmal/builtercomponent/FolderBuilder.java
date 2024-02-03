 package com.hyomee.carmal.builtercomponent;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FolderBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C://Project//folder/source")
        .to("file:C://Project//folder/target");
        
    }
    
}
