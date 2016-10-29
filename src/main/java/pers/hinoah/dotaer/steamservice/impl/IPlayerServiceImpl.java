package pers.hinoah.dotaer.steamservice.impl;

import pers.hinoah.dotaer.conf.APIConstants;
import pers.hinoah.dotaer.conf.ParamConstants;
import pers.hinoah.dotaer.http.APICaller;
import pers.hinoah.dotaer.steamservice.IPlayerService;

/**
 * @auther hinoah
 * @date 16/10/29 下午12:18
 */
public class IPlayerServiceImpl implements IPlayerService {

    @Override
    public String getRecentlyPlayedGames(String steamid) {
        String url = APIConstants.getRecentlyPlayedGamesURL()
                        .queryParam(ParamConstants.STEAMID, steamid)
                        .toUriString();
        return APICaller.newInstance().get(url).getBody();
    }

}
