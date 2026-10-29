package kz.rymbek.platform.common.base.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.RawQuery
import androidx.room.RoomRawQuery
import androidx.room.Update
import androidx.room.Upsert

interface BaseDao<Entity> {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertOrIgnore(entity: Entity): Long // -1, если строка уже есть

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertOrIgnore(entities: List<Entity>): LongArray

    @Update
    suspend fun update(entity: Entity): Int

    @Update
    suspend fun update(entities: List<Entity>): Int

    @Upsert
    suspend fun upsert(entity: Entity): Long // -1, если строка обновлена, а не вставлена

    @Upsert
    suspend fun upsert(entities: List<Entity>): LongArray

    @Delete
    suspend fun delete(entity: Entity)

    @Delete
    suspend fun delete(entities: List<Entity>)

    @RawQuery
    suspend fun findOne(query: RoomRawQuery): Entity?
}
