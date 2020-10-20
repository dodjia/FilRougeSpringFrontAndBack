package com.filRouge.filRouge.dao;

import com.filRouge.filRouge.objects.Composition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositionDao extends JpaRepository<Composition, Integer> {
}
