package com.example.myboot.mapper;

import com.example.myboot.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArticleMapper {
    @Select(value = "select * from articles")
    @Results({@Result(column="article_id",property="articleId"),
            @Result(column="title",property="titile"),
            @Result(column = "category",property = "category")})
    List<Article> getAll();
}
