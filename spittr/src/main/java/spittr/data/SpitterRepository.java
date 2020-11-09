package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spitter;

@Repository
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
