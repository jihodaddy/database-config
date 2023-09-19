package com.example.mybatis.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    /**
     * 메소드 설명 : selectList
     * @param <E>
     * @param statementSqlId
     * @param obj
     * @return
     */
    public <E> List<E> selectList(String statementSqlId , Object obj)   {
        return sqlSession.selectList(statementSqlId, obj);
    }

    /**
     * 메소드 설명 : selectList
     * @param <E>
     * @param statementSqlId
     * @return
     */
    public <E> List<E> selectList(String statementSqlId )   {
        return sqlSession.selectList(statementSqlId);
    }

    /**
     * 메소드 설명 : selectOne
     * @param <T>
     * @param statementSqlId
     * @param obj
     * @return
     */
    public <T> T selectOne(String statementSqlId ,Object obj)   {
        return sqlSession.selectOne(statementSqlId, obj);
    }

    /**
     * 메소드 설명 : selectOne
     * @param <T>
     * @param statementSqlId
     * @return
     */
    public <T> T selectOne(String statementSqlId)   {
        return sqlSession.selectOne(statementSqlId);
    }

    /**
     * 메소드 설명 : insert
     * @param statementSqlId
     * @param obj
     * @return
     */
    public int insert(String statementSqlId ,Object obj) {
        return sqlSession.insert(statementSqlId, obj);
    }

    /**
     * 메소드 설명 : insert
     * @param statementSqlId
     * @return
     */
    public int insert(String statementSqlId ) {
        return sqlSession.insert(statementSqlId);
    }

    /**
     * 메소드 설명 : update
     * @param statementSqlId
     * @param obj
     * @return
     */
    public int update(String statementSqlId ,Object obj) {
        return sqlSession.update(statementSqlId, obj);
    }

    /**
     * 메소드 설명 : update
     * @param statementSqlId
     * @return
     */
    public int update(String statementSqlId ) {
        return sqlSession.update(statementSqlId);
    }

    /**
     * 메소드 설명 : delete
     * @param statementSqlId
     * @param obj
     * @return
     */
    public int delete(String statementSqlId ,Object obj) {
        return sqlSession.delete(statementSqlId, obj);
    }

    /**
     * 메소드 설명 : delete
     * @param statementSqlId
     * @return
     */
    public int delete(String statementSqlId ) {
        return sqlSession.delete(statementSqlId);
    }

    /**
     * 메소드 설명 : batchInsert
     * @param statement
     * @param list
     * @return
     */
    public int batchInsert(String statement, List<?> list){
        int count = -1;
        for (int i = 0; i < list.size(); i++) {
            count = count + insert(statement, list.get(i));
        }
        return count;
    }

    /**
     * 메소드 설명 : batchUpdate
     * @param statement
     * @param list
     * @return
     */
    public int batchUpdate(String statement, List<?> list){
        int count = -1;
        for (int i = 0; i < list.size(); i++) {
            count = count + update(statement, list.get(i));
        }
        return count;
    }

    /**
     * 메소드 설명 : batchDelete
     * @param statement
     * @param list
     * @return
     */
    public int batchDelete(String statement, List<?> list){
        int count = -1;
        for (int i = 0; i < list.size(); i++) {
            count = count + delete(statement, list.get(i));
        }
        return count;
    }
}
