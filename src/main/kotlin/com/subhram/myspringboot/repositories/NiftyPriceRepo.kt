package com.subhram.myspringboot.repositories

import com.subhram.myspringboot.db_entities.NiftyPrice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface NiftyPriceRepo: JpaRepository<NiftyPrice, Long> {
    @Query("SELECT * FROM nifty_price ORDER BY id DESC LIMIT 1", nativeQuery = true)
    fun findLatestPrice(): NiftyPrice?
}
