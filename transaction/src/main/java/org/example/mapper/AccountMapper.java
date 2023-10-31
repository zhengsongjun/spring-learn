package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    @Update("update tb_count1 set money=money+#{money} where name=#{accountName}")
    void incrMoney(@Param("accountName")String accountName,@Param("money") Integer money);
    @Update("update tb_count1 set money=money-#{money} where name=#{accountName}")
    void decrMoney(@Param("accountName")String accountName, @Param("money")Integer money);
}
