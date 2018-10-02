package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    /*@ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }
    @ApiMethod(name = "tellJoke")
    public MyBean sayHi(@Named("joke") String name) {
        MyBean response = new MyBean();
        response.setData("Welcome, Ramsha" + name);

        return response;
    }*/
    @ApiMethod(name = "tellJoke")
    public MyJoke tellJoke(){
        MyJoke response = new MyJoke();
        com.udacity.ramshasaeed.joketellerlib.MyJoke joker = new com.udacity.ramshasaeed.joketellerlib.MyJoke();
        response.setMyData(joker.tellJoke());
        return response;
    }

}
