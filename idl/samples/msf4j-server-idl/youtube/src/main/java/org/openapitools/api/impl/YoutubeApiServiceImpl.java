package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.CommentThreadListResponse;
import org.openapitools.api.DependencyUtil;
import org.openapitools.model.SearchListResponse;
import org.openapitools.model.VideoListResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public class YoutubeApiServiceImpl extends YoutubeApiService {
    @Override
    public Response youtubeCommentThreadsList(List<String> part
, String allThreadsRelatedToChannelId
, String channelId
, List<String> id
, Integer maxResults
, String moderationStatus
, String order
, String pageToken
, String searchTerms
, String textFormat
, String videoId
 ) throws NotFoundException {
        // Check dependency: OnlyOne(allThreadsRelatedToChannelId, channelId, id, videoId);
        if(DependencyUtil.doNotSatisfyOnlyOneDependency((allThreadsRelatedToChannelId != null),(channelId != null),(id != null && !id.isEmpty()),(videoId != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(id, maxResults);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((id != null && !id.isEmpty()),(maxResults != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(id, moderationStatus);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((id != null && !id.isEmpty()),(moderationStatus != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(id, order);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((id != null && !id.isEmpty()),(order != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(id, pageToken);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((id != null && !id.isEmpty()),(pageToken != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(id, searchTerms);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((id != null && !id.isEmpty()),(searchTerms != null))){
            return Response.status(400).build();
        }
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response youtubeSearchList(List<String> part
, String channelId
, String channelType
, String eventType
, Boolean forContentOwner
, Boolean forDeveloper
, Boolean forMine
, String location
, String locationRadius
, Integer maxResults
, String onBehalfOfContentOwner
, String order
, String pageToken
, String publishedAfter
, String publishedBefore
, String q
, String regionCode
, String relatedToVideoId
, String relevanceLanguage
, String safeSearch
, String topicId
, List<String> type
, String videoCaption
, String videoCategoryId
, String videoDefinition
, String videoDimension
, String videoDuration
, String videoEmbeddable
, String videoLicense
, String videoSyndicated
, String videoType
 ) throws NotFoundException {
        // Check dependency: ZeroOrOne(forContentOwner, forDeveloper, forMine, relatedToVideoId);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((forContentOwner != null),(forDeveloper != null),(forMine != null),(relatedToVideoId != null))){
            return Response.status(400).build();
        }
        // Check dependency: IF forContentOwner==true THEN onBehalfOfContentOwner AND type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);
        if(!(!(forContentOwner != null && forContentOwner) || (onBehalfOfContentOwner != null) && (type != null && !type.isEmpty() && (type.contains("video"))) && !((videoDefinition != null) || (videoDimension != null) || (videoDuration != null) || (videoLicense != null) || (videoEmbeddable != null) || (videoSyndicated != null) || (videoType != null)))){
            return Response.status(400).build();
        }
        // Check dependency: IF forMine==true THEN type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);
        if(!(!(forMine != null && forMine) || (type != null && !type.isEmpty() && (type.contains("video"))) && !((videoDefinition != null) || (videoDimension != null) || (videoDuration != null) || (videoLicense != null) || (videoEmbeddable != null) || (videoSyndicated != null) || (videoType != null)))){
            return Response.status(400).build();
        }
        // Check dependency: IF relatedToVideoId THEN type=='video' AND NOT (channelId OR channelType OR eventType OR location OR locationRadius OR onBehalfOfContentOwner OR order OR publishedAfter OR publishedBefore OR q OR topicId OR videoCaption OR videoCategoryId OR videoDefinition OR videoDimension OR videoDuration OR videoEmbeddable OR videoLicense OR videoSyndicated OR videoType);
        if(!(!(relatedToVideoId != null) || (type != null && !type.isEmpty() && (type.contains("video"))) && !((channelId != null) || (channelType != null) || (eventType != null) || (location != null) || (locationRadius != null) || (onBehalfOfContentOwner != null) || (order != null) || (publishedAfter != null) || (publishedBefore != null) || (q != null) || (topicId != null) || (videoCaption != null) || (videoCategoryId != null) || (videoDefinition != null) || (videoDimension != null) || (videoDuration != null) || (videoEmbeddable != null) || (videoLicense != null) || (videoSyndicated != null) || (videoType != null)))){
            return Response.status(400).build();
        }
        // Check dependency: IF eventType THEN type=='video';
        if(!(!(eventType != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: AllOrNone(location, locationRadius);
        if(DependencyUtil.doNotSatisfyAllOrNoneDependency((location != null),(locationRadius != null))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoCaption THEN type=='video';
        if(!(!(videoCaption != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoCategoryId THEN type=='video';
        if(!(!(videoCategoryId != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoDefinition THEN type=='video';
        if(!(!(videoDefinition != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoDimension THEN type=='video';
        if(!(!(videoDimension != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoDuration THEN type=='video';
        if(!(!(videoDuration != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoEmbeddable THEN type=='video';
        if(!(!(videoEmbeddable != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoLicense THEN type=='video';
        if(!(!(videoLicense != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoSyndicated THEN type=='video';
        if(!(!(videoSyndicated != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoType THEN type=='video';
        if(!(!(videoType != null) || (type != null && !type.isEmpty() && (type.contains("video"))))){
            return Response.status(400).build();
        }
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response youtubeVideosList(List<String> part
, String chart
, String hl
, List<String> id
, String locale
, Integer maxHeight
, Integer maxResults
, Integer maxWidth
, String myRating
, String onBehalfOfContentOwner
, String pageToken
, String regionCode
, String videoCategoryId
 ) throws NotFoundException {
        // Check dependency: OnlyOne(chart, id, myRating);
        if(DependencyUtil.doNotSatisfyOnlyOneDependency((chart != null),(id != null && !id.isEmpty()),(myRating != null))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(maxResults, id);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((maxResults != null),(id != null && !id.isEmpty()))){
            return Response.status(400).build();
        }
        // Check dependency: ZeroOrOne(pageToken, id);
        if(DependencyUtil.doNotSatisfyZeroOrOneDependency((pageToken != null),(id != null && !id.isEmpty()))){
            return Response.status(400).build();
        }
        // Check dependency: IF regionCode THEN chart;
        if(!(!(regionCode != null) || (chart != null))){
            return Response.status(400).build();
        }
        // Check dependency: IF videoCategoryId THEN chart;
        if(!(!(videoCategoryId != null) || (chart != null))){
            return Response.status(400).build();
        }
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
