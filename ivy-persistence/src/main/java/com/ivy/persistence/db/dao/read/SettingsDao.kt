package com.ivy.persistence.db.dao.read

import androidx.room.Dao
import androidx.room.Query
import com.ivy.persistence.db.entity.SettingsEntity
import java.util.*

@Dao
interface SettingsDao {
    @Query("SELECT * FROM settings LIMIT 1")
    suspend fun findFirst(): SettingsEntity

    @Query("SELECT * FROM settings")
    suspend fun findAll(): List<SettingsEntity>

    @Query("SELECT * FROM settings WHERE id = :id")
    suspend fun findById(id: UUID): SettingsEntity?
}