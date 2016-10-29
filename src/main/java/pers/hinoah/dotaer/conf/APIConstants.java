package pers.hinoah.dotaer.conf;

import org.springframework.web.util.UriComponentsBuilder;

/**
 * @auther hinoah
 * @date 16/10/28 下午7:35
 */
public class APIConstants {

    public static final String STEAM_API_KEY = "28389971F0B398CCB9CE0F932A329D42";

    public static final String GET_RECENTLY_PLAYED_GAMES = "http://api.steampowered.com/IPlayerService/GetRecentlyPlayedGames/v1";

    public static UriComponentsBuilder getRecentlyPlayedGamesURL() {
        return UriComponentsBuilder.fromHttpUrl(GET_RECENTLY_PLAYED_GAMES).queryParam(ParamConstants.KEY, STEAM_API_KEY);
    }
}
