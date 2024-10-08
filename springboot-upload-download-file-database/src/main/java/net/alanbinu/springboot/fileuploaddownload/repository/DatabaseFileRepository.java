package net.alanbinu.springboot.fileuploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.alanbinu.springboot.fileuploaddownload.model.DatabaseFile;

import java.util.Optional;

@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {
    Optional<DatabaseFile> findByFileName(String fileName);

}