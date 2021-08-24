# coding: utf-8

from typing import List

from fastapi import Depends, Security  # noqa: F401
from fastapi.openapi.models import OAuthFlowImplicit, OAuthFlows  # noqa: F401
from fastapi.security import (  # noqa: F401
    HTTPAuthorizationCredentials,
    HTTPBasic,
    HTTPBasicCredentials,
    HTTPBearer,
    OAuth2,
    OAuth2AuthorizationCodeBearer,
    OAuth2PasswordBearer,
    SecurityScopes,
)
from fastapi.security.api_key import APIKeyCookie, APIKeyHeader, APIKeyQuery  # noqa: F401

from openapi_server.models.extra_models import TokenModel

oauth2_implicit = OAuth2(
    flows=OAuthFlows(
        implicit=OAuthFlowImplicit(
            authorizationUrl="https://accounts.google.com/o/oauth2/auth",
            scopes={
                "https://www.googleapis.com/auth/youtube": "Manage your YouTube account",
                "https://www.googleapis.com/auth/youtube.channel-memberships.creator": "See a list of your current active channel members, their current level, and when they became a member",
                "https://www.googleapis.com/auth/youtube.force-ssl": "See, edit, and permanently delete your YouTube videos, ratings, comments and captions",
                "https://www.googleapis.com/auth/youtube.readonly": "View your YouTube account",
                "https://www.googleapis.com/auth/youtube.upload": "Manage your YouTube videos",
                "https://www.googleapis.com/auth/youtubepartner": "View and manage your assets and associated content on YouTube",
                "https://www.googleapis.com/auth/youtubepartner-channel-audit": "View private information of your YouTube channel relevant during the audit process with a YouTube partner",
            }
        )
    )
)


def get_token_Oauth2(
    security_scopes: SecurityScopes, token: str = Depends(oauth2_implicit)
) -> TokenModel:
    """
    Validate and decode token.

    :param token Token provided by Authorization header
    :type token: str
    :return: Decoded token information or None if token is invalid
    :rtype: TokenModel | None
    """

    ...


def validate_scope_Oauth2(
    required_scopes: SecurityScopes, token_scopes: List[str]
) -> bool:
    """
    Validate required scopes are included in token scope

    :param required_scopes Required scope to access called API
    :type required_scopes: List[str]
    :param token_scopes Scope present in token
    :type token_scopes: List[str]
    :return: True if access to called API is allowed
    :rtype: bool
    """

    return False

oauth2_code = OAuth2AuthorizationCodeBearer(
    authorizationUrl="https://accounts.google.com/o/oauth2/auth",
    tokenUrl="https://accounts.google.com/o/oauth2/token",
    refreshUrl="",
    scopes={
        "https://www.googleapis.com/auth/youtube": "Manage your YouTube account",
        "https://www.googleapis.com/auth/youtube.channel-memberships.creator": "See a list of your current active channel members, their current level, and when they became a member",
        "https://www.googleapis.com/auth/youtube.force-ssl": "See, edit, and permanently delete your YouTube videos, ratings, comments and captions",
        "https://www.googleapis.com/auth/youtube.readonly": "View your YouTube account",
        "https://www.googleapis.com/auth/youtube.upload": "Manage your YouTube videos",
        "https://www.googleapis.com/auth/youtubepartner": "View and manage your assets and associated content on YouTube",
        "https://www.googleapis.com/auth/youtubepartner-channel-audit": "View private information of your YouTube channel relevant during the audit process with a YouTube partner",
    }
)


def get_token_Oauth2c(
    security_scopes: SecurityScopes, token: str = Depends(oauth2_code)
) -> TokenModel:
    """
    Validate and decode token.

    :param token Token provided by Authorization header
    :type token: str
    :return: Decoded token information or None if token is invalid
    :rtype: TokenModel | None
    """

    ...


def validate_scope_Oauth2c(
    required_scopes: SecurityScopes, token_scopes: List[str]
) -> bool:
    """
    Validate required scopes are included in token scope

    :param required_scopes Required scope to access called API
    :type required_scopes: List[str]
    :param token_scopes Scope present in token
    :type token_scopes: List[str]
    :return: True if access to called API is allowed
    :rtype: bool
    """

    return False

