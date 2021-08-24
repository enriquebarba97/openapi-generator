# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.dependency_util import *  # noqa: F401
from openapi_server.models.video_list_response import VideoListResponse  # noqa: F401


def test_youtube_videos_list(client: TestClient):
    """Test case for youtube_videos_list

    
    """
    params = [("part", ['part_example']),     ("chart", 'chart_example'),     ("hl", 'hl_example'),     ("id", ['id_example']),     ("locale", 'locale_example'),     ("max_height", 56),     ("max_results", 56),     ("max_width", 56),     ("my_rating", 'my_rating_example'),     ("on_behalf_of_content_owner", 'on_behalf_of_content_owner_example'),     ("page_token", 'page_token_example'),     ("region_code", 'region_code_example'),     ("video_category_id", 'video_category_id_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/youtube/v3/videos",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

