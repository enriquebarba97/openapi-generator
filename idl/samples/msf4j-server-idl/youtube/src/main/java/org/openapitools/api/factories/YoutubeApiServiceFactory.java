package org.openapitools.api.factories;

import org.openapitools.api.YoutubeApiService;
import org.openapitools.api.impl.YoutubeApiServiceImpl;

public class YoutubeApiServiceFactory {
    private static final YoutubeApiService service = new YoutubeApiServiceImpl();

    public static YoutubeApiService getYoutubeApi() {
        return service;
    }
}
