package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CommentThreadListResponse;
import org.openapitools.api.DependencyUtil;
import org.openapitools.model.SearchListResponse;
import org.openapitools.model.VideoListResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "com.us.idl.javaidl.JavaMSF4JServerIDLCodegen", date = "2021-08-24T20:53:09.375587900+02:00[Europe/Paris]")
public abstract class YoutubeApiService {
    public abstract Response youtubeCommentThreadsList(List<String> part
 ,String allThreadsRelatedToChannelId
 ,String channelId
 ,List<String> id
 ,Integer maxResults
 ,String moderationStatus
 ,String order
 ,String pageToken
 ,String searchTerms
 ,String textFormat
 ,String videoId
 ) throws NotFoundException;
    public abstract Response youtubeSearchList(List<String> part
 ,String channelId
 ,String channelType
 ,String eventType
 ,Boolean forContentOwner
 ,Boolean forDeveloper
 ,Boolean forMine
 ,String location
 ,String locationRadius
 ,Integer maxResults
 ,String onBehalfOfContentOwner
 ,String order
 ,String pageToken
 ,String publishedAfter
 ,String publishedBefore
 ,String q
 ,String regionCode
 ,String relatedToVideoId
 ,String relevanceLanguage
 ,String safeSearch
 ,String topicId
 ,List<String> type
 ,String videoCaption
 ,String videoCategoryId
 ,String videoDefinition
 ,String videoDimension
 ,String videoDuration
 ,String videoEmbeddable
 ,String videoLicense
 ,String videoSyndicated
 ,String videoType
 ) throws NotFoundException;
    public abstract Response youtubeVideosList(List<String> part
 ,String chart
 ,String hl
 ,List<String> id
 ,String locale
 ,Integer maxHeight
 ,Integer maxResults
 ,Integer maxWidth
 ,String myRating
 ,String onBehalfOfContentOwner
 ,String pageToken
 ,String regionCode
 ,String videoCategoryId
 ) throws NotFoundException;
}
