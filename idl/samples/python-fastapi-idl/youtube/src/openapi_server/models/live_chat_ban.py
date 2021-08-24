# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.live_chat_ban_snippet import LiveChatBanSnippet


class LiveChatBan(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    LiveChatBan - a model defined in OpenAPI

        etag: The etag of this LiveChatBan [Optional].
        id: The id of this LiveChatBan [Optional].
        kind: The kind of this LiveChatBan [Optional].
        snippet: The snippet of this LiveChatBan [Optional].
    """

    etag: Optional[str] = None
    id: Optional[str] = None
    kind: Optional[str] = None
    snippet: Optional[LiveChatBanSnippet] = None

LiveChatBan.update_forward_refs()
