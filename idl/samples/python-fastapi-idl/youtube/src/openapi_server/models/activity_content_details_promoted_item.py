# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class ActivityContentDetailsPromotedItem(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ActivityContentDetailsPromotedItem - a model defined in OpenAPI

        ad_tag: The ad_tag of this ActivityContentDetailsPromotedItem [Optional].
        click_tracking_url: The click_tracking_url of this ActivityContentDetailsPromotedItem [Optional].
        creative_view_url: The creative_view_url of this ActivityContentDetailsPromotedItem [Optional].
        cta_type: The cta_type of this ActivityContentDetailsPromotedItem [Optional].
        custom_cta_button_text: The custom_cta_button_text of this ActivityContentDetailsPromotedItem [Optional].
        description_text: The description_text of this ActivityContentDetailsPromotedItem [Optional].
        destination_url: The destination_url of this ActivityContentDetailsPromotedItem [Optional].
        forecasting_url: The forecasting_url of this ActivityContentDetailsPromotedItem [Optional].
        impression_url: The impression_url of this ActivityContentDetailsPromotedItem [Optional].
        video_id: The video_id of this ActivityContentDetailsPromotedItem [Optional].
    """

    ad_tag: Optional[str] = None
    click_tracking_url: Optional[str] = None
    creative_view_url: Optional[str] = None
    cta_type: Optional[str] = None
    custom_cta_button_text: Optional[str] = None
    description_text: Optional[str] = None
    destination_url: Optional[str] = None
    forecasting_url: Optional[List[str]] = None
    impression_url: Optional[List[str]] = None
    video_id: Optional[str] = None

ActivityContentDetailsPromotedItem.update_forward_refs()
