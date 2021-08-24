# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.subscription_content_details import SubscriptionContentDetails
from openapi_server.models.subscription_snippet import SubscriptionSnippet
from openapi_server.models.subscription_subscriber_snippet import SubscriptionSubscriberSnippet


class Subscription(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    Subscription - a model defined in OpenAPI

        content_details: The content_details of this Subscription [Optional].
        etag: The etag of this Subscription [Optional].
        id: The id of this Subscription [Optional].
        kind: The kind of this Subscription [Optional].
        snippet: The snippet of this Subscription [Optional].
        subscriber_snippet: The subscriber_snippet of this Subscription [Optional].
    """

    content_details: Optional[SubscriptionContentDetails] = None
    etag: Optional[str] = None
    id: Optional[str] = None
    kind: Optional[str] = None
    snippet: Optional[SubscriptionSnippet] = None
    subscriber_snippet: Optional[SubscriptionSubscriberSnippet] = None

Subscription.update_forward_refs()
