# coding: utf-8

from typing import Dict, List  # noqa: F401

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
    HTTPException,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.dependency_util import *
from openapi_server.models.search_list_response import SearchListResponse
from openapi_server.security_api import get_token_Oauth2c, get_token_Oauth2

router = APIRouter()


@router.get(
    "/youtube/v3/search",
    responses={
        200: {"model": SearchListResponse, "description": "Successful response"},
        400: {"description": "400"},
        403: {"description": "403"},
        404: {"description": "404"},
    },
    tags=["search"],
)
async def youtube_search_list(
    part: List[str] = Query(None, description="The *part* parameter specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet."),
    channel_id: str = Query(None, description="Filter on resources belonging to this channelId."),
    channel_type: str = Query(None, description="Add a filter on the channel search."),
    event_type: str = Query(None, description="Filter on the livestream status of the videos."),
    for_content_owner: bool = Query(None, description="Search owned by a content owner."),
    for_developer: bool = Query(None, description="Restrict the search to only retrieve videos uploaded using the project id of the authenticated user."),
    for_mine: bool = Query(None, description="Search for the private videos of the authenticated user."),
    location: str = Query(None, description="Filter on location of the video"),
    location_radius: str = Query(None, description="Filter on distance from the location (specified above)."),
    max_results: int = Query(None, description="The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.", ge=0, le=50),
    on_behalf_of_content_owner: str = Query(None, description="*Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request&#39;s authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."),
    order: str = Query(None, description="Sort order of the results."),
    page_token: str = Query(None, description="The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved."),
    published_after: str = Query(None, description="Filter on resources published after this date."),
    published_before: str = Query(None, description="Filter on resources published before this date."),
    q: str = Query(None, description="Textual search terms to match."),
    region_code: str = Query(None, description="Display the content as seen by viewers in this country."),
    related_to_video_id: str = Query(None, description="Search related to a resource."),
    relevance_language: str = Query(None, description="Return results relevant to this language."),
    safe_search: str = Query(None, description="Indicates whether the search results should include restricted content as well as standard content."),
    topic_id: str = Query(None, description="Restrict results to a particular topic."),
    type: List[str] = Query(None, description="Restrict results to a particular set of resource types from One Platform."),
    video_caption: str = Query(None, description="Filter on the presence of captions on the videos."),
    video_category_id: str = Query(None, description="Filter on videos in a specific category."),
    video_definition: str = Query(None, description="Filter on the definition of the videos."),
    video_dimension: str = Query(None, description="Filter on 3d videos."),
    video_duration: str = Query(None, description="Filter on the duration of the videos."),
    video_embeddable: str = Query(None, description="Filter on embeddable videos."),
    video_license: str = Query(None, description="Filter on the license of the videos."),
    video_syndicated: str = Query(None, description="Filter on syndicated videos."),
    video_type: str = Query(None, description="Filter on videos of a specific type."),
    token_Oauth2: TokenModel = Security(
        get_token_Oauth2, scopes=[]
    ),
    token_Oauth2c: TokenModel = Security(
        get_token_Oauth2c, scopes=[]
    ),
) -> SearchListResponse:
    """Retrieves a list of search resources"""
    ...
    
    # Check dependency: ZeroOrOne(forContentOwner, forDeveloper, forMine, relatedToVideoId);
    if do_not_satisfy_zero_or_one_dependency((for_content_owner is not None),(for_developer is not None),(for_mine is not None),(related_to_video_id is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(forContentOwner, forDeveloper, forMine, relatedToVideoId);")
    
    # Check dependency: IF forContentOwner==true THEN onBehalfOfContentOwner AND type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);
    if not (not (for_content_owner is not None and for_content_owner) or (on_behalf_of_content_owner is not None) and (type is not None and type and ("video" in type)) and not ((video_definition is not None) or (video_dimension is not None) or (video_duration is not None) or (video_license is not None) or (video_embeddable is not None) or (video_syndicated is not None) or (video_type is not None))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF forContentOwner==true THEN onBehalfOfContentOwner AND type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);")
    
    # Check dependency: IF forMine==true THEN type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);
    if not (not (for_mine is not None and for_mine) or (type is not None and type and ("video" in type)) and not ((video_definition is not None) or (video_dimension is not None) or (video_duration is not None) or (video_license is not None) or (video_embeddable is not None) or (video_syndicated is not None) or (video_type is not None))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF forMine==true THEN type=='video' AND NOT (videoDefinition OR videoDimension OR videoDuration OR videoLicense OR videoEmbeddable OR videoSyndicated OR videoType);")
    
    # Check dependency: IF relatedToVideoId THEN type=='video' AND NOT (channelId OR channelType OR eventType OR location OR locationRadius OR onBehalfOfContentOwner OR order OR publishedAfter OR publishedBefore OR q OR topicId OR videoCaption OR videoCategoryId OR videoDefinition OR videoDimension OR videoDuration OR videoEmbeddable OR videoLicense OR videoSyndicated OR videoType);
    if not (not (related_to_video_id is not None) or (type is not None and type and ("video" in type)) and not ((channel_id is not None) or (channel_type is not None) or (event_type is not None) or (location is not None) or (location_radius is not None) or (on_behalf_of_content_owner is not None) or (order is not None) or (published_after is not None) or (published_before is not None) or (q is not None) or (topic_id is not None) or (video_caption is not None) or (video_category_id is not None) or (video_definition is not None) or (video_dimension is not None) or (video_duration is not None) or (video_embeddable is not None) or (video_license is not None) or (video_syndicated is not None) or (video_type is not None))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF relatedToVideoId THEN type=='video' AND NOT (channelId OR channelType OR eventType OR location OR locationRadius OR onBehalfOfContentOwner OR order OR publishedAfter OR publishedBefore OR q OR topicId OR videoCaption OR videoCategoryId OR videoDefinition OR videoDimension OR videoDuration OR videoEmbeddable OR videoLicense OR videoSyndicated OR videoType);")
    
    # Check dependency: IF eventType THEN type=='video';
    if not (not (event_type is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF eventType THEN type=='video';")
    
    # Check dependency: AllOrNone(location, locationRadius);
    if do_not_satisfy_all_or_none_dependency((location is not None),(location_radius is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: AllOrNone(location, locationRadius);")
    
    # Check dependency: IF videoCaption THEN type=='video';
    if not (not (video_caption is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoCaption THEN type=='video';")
    
    # Check dependency: IF videoCategoryId THEN type=='video';
    if not (not (video_category_id is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoCategoryId THEN type=='video';")
    
    # Check dependency: IF videoDefinition THEN type=='video';
    if not (not (video_definition is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoDefinition THEN type=='video';")
    
    # Check dependency: IF videoDimension THEN type=='video';
    if not (not (video_dimension is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoDimension THEN type=='video';")
    
    # Check dependency: IF videoDuration THEN type=='video';
    if not (not (video_duration is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoDuration THEN type=='video';")
    
    # Check dependency: IF videoEmbeddable THEN type=='video';
    if not (not (video_embeddable is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoEmbeddable THEN type=='video';")
    
    # Check dependency: IF videoLicense THEN type=='video';
    if not (not (video_license is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoLicense THEN type=='video';")
    
    # Check dependency: IF videoSyndicated THEN type=='video';
    if not (not (video_syndicated is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoSyndicated THEN type=='video';")
    
    # Check dependency: IF videoType THEN type=='video';
    if not (not (video_type is not None) or (type is not None and type and ("video" in type))):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoType THEN type=='video';")
    
