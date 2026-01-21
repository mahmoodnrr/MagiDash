package com.mahmoudstore.magidash.api.repository;

import com.mahmoudstore.magidash.api.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
}
