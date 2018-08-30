package com.udacity.ramshasaeed.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;


    /** An endpoint class we are exposing */
    @Api(
            name = "jokeApi",
            version = "v1",
            namespace = @ApiNamespace(
                    ownerDomain = "backend.ramshasaeed.udacity.com",
                    ownerName = "backend.ramshasaeed.udacity.com",
                    packagePath = ""
            )
    )
    public class MyEndpoint {

        /** A simple endpoint method that takes a name and says Hi back */
        @ApiMethod(name = "sayHi")
        public MyJoke sayHi(@Named("name") String name) {
            MyJoke response = new MyJoke();
            response.setMyData("Hi, " + name);

            return response;
        }
        @ApiMethod(name = "tellJoke")
        public MyJoke tellJoke(){
            MyJoke response = new MyJoke();
            com.udacity.ramshasaeed.joketellerlib.MyJoke joker = new com.udacity.ramshasaeed.joketellerlib.MyJoke();
            response.setMyData(joker.tellJoke());
            return response;
        }

    }
