package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.YoutubeApiService;
import org.openapitools.api.factories.YoutubeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CommentThreadListResponse;
import org.openapitools.api.DependencyUtil;
import org.openapitools.model.SearchListResponse;
import org.openapitools.model.VideoListResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/youtube/v3")


@io.swagger.annotations.Api(description = "the youtube API")
@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class YoutubeApi  {
   private final YoutubeApiService delegate = YoutubeApiServiceFactory.getYoutubeApi();

    @GET
    @Path("/commentThreads")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieves a list of resources, possibly filtered.", response = CommentThreadListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "Oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "https://www.googleapis.com/auth/youtube.force-ssl", description = "See, edit, and permanently delete your YouTube videos, ratings, comments and captions")
        }),
        @io.swagger.annotations.Authorization(value = "Oauth2c", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "https://www.googleapis.com/auth/youtube.force-ssl", description = "See, edit, and permanently delete your YouTube videos, ratings, comments and captions")
        })
    }, tags={ "commentThreads", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = CommentThreadListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "400", response = CommentThreadListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "403", response = CommentThreadListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "404", response = CommentThreadListResponse.class) })
    public Response youtubeCommentThreadsList(@ApiParam(value = "The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.",required=true) @QueryParam("part") List<String> part
,@ApiParam(value = "Returns the comment threads of all videos of the channel and the channel comments as well.") @QueryParam("allThreadsRelatedToChannelId") String allThreadsRelatedToChannelId
,@ApiParam(value = "Returns the comment threads for all the channel comments (ie does not include comments left on videos).") @QueryParam("channelId") String channelId
,@ApiParam(value = "Returns the comment threads with the given IDs for Stubby or Apiary.") @QueryParam("id") List<String> id
,@ApiParam(value = "The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.") @QueryParam("maxResults") Integer maxResults
,@ApiParam(value = "Limits the returned comment threads to those with the specified moderation status. Not compatible with the 'id' filter. Valid values: published, heldForReview, likelySpam.", allowableValues="published, heldForReview, likelySpam, rejected") @QueryParam("moderationStatus") String moderationStatus
,@ApiParam(value = "", allowableValues="orderUnspecified, time, relevance") @QueryParam("order") String order
,@ApiParam(value = "The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.") @QueryParam("pageToken") String pageToken
,@ApiParam(value = "Limits the returned comment threads to those matching the specified key words. Not compatible with the 'id' filter.") @QueryParam("searchTerms") String searchTerms
,@ApiParam(value = "The requested text format for the returned comments.", allowableValues="textFormatUnspecified, html, plainText") @QueryParam("textFormat") String textFormat
,@ApiParam(value = "Returns the comment threads of the specified video.") @QueryParam("videoId") String videoId
)
    throws NotFoundException {
        return delegate.youtubeCommentThreadsList(part,allThreadsRelatedToChannelId,channelId,id,maxResults,moderationStatus,order,pageToken,searchTerms,textFormat,videoId);
    }
    @GET
    @Path("/search")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieves a list of search resources", response = SearchListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "Oauth2", scopes = {
            
        }),
        @io.swagger.annotations.Authorization(value = "Oauth2c", scopes = {
            
        })
    }, tags={ "search", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = SearchListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "400", response = SearchListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "403", response = SearchListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "404", response = SearchListResponse.class) })
    public Response youtubeSearchList(@ApiParam(value = "The *part* parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet.",required=true) @QueryParam("part") List<String> part
,@ApiParam(value = "Filter on resources belonging to this channelId.") @QueryParam("channelId") String channelId
,@ApiParam(value = "Add a filter on the channel search.", allowableValues="channelTypeUnspecified, any, show") @QueryParam("channelType") String channelType
,@ApiParam(value = "Filter on the livestream status of the videos.", allowableValues="none, upcoming, live, completed") @QueryParam("eventType") String eventType
,@ApiParam(value = "Search owned by a content owner.") @QueryParam("forContentOwner") Boolean forContentOwner
,@ApiParam(value = "Restrict the search to only retrieve videos uploaded using the project id of the authenticated user.") @QueryParam("forDeveloper") Boolean forDeveloper
,@ApiParam(value = "Search for the private videos of the authenticated user.") @QueryParam("forMine") Boolean forMine
,@ApiParam(value = "Filter on location of the video") @QueryParam("location") String location
,@ApiParam(value = "Filter on distance from the location (specified above).") @QueryParam("locationRadius") String locationRadius
,@ApiParam(value = "The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.") @QueryParam("maxResults") Integer maxResults
,@ApiParam(value = "*Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.") @QueryParam("onBehalfOfContentOwner") String onBehalfOfContentOwner
,@ApiParam(value = "Sort order of the results.", allowableValues="searchSortUnspecified, date, rating, viewCount, relevance, title, videoCount") @QueryParam("order") String order
,@ApiParam(value = "The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.") @QueryParam("pageToken") String pageToken
,@ApiParam(value = "Filter on resources published after this date.") @QueryParam("publishedAfter") String publishedAfter
,@ApiParam(value = "Filter on resources published before this date.") @QueryParam("publishedBefore") String publishedBefore
,@ApiParam(value = "Textual search terms to match.") @QueryParam("q") String q
,@ApiParam(value = "Display the content as seen by viewers in this country.") @QueryParam("regionCode") String regionCode
,@ApiParam(value = "Search related to a resource.") @QueryParam("relatedToVideoId") String relatedToVideoId
,@ApiParam(value = "Return results relevant to this language.") @QueryParam("relevanceLanguage") String relevanceLanguage
,@ApiParam(value = "Indicates whether the search results should include restricted content as well as standard content.", allowableValues="safeSearchSettingUnspecified, none, moderate, strict") @QueryParam("safeSearch") String safeSearch
,@ApiParam(value = "Restrict results to a particular topic.") @QueryParam("topicId") String topicId
,@ApiParam(value = "Restrict results to a particular set of resource types from One Platform.") @QueryParam("type") List<String> type
,@ApiParam(value = "Filter on the presence of captions on the videos.", allowableValues="videoCaptionUnspecified, any, closedCaption, none") @QueryParam("videoCaption") String videoCaption
,@ApiParam(value = "Filter on videos in a specific category.") @QueryParam("videoCategoryId") String videoCategoryId
,@ApiParam(value = "Filter on the definition of the videos.", allowableValues="any, standard, high") @QueryParam("videoDefinition") String videoDefinition
,@ApiParam(value = "Filter on 3d videos.", allowableValues="any, 2d, 3d") @QueryParam("videoDimension") String videoDimension
,@ApiParam(value = "Filter on the duration of the videos.", allowableValues="videoDurationUnspecified, any, short, medium, long") @QueryParam("videoDuration") String videoDuration
,@ApiParam(value = "Filter on embeddable videos.", allowableValues="videoEmbeddableUnspecified, any, true") @QueryParam("videoEmbeddable") String videoEmbeddable
,@ApiParam(value = "Filter on the license of the videos.", allowableValues="any, youtube, creativeCommon") @QueryParam("videoLicense") String videoLicense
,@ApiParam(value = "Filter on syndicated videos.", allowableValues="videoSyndicatedUnspecified, any, true") @QueryParam("videoSyndicated") String videoSyndicated
,@ApiParam(value = "Filter on videos of a specific type.", allowableValues="videoTypeUnspecified, any, movie, episode") @QueryParam("videoType") String videoType
)
    throws NotFoundException {
        return delegate.youtubeSearchList(part,channelId,channelType,eventType,forContentOwner,forDeveloper,forMine,location,locationRadius,maxResults,onBehalfOfContentOwner,order,pageToken,publishedAfter,publishedBefore,q,regionCode,relatedToVideoId,relevanceLanguage,safeSearch,topicId,type,videoCaption,videoCategoryId,videoDefinition,videoDimension,videoDuration,videoEmbeddable,videoLicense,videoSyndicated,videoType);
    }
    @GET
    @Path("/videos")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieves a list of resources, possibly filtered.", response = VideoListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "Oauth2", scopes = {
            
        }),
        @io.swagger.annotations.Authorization(value = "Oauth2c", scopes = {
            
        })
    }, tags={ "videos", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = VideoListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "400", response = VideoListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "403", response = VideoListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "404", response = VideoListResponse.class) })
    public Response youtubeVideosList(@ApiParam(value = "The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part=snippet*, the API response will contain all of those properties.",required=true) @QueryParam("part") List<String> part
,@ApiParam(value = "Return the videos that are in the specified chart.", allowableValues="chartUnspecified, mostPopular") @QueryParam("chart") String chart
,@ApiParam(value = "Stands for \"host language\". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).") @QueryParam("hl") String hl
,@ApiParam(value = "Return videos with the given ids.") @QueryParam("id") List<String> id
,@ApiParam(value = "") @QueryParam("locale") String locale
,@ApiParam(value = "") @QueryParam("maxHeight") Integer maxHeight
,@ApiParam(value = "The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.") @QueryParam("maxResults") Integer maxResults
,@ApiParam(value = "Return the player with maximum height specified in") @QueryParam("maxWidth") Integer maxWidth
,@ApiParam(value = "Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE.", allowableValues="none, like, dislike") @QueryParam("myRating") String myRating
,@ApiParam(value = "*Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.") @QueryParam("onBehalfOfContentOwner") String onBehalfOfContentOwner
,@ApiParam(value = "The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.") @QueryParam("pageToken") String pageToken
,@ApiParam(value = "Use a chart that is specific to the specified region") @QueryParam("regionCode") String regionCode
,@ApiParam(value = "Use chart that is specific to the specified video category") @QueryParam("videoCategoryId") String videoCategoryId
)
    throws NotFoundException {
        return delegate.youtubeVideosList(part,chart,hl,id,locale,maxHeight,maxResults,maxWidth,myRating,onBehalfOfContentOwner,pageToken,regionCode,videoCategoryId);
    }
}
