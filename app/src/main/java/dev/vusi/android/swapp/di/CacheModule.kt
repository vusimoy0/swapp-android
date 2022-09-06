package dev.vusi.android.swapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.vusi.android.swapp.datasource.cache.dao.SwAppCharacterDao
import dev.vusi.android.swapp.datasource.cache.database.SwAppDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheModule {

    @Provides
    @Singleton
    fun providesSwApiDatabase(@ApplicationContext appContext: Context): SwAppDatabase {
        return Room.databaseBuilder(appContext, SwAppDatabase::class.java, "swapp.db").build()
    }

    fun providesCharacterDao(appDatabase: SwAppDatabase): SwAppCharacterDao {
        return appDatabase.characterDao
    }
}