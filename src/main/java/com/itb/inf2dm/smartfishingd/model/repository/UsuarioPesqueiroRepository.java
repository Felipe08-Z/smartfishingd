package com.itb.inf2dm.smartfishingd.model.repository;
import com.itb.inf2dm.smartfishingd.model.entity.UsuarioPesqueiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioPesqueiroRepository extends JpaRepository<UsuarioPesqueiro, Long> {
}
