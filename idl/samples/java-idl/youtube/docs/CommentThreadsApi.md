# CommentThreadsApi

All URIs are relative to *https://youtube.googleapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**youtubeCommentThreadsList**](CommentThreadsApi.md#youtubeCommentThreadsList) | **GET** /youtube/v3/commentThreads | 


<a name="youtubeCommentThreadsList"></a>
# **youtubeCommentThreadsList**
> CommentThreadListResponse youtubeCommentThreadsList(part, allThreadsRelatedToChannelId, channelId, id, maxResults, moderationStatus, order, pageToken, searchTerms, textFormat, videoId)



Retrieves a list of resources, possibly filtered.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentThreadsApi;

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

    CommentThreadsApi apiInstance = new CommentThreadsApi(defaultClient);
    List<String> part = Arrays.asList(); // List<String> | The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
    String allThreadsRelatedToChannelId = "allThreadsRelatedToChannelId_example"; // String | Returns the comment threads of all videos of the channel and the channel comments as well.
    String channelId = "channelId_example"; // String | Returns the comment threads for all the channel comments (ie does not include comments left on videos).
    List<String> id = Arrays.asList(); // List<String> | Returns the comment threads with the given IDs for Stubby or Apiary.
    Integer maxResults = 56; // Integer | The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.
    String moderationStatus = "moderationStatus_example"; // String | Limits the returned comment threads to those with the specified moderation status. Not compatible with the 'id' filter. Valid values: published, heldForReview, likelySpam.
    String order = "order_example"; // String | 
    String pageToken = "pageToken_example"; // String | The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    String searchTerms = "searchTerms_example"; // String | Limits the returned comment threads to those matching the specified key words. Not compatible with the 'id' filter.
    String textFormat = "textFormat_example"; // String | The requested text format for the returned comments.
    String videoId = "videoId_example"; // String | Returns the comment threads of the specified video.
    try {
      CommentThreadListResponse result = apiInstance.youtubeCommentThreadsList(part, allThreadsRelatedToChannelId, channelId, id, maxResults, moderationStatus, order, pageToken, searchTerms, textFormat, videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentThreadsApi#youtubeCommentThreadsList");
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
 **part** | [**List&lt;String&gt;**](String.md)| The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include. |
 **allThreadsRelatedToChannelId** | **String**| Returns the comment threads of all videos of the channel and the channel comments as well. | [optional]
 **channelId** | **String**| Returns the comment threads for all the channel comments (ie does not include comments left on videos). | [optional]
 **id** | [**List&lt;String&gt;**](String.md)| Returns the comment threads with the given IDs for Stubby or Apiary. | [optional]
 **maxResults** | **Integer**| The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. | [optional]
 **moderationStatus** | **String**| Limits the returned comment threads to those with the specified moderation status. Not compatible with the &#39;id&#39; filter. Valid values: published, heldForReview, likelySpam. | [optional] [enum: published, heldForReview, likelySpam, rejected]
 **order** | **String**|  | [optional] [enum: orderUnspecified, time, relevance]
 **pageToken** | **String**| The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. | [optional]
 **searchTerms** | **String**| Limits the returned comment threads to those matching the specified key words. Not compatible with the &#39;id&#39; filter. | [optional]
 **textFormat** | **String**| The requested text format for the returned comments. | [optional] [enum: textFormatUnspecified, html, plainText]
 **videoId** | **String**| Returns the comment threads of the specified video. | [optional]

### Return type

[**CommentThreadListResponse**](CommentThreadListResponse.md)

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

