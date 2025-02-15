package com.example.kakao.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderJPARepository extends JpaRepository<Order, Integer> {


    @Query ("select o from Order o join fetch o.user where o.id = :id and o.user.id = :userId")
    Order findByIdAndUserId(@Param("id")int id, @Param("userId")int userId);
}
