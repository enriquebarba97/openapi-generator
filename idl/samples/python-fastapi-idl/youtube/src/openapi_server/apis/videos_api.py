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
from openapi_server.models.video_list_response import VideoListResponse
from openapi_server.security_api import get_token_Oauth2c, get_token_Oauth2

router = APIRouter()


@router.get(
    "/youtube/v3/videos",
    responses={
        200: {"model": VideoListResponse, "description": "Successful response"},
        400: {"description": "400"},
        403: {"description": "403"},
        404: {"description": "404"},
    },
    tags=["videos"],
)
async def youtube_videos_list(
    part: List[str] = Query(None, description="The *part* parameter specifies a comma-separated list of one or more video resource properties that the API response will include. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set *part&#x3D;snippet*, the API response will contain all of those properties."),
    chart: str = Query(None, description="Return the videos that are in the specified chart."),
    hl: str = Query(None, description="Stands for \&quot;host language\&quot;. Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX)."),
    id: List[str] = Query(None, description="Return videos with the given ids."),
    locale: str = Query(None, description=""),
    max_height: int = Query(None, description="", ge=72, le=8192),
    max_results: int = Query(None, description="The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter.", ge=1, le=50),
    max_width: int = Query(None, description="Return the player with maximum height specified in", ge=72, le=8192),
    my_rating: str = Query(None, description="Return videos liked/disliked by the authenticated user. Does not support RateType.RATED_TYPE_NONE."),
    on_behalf_of_content_owner: str = Query(None, description="*Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request&#39;s authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner."),
    page_token: str = Query(None, description="The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved. *Note:* This parameter is supported for use in conjunction with the myRating and chart parameters, but it is not supported for use in conjunction with the id parameter."),
    region_code: str = Query(None, description="Use a chart that is specific to the specified region"),
    video_category_id: str = Query(None, description="Use chart that is specific to the specified video category"),
    token_Oauth2: TokenModel = Security(
        get_token_Oauth2, scopes=[]
    ),
    token_Oauth2c: TokenModel = Security(
        get_token_Oauth2c, scopes=[]
    ),
) -> VideoListResponse:
    """Retrieves a list of resources, possibly filtered."""
    ...
    
    # Check dependency: OnlyOne(chart, id, myRating);
    if do_not_satisfy_only_one_dependency((chart is not None),(id is not None and id),(my_rating is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: OnlyOne(chart, id, myRating);")
    
    # Check dependency: ZeroOrOne(maxResults, id);
    if do_not_satisfy_zero_or_one_dependency((max_results is not None),(id is not None and id)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(maxResults, id);")
    
    # Check dependency: ZeroOrOne(pageToken, id);
    if do_not_satisfy_zero_or_one_dependency((page_token is not None),(id is not None and id)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(pageToken, id);")
    
    # Check dependency: IF regionCode THEN chart;
    if not (not (region_code is not None) or (chart is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF regionCode THEN chart;")
    
    # Check dependency: IF videoCategoryId THEN chart;
    if not (not (video_category_id is not None) or (chart is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: IF videoCategoryId THEN chart;")
    
