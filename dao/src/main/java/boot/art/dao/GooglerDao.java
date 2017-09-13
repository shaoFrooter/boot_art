package boot.art.dao;

import boot.art.model.Googler;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.Instant;

/**
 * Created by shaofeng on 2017/9/12.
 */
@Repository
public class GooglerDao {

    public Googler createGooger(){
        Googler gler=new Googler();
        gler.setStartDate(Date.from(Instant.now()));
        gler.setEndDate(Date.from(Instant.now().minusSeconds(1000)));
        return gler;
    }
}
