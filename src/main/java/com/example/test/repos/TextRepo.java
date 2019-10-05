package com.example.test.repos;

import com.example.test.domain.Text;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TextRepo {

    @Insert("INSERT INTO text (id, text) VALUES(#{id}, #{text})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public void insert(Text text);

    @Select("SELECT id, text FROM text")
    public List<Text> findAll();

    @Select("SELECT * FROM text WHERE id = #{id}")
    public Text findById(long id);
}
