/**
 * Created by Andrii_Banul on 1/24/2017.
 */
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Users {

    @Autowired
    private RestTemplate restTemplate;

    public User getUserByName(){
        Object quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Object.class);
        User user = new User();
        user.setName("Andrew");
        return user;
    }
}
