# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class ThirdPartyLinkStatus(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ThirdPartyLinkStatus - a model defined in OpenAPI

        link_status: The link_status of this ThirdPartyLinkStatus [Optional].
    """

    link_status: Optional[str] = None

ThirdPartyLinkStatus.update_forward_refs()
