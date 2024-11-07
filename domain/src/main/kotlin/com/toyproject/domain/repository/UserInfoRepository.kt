package com.toyproject.domain.repository

import com.toyproject.domain.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo, Long>