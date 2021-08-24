# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.dependency_util import *  # noqa: F401
from openapi_server.models.search_list_response import SearchListResponse  # noqa: F401


def test_youtube_search_list(client: TestClient):
    """Test case for youtube_search_list

    
    """
    params = [("part", ['part_example']),     ("channel_id", 'channel_id_example'),     ("channel_type", 'channel_type_example'),     ("event_type", 'event_type_example'),     ("for_content_owner", True),     ("for_developer", True),     ("for_mine", True),     ("location", 'location_example'),     ("location_radius", 'location_radius_example'),     ("max_results", 56),     ("on_behalf_of_content_owner", 'on_behalf_of_content_owner_example'),     ("order", 'order_example'),     ("page_token", 'page_token_example'),     ("published_after", 'published_after_example'),     ("published_before", 'published_before_example'),     ("q", 'q_example'),     ("region_code", 'region_code_example'),     ("related_to_video_id", 'related_to_video_id_example'),     ("relevance_language", 'relevance_language_example'),     ("safe_search", 'safe_search_example'),     ("topic_id", 'topic_id_example'),     ("type", ['type_example']),     ("video_caption", 'video_caption_example'),     ("video_category_id", 'video_category_id_example'),     ("video_definition", 'video_definition_example'),     ("video_dimension", 'video_dimension_example'),     ("video_duration", 'video_duration_example'),     ("video_embeddable", 'video_embeddable_example'),     ("video_license", 'video_license_example'),     ("video_syndicated", 'video_syndicated_example'),     ("video_type", 'video_type_example')]
    headers = {
        "Authorization": "Bearer special-key",
        "Authorization": "Bearer special-key",
    }
    response = client.request(
        "GET",
        "/youtube/v3/search",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

