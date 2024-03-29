package com.chinese.service;

import com.chinese.bean.Author;
import com.chinese.bean.DynastyCount;
import com.chinese.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    public Map<String, String> getAll(){
        Map<String, String> map = new HashMap<>();
        map.put("daoOriginals", "adsa");
        return map;
    }

    @Override
    public int getAllAuthorNum(){
        int authorNum;
        authorNum = authorDao.getAuthorCount();
        return authorNum;
    }

    @Override
    public int getAuthorSumByDynasty(String dynasty){
        int authorSum;
        authorSum = authorDao.getAuthorCountByDynasty(dynasty);
        return authorSum;
    }

    @Override
    public List<Author> getAuthorList() {
        List<Author> authorList = authorDao.getAuthorListAll();
        List<Author> authorListNew = new ArrayList();
        for(int i=0;i<authorList.size();i++){
            String url = authorList.get(i).getAuthor_pic();
            if(!url.contains(".")){
                authorList.get(i).setAuthor_pic("/img/placeholder.jpeg");
                continue;
            }
            url = url.replace("\\", "/");
            String newUrl = url.split("data")[1];
            authorList.get(i).setAuthor_pic("/img" + newUrl);
        }
        return authorList;
    }

    @Override
    public List<Author> getAuthorSlice(Map map){
        List<Author> authorSlice = authorDao.getAuthorSliceByPage(map);
        for(int i=0;i<authorSlice.size();i++){
            String url = authorSlice.get(i).getAuthor_pic();
            if(!url.contains(".")){
                authorSlice.get(i).setAuthor_pic("/img/placeholder.jpeg");
                continue;
            }
            url = url.replace("\\", "/");
            String newUrl = url.split("data")[1];
            authorSlice.get(i).setAuthor_pic("/img" + newUrl);
        }
        return authorSlice;
    }

    @Override
    public List<Author> getAuthorSliceWithDynasty(Map map){
        List<Author> authorSlice = authorDao.getAuthorSliceByPageAndDynasty(map);
        for(int i=0;i<authorSlice.size();i++){
            String url = authorSlice.get(i).getAuthor_pic();
            if(!url.contains(".")){
                authorSlice.get(i).setAuthor_pic("/img/placeholder.jpeg");
                continue;
            }
            url = url.replace("\\", "/");
            String newUrl = url.split("data")[1];
            authorSlice.get(i).setAuthor_pic("/img" + newUrl);
        }
        return authorSlice;
    }

    @Override
    public List<DynastyCount> getDynastyCount(){
        List<DynastyCount> res = authorDao.getCountByDynasty();
        return res;
    }
}
