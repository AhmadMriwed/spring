package com.example.demo2.repository;


import com.example.demo2.model.entity.File;
import com.example.demo2.model.entity.ReportFile;
import com.example.demo2.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReportFileRepository extends JpaRepository<ReportFile,Integer> {

    Optional<List<ReportFile>> findAllByUserAndFile(User user, File file);
    Optional<List<ReportFile>> findAllByFile( File file);
    Optional<List<ReportFile>> findAllByFileOrderByCreatedAtDesc (File file);
    Optional<ReportFile> findFirstByFile(File file);
    Optional<ReportFile> findFirstByFileAndUpdatedAt(File file, Date date);
    Optional<ReportFile> findFirstByFileOrderByCreatedAtDesc(File file);
}
