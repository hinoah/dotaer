import com.google.common.collect.Maps;
import org.junit.Test;
import pers.hinoah.dotaer.steamservice.IPlayerService;
import pers.hinoah.dotaer.steamservice.impl.IPlayerServiceImpl;
import pers.hinoah.dotaer.support.util.JSONUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther he_fangzhou@navercorp.com
 * @date 16/10/29 上午11:31
 */

public class APICallerTest {

    public static final String TEST_STEAMID = "76561198098375287";

    @Test
    public void apiCallerTest() {

    }

    @Test
    public void iPlayerServiceTest() {
        IPlayerService iPlayerService = new IPlayerServiceImpl();
        String result = iPlayerService.getRecentlyPlayedGames(TEST_STEAMID);
        Map<String, Object> map = Maps.newHashMap();
        map = JSONUtil.toObject(result, HashMap.class);
        System.out.println(map.toString());
    }
}
