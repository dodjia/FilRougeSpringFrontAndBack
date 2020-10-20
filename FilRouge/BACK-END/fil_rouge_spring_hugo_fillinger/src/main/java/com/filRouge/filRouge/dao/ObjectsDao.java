package com.filRouge.filRouge.dao;
import com.filRouge.filRouge.objects.ObjectGeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ObjectsDao extends JpaRepository<ObjectGeo, Integer> {
}
