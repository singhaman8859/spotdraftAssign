package com.asanaairtableintegration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<org.springframework.scheduling.config.Task, Integer> {

}
