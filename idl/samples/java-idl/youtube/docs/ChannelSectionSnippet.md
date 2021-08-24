

# ChannelSectionSnippet

Basic details about a channel section, including title, style and position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelId** | **String** | The ID that YouTube uses to uniquely identify the channel that published the channel section. |  [optional]
**defaultLanguage** | **String** | The language of the channel section&#39;s default title and description. |  [optional]
**localized** | [**ChannelSectionLocalization**](ChannelSectionLocalization.md) |  |  [optional]
**position** | **Integer** | The position of the channel section in the channel. |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | The style of the channel section. |  [optional]
**title** | **String** | The channel section&#39;s title for multiple_playlists and multiple_channels. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the channel section. |  [optional]



## Enum: StyleEnum

Name | Value
---- | -----
CHANNELSECTIONSTYLEUNSPECIFIED | &quot;channelsectionStyleUnspecified&quot;
HORIZONTALROW | &quot;horizontalRow&quot;
VERTICALLIST | &quot;verticalList&quot;



## Enum: TypeEnum

Name | Value
---- | -----
CHANNELSECTIONTYPEUNSPECIFIED | &quot;channelsectionTypeUnspecified&quot;
SINGLEPLAYLIST | &quot;singlePlaylist&quot;
MULTIPLEPLAYLISTS | &quot;multiplePlaylists&quot;
POPULARUPLOADS | &quot;popularUploads&quot;
RECENTUPLOADS | &quot;recentUploads&quot;
LIKES | &quot;likes&quot;
ALLPLAYLISTS | &quot;allPlaylists&quot;
LIKEDPLAYLISTS | &quot;likedPlaylists&quot;
RECENTPOSTS | &quot;recentPosts&quot;
RECENTACTIVITY | &quot;recentActivity&quot;
LIVEEVENTS | &quot;liveEvents&quot;
UPCOMINGEVENTS | &quot;upcomingEvents&quot;
COMPLETEDEVENTS | &quot;completedEvents&quot;
MULTIPLECHANNELS | &quot;multipleChannels&quot;
POSTEDVIDEOS | &quot;postedVideos&quot;
POSTEDPLAYLISTS | &quot;postedPlaylists&quot;
SUBSCRIPTIONS | &quot;subscriptions&quot;



