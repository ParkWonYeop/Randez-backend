package io.rendez.user.entity

import io.rendez.common.entity.BaseEntity
import io.rendez.common.enums.Gender
import io.rendez.common.enums.ProfileStatus
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Table
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "users")
class User (
    @Column(name = "phone_number", unique = true, nullable = false)
    val phoneNumber: String,

    @Column(name = "user_name", nullable = false)
    val userName: String,

    @Column(name = "nick_name", nullable = false)
    val nickName: String,

    @Column(name = "birth_day", nullable = false)
    val birthDay: LocalDate,

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    val gender: Gender,

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "profile_status", nullable = false)
    val profileStatus: ProfileStatus,

    @Column(name = "is_verification", nullable = false)
    val isVerification: Boolean,

    @Column(nullable = false)
    val latitude: Double,

    @Column(nullable = false)
    val longitude: Double,

    @Column(name = "premium_coin", nullable = false)
    val premiumCoin: Int = 0,

    @Column(name = "mission_coin", nullable = false)
    val missionCoin: Int = 0,

    @Column(name = "last_login")
    val lastLogin: LocalDateTime? = null,

    @Column(name = "deleted_at")
    val deletedAt: LocalDateTime? = null
): BaseEntity()