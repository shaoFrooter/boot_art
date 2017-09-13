package boot.art.service;

import boot.art.dao.GooglerDao;
import boot.art.model.Googler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shaofeng on 2017/9/12.
 */
@Service
public class GooglerService {

    @Autowired
    private GooglerDao googlerDao;

    public Googler createGooglerDao(){
        return googlerDao.createGooger();
    }
}
