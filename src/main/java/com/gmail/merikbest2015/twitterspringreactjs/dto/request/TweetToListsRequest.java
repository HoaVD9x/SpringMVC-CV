package com.gmail.merikbest2015.twitterspringreactjs.dto.request;

import com.gmail.merikbest2015.twitterspringreactjs.dto.response.ListsResponse;
import lombok.Data;

import java.util.List;

@Data
public class TweetToListsRequest {
    private Long tweetId;
    private List<ListsResponse> lists;
}
