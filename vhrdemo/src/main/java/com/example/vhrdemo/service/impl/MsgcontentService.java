package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IMsgcontentDao;
import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.service.IHrService;
import com.example.vhrdemo.service.IMsgcontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgcontentService implements IMsgcontentService {
    @Autowired
    private IMsgcontentDao iMsgcontentDao ;

    @Override
    public Msgcontent search(int id) {
        return iMsgcontentDao.search(id);
    }


    @Override
    public Msgcontent insert(int id, String title, String message)  {
        return iMsgcontentDao.insert(id, title, message);
    }

    @Override
    public Msgcontent updateid(int id, String title) {
        return iMsgcontentDao.updateid(id, title);
    }

    @Override
    public Msgcontent updatetitle(int id, String title) {
        return iMsgcontentDao.updateid(id, title);
    }

    @Override
    public Msgcontent delete(int id) {
        return iMsgcontentDao.delete(id);
    }
}
