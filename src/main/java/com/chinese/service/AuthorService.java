package com.chinese.service;

import com.chinese.bean.Author;
import com.chinese.bean.DynastyCount;

import java.util.List;
import java.util.Map;

public interface AuthorService {
    public Map<String, String> getAll();

    public int getAllAuthorNum();

    public int getAuthorSumByDynasty(String dynasty);

    public List<Author> getAuthorList();

    public List<Author> getAuthorSlice(Map map);

    public List<Author> getAuthorSliceWithDynasty(Map map);

    public List<DynastyCount> getDynastyCount();
}
