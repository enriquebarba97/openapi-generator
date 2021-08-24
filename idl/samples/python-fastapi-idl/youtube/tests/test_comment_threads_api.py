# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.comment_thread_list_response import CommentThreadListResponse  # noqa: F401
from openapi_server.dependency_util import *  # noqa: F401


def test_youtube_comment_threads_list(client: TestClient):
    """Test case for youtube_comment_threads_list

    
    """
    params = [("part", ['part_example']),     ("all_threads_related_to_channel_id", 'all_threads_related_to_channel_id_example'),     ("channel_id", 'channel_id_example'),     ("id", ['id_example']),     ("max_results", 56),     ("moderation_status", 'moderation_status_example'),     ("order", 'order_example'),     ("page_token", 'page_token_example'),     ("search_terms", 'search_terms_example'),     ("text_format", 'text_format_example'),     ("video_id", 'video_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/youtube/v3/commentThreads",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

