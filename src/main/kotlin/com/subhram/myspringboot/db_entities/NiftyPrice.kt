package com.subhram.myspringboot.db_entities
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "nifty_price")
class NiftyPrice {
    @Id
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "timestamp")
    var timestamp: Timestamp = Timestamp(System.currentTimeMillis())

    @Column(name = "tick_price")
    var tickPrice: Double = 0.0
}
