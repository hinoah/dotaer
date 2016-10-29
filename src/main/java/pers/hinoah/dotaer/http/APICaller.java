package pers.hinoah.dotaer.http;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @auther hinoah
 * @date 16/10/29 上午11:18
 */
@AllArgsConstructor
public class APICaller {

    private RestTemplate restTemplate;

    public static APICaller newInstance() {
        return new APICaller(new RestTemplate());
    }

    public ResponseEntity<String> get(String url, HttpEntity<Object> entity) {
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }

    public ResponseEntity<String> get(String url) {
        return restTemplate.exchange(url, HttpMethod.GET, null, String.class);
    }

}
