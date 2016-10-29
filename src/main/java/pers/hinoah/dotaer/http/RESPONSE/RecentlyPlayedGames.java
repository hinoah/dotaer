package pers.hinoah.dotaer.http.response;

import lombok.Data;

import java.util.List;

/**
 * @auther he_fangzhou@navercorp.com
 * @date 16/10/29 上午11:21
 */
@Data
public class RecentlyPlayedGames {

    private Integer totalCount;
    private List<Game> games;

    @Data
    static class Game {

        private String appId;
        private String name;
        private Integer playtime2weeks;
        private Integer playtimeForever;
        private String imgIconUrl;
        private String imgLogoUrl;
    }
}
