# VideosApi

All URIs are relative to *https://youtube.googleapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**youtubeVideosList**](VideosApi.md#youtubeVideosList) | **GET** /youtube/v3/videos | 


<a name="youtubeVideosList"></a>
# **youtubeVideosList**
> VideoListResponse youtubeVideosList(part, chart, hl, id, locale, maxHeight, maxResults, maxWidth, myRating, onBehalfOfContentOwner, pageToken, regionCode, videoCategoryId)



Retrieves a list of resources, possibly filtered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://youtube.googleapis.com");
    
    // Configure OAuth2 access token for authorization: Oauth2
    OAuth Oauth2 = (OAuth) defaultClient.getAuthentication("Oauth2");
    Oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: Oauth2c
    OAuth Oauth2c = (OAuth) defaultClient.getAuthentication("Oauth2c");
    Oauth2c.setAccessToken("YOUR ACCESS TOKEN");

    VideosApi apiInstance = new VideosApi(defaultClient);
    List<String> part = Arrays.asList(); // List<String> | The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part=snippet*, the API response will contain all of those properties.
    String chart = "chart_example"; // String | Return the videos that are in the specified chart.
    String hl = "hl_example"; // String | Stands for \"host language\". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    List<String> id = Arrays.asList(); // List<String> | Return videos with the given ids.
    String locale = "locale_example"; // String | 
    Integer maxHeight = 56; // Integer | 
    Integer maxResults = 56; // Integer | The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    Integer maxWidth = 56; // Integer | Return the player with maximum height specified in
    String myRating = "myRating_example"; // String | Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE.
    String onBehalfOfContentOwner = "onBehalfOfContentOwner_example"; // String | *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    String pageToken = "pageToken_example"; // String | The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.
    String regionCode = "regionCode_example"; // String | Use a chart that is specific to the specified region
    String videoCategoryId = "videoCategoryId_example"; // String | Use chart that is specific to the specified video category
    try {
      VideoListResponse result = apiInstance.youtubeVideosList(part, chart, hl, id, locale, maxHeight, maxResults, maxWidth, myRating, onBehalfOfContentOwner, pageToken, regionCode, videoCategoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#youtubeVideosList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **part** | [**List&lt;String&gt;**](String.md)| The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part&#x3D;snippet*, the API response will contain all of those properties. |
 **chart** | **String**| Return the videos that are in the specified chart. | [optional] [enum: chartUnspecified, mostPopular]
 **hl** | **String**| Stands for \&quot;host language\&quot;. Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX). | [optional]
 **id** | [**List&lt;String&gt;**](String.md)| Return videos with the given ids. | [optional]
 **locale** | **String**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **maxResults** | **Integer**| The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter. | [optional]
 **maxWidth** | **Integer**| Return the player with maximum height specified in | [optional]
 **myRating** | **String**| Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE. | [optional] [enum: none, like, dislike]
 **onBehalfOfContentOwner** | **String**| *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request&#39;s authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner. | [optional]
 **pageToken** | **String**| The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter. | [optional]
 **regionCode** | **String**| Use a chart that is specific to the specified region | [optional]
 **videoCategoryId** | **String**| Use chart that is specific to the specified video category | [optional]

### Return type

[**VideoListResponse**](VideoListResponse.md)

### Authorization

[Oauth2](../README.md#Oauth2), [Oauth2c](../README.md#Oauth2c)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | 400 |  -  |
**403** | 403 |  -  |
**404** | 404 |  -  |

