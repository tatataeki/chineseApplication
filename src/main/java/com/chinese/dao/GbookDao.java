package com.chinese.dao;

import com.chinese.bean.Gbook;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GbookDao {
    @Select("select * from noncore_books where parbook_name = '首页'")
    public List<Gbook> getRootBooks();

    @Select("select * from noncore_books where parbook_name = #{name}")
    public List<Gbook> getGBooksByParName(String name);

    @Select("select * from noncore_books where `book_name` = #{bookName}")
    public List<Gbook> getGbookEntityByName(String bookName);
}
