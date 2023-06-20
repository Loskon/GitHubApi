package com.loskon.database.source

import com.loskon.database.dao.UserDao
import com.loskon.database.entity.RepositoryEntity
import com.loskon.database.entity.UserEntity

class LocalDataSource(
    private val userDao: UserDao
) {

    suspend fun getCachedUsers(): List<UserEntity>? {
        return userDao.getCachedUsers()
    }

    suspend fun setUsers(users: List<UserEntity>) {
        userDao.insertUsers(users)
    }

    suspend fun getCachedUser(login: String): UserEntity? {
        return userDao.getUser(login)
    }

    suspend fun getCachedRepositories(login: String): List<RepositoryEntity>? {
        return userDao.getCachedRepositories(login)
    }

    suspend fun setUser(user: UserEntity) {
        userDao.insertUser(user)
    }

    suspend fun setRepositories(repositories:  List<RepositoryEntity> ) {
        userDao.insertRepositories(repositories)
    }
}