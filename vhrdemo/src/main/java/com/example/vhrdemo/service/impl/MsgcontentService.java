package com.example.vhrdemo.service.impl;

import com.example.vhrdemo.dao.IMsgcontentDao;
import com.example.vhrdemo.entity.Joblevel;
import com.example.vhrdemo.entity.Msgcontent;
import com.example.vhrdemo.entity.Role;
import com.example.vhrdemo.service.IHrService;
import com.example.vhrdemo.service.IMsgcontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgcontentService implements IMsgcontentService {
    @Autowired
    private IMsgcontentDao iMsgcontentDao ;

    @Override
    public Msgcontent search(int id) {
        return iMsgcontentDao.search(id);
    }

    @Override
    public List<Msgcontent> findall() {
        return iMsgcontentDao.findall();
    }


    @Override
    public int insert(int id, String title, String message)  {
        return iMsgcontentDao.insert(id, title, message);
    }

    @Override
    public int updateid(int id, String title) {
        return iMsgcontentDao.updateid(id, title);
    }

    @Override
    public int updatetitle(int id, String title) {
        return iMsgcontentDao.updateid(id, title);
    }

    @Override
    public int delete(int id) {
        return iMsgcontentDao.delete(id);
    }
}
