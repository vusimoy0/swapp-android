package dev.vusi.android.swapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.vusi.android.swapp.datasource.cache.StarWarsAppCache
import dev.vusi.android.swapp.datasource.cache.StarWarsAppCacheImpl
import dev.vusi.android.swapp.datasource.cache.dao.StarWarsAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.database.StarWarsAppDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheModule {

    @Provides
    @Singleton
    fun providesSwApiDatabase(@ApplicationContext appContext: Context): StarWarsAppDatabase {
        return Room.databaseBuilder(appContext, StarWarsAppDatabase::class.java, "swapp.db").build()
    }

    @Provides
    @Singleton
    fun providesCharacterDao(appDatabase: StarWarsAppDatabase): StarWarsAppCharacterDao {
        return appDatabase.characterDao
    }

    @Provides
    @Singleton
    fun providesAppCache(dao: StarWarsAppCharacterDao): StarWarsAppCache {
        return StarWarsAppCacheImpl(dao = dao)
    }
}