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
from openapi_server.models.comment_thread_list_response import CommentThreadListResponse
from openapi_server.dependency_util import *
from openapi_server.security_api import get_token_Oauth2c, get_token_Oauth2

router = APIRouter()


@router.get(
    "/youtube/v3/commentThreads",
    responses={
        200: {"model": CommentThreadListResponse, "description": "Successful response"},
        400: {"description": "400"},
        403: {"description": "403"},
        404: {"description": "404"},
    },
    tags=["commentThreads"],
)
async def youtube_comment_threads_list(
    part: List[str] = Query(None, description="The *part* parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include."),
    all_threads_related_to_channel_id: str = Query(None, description="Returns the comment threads of all videos of the channel and the channel comments as well."),
    channel_id: str = Query(None, description="Returns the comment threads for all the channel comments (ie does not include comments left on videos)."),
    id: List[str] = Query(None, description="Returns the comment threads with the given IDs for Stubby or Apiary."),
    max_results: int = Query(None, description="The *maxResults* parameter specifies the maximum number of items that should be returned in the result set.", ge=1, le=100),
    moderation_status: str = Query(None, description="Limits the returned comment threads to those with the specified moderation status. Not compatible with the &#39;id&#39; filter. Valid values: published, heldForReview, likelySpam."),
    order: str = Query(None, description=""),
    page_token: str = Query(None, description="The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved."),
    search_terms: str = Query(None, description="Limits the returned comment threads to those matching the specified key words. Not compatible with the &#39;id&#39; filter."),
    text_format: str = Query(None, description="The requested text format for the returned comments."),
    video_id: str = Query(None, description="Returns the comment threads of the specified video."),
    token_Oauth2: TokenModel = Security(
        get_token_Oauth2, scopes=["https://www.googleapis.com/auth/youtube.force-ssl"]
    ),
    token_Oauth2c: TokenModel = Security(
        get_token_Oauth2c, scopes=["https://www.googleapis.com/auth/youtube.force-ssl"]
    ),
) -> CommentThreadListResponse:
    """Retrieves a list of resources, possibly filtered."""
    ...
    
    # Check dependency: OnlyOne(allThreadsRelatedToChannelId, channelId, id, videoId);
    if do_not_satisfy_only_one_dependency((all_threads_related_to_channel_id is not None),(channel_id is not None),(id is not None and id),(video_id is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: OnlyOne(allThreadsRelatedToChannelId, channelId, id, videoId);")
    
    # Check dependency: ZeroOrOne(id, maxResults);
    if do_not_satisfy_zero_or_one_dependency((id is not None and id),(max_results is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(id, maxResults);")
    
    # Check dependency: ZeroOrOne(id, moderationStatus);
    if do_not_satisfy_zero_or_one_dependency((id is not None and id),(moderation_status is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(id, moderationStatus);")
    
    # Check dependency: ZeroOrOne(id, order);
    if do_not_satisfy_zero_or_one_dependency((id is not None and id),(order is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(id, order);")
    
    # Check dependency: ZeroOrOne(id, pageToken);
    if do_not_satisfy_zero_or_one_dependency((id is not None and id),(page_token is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(id, pageToken);")
    
    # Check dependency: ZeroOrOne(id, searchTerms);
    if do_not_satisfy_zero_or_one_dependency((id is not None and id),(search_terms is not None)):
      raise HTTPException(status_code=400, detail="Dependency not satisfied: ZeroOrOne(id, searchTerms);")
    
