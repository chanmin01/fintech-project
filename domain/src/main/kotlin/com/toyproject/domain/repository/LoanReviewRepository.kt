package com.toyproject.domain.repository

import com.toyproject.domain.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository: JpaRepository<LoanReview, Long> {
}