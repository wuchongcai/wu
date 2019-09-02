package com.hyxy.dao;

import com.hyxy.entity.Score;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    Score selectByPrimaryKey(Integer id);

    List<Score> selectAll();

    int updateByPrimaryKey(Score record);
    
    List<Score> selectGrade(@Param("studentNumber") int studentNumber,@Param("year") String year, @Param("term") String term,@Param("begin") int begin,@Param("number")int number);
	
	List<Score> selectGradeByTerm(@Param("studentNumber")int studentNumber,@Param("term")String term,@Param("begin") int begin,@Param("number")int number);
	
	List<Score> selectGradeByYear(@Param("studentNumber")int studentNumber,@Param("year")String year,@Param("begin") int begin,@Param("number")int number);
	
	List<Score> selectGradeBy(@Param("studentNumber")int studentNumber,@Param("begin") int begin,@Param("number")int number);
    
    int selectLimit(@Param("studentNumber")int studentNumber);
    
    int selectLimetByTerm(@Param("studentNumber")int studentNumber,@Param("term")String term);
    
    int selectLimetByYear(@Param("studentNumber")int studentNumber,@Param("year")String year);
    
    int selectLimetgrade(@Param("studentNumber") int studentNumber,@Param("year") String year, @Param("term") String term);
    
    
    void updategrade(@Param("grade")int grade,@Param("studentNumber")int studentNumber,@Param("coursenumber")int coursenumber);
    
    
    
    
    
    
    
    
}