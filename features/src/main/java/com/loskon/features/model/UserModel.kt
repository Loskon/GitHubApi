package com.loskon.features.model

import com.loskon.database.entity.UserEntity
import com.loskon.network.dto.UserDto
import java.time.LocalDateTime

data class UserModel(
    val login: String = "",
    val id: Long = 0L,
    val avatarUrl: String = "",
    val htmlUrl: String = "",
    val type: String = "",
    val name: String = "",
    val location: String = "",
    val createdAt: LocalDateTime = LocalDateTime.now(),
    // own
    val repositories: List<RepoModel> = emptyList(),
    val fromCache: Boolean = false
)

fun UserDto.toUserModel(): UserModel {
    return UserModel(
        login = login ?: "",
        id = id ?: 0,
        avatarUrl = avatarUrl ?: "",
        htmlUrl = htmlUrl ?: "",
        type = type ?: "",
        name = name ?: "",
        location = location ?: "",
        createdAt = createdAt ?: LocalDateTime.now()
    )
}

fun UserEntity.toUserModel(): UserModel {
    return UserModel(
        login = login ?: "",
        id = id ?: 0,
        avatarUrl = avatarUrl ?: "",
        htmlUrl = htmlUrl ?: "",
        type = type ?: "",
        name = name ?: "",
        location = location ?: "",
        createdAt = createdAt ?: LocalDateTime.now()
    )
}

fun UserModel.toUserEntity(
    fromCache: Boolean = false
): UserEntity {
    return UserEntity(
        login = login,
        id = id,
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        type = type,
        name = name,
        location = location,
        createdAt = createdAt,
        fromCache = fromCache
    )
}