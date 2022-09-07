package dev.vusi.android.swapp.datasource.cache.dao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import dev.vusi.android.swapp.datasource.cache.database.StarWarsAppDatabase
import dev.vusi.android.swapp.testutils.CharacterFactory
import dev.vusi.android.swapp.testutils.rules.TestDispatcherRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(AndroidJUnit4::class)
class StarWarsAppCharacterDaoTest {

    @get:Rule
    val instantTaskExecutor = InstantTaskExecutorRule()

    @OptIn(ExperimentalCoroutinesApi::class)
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    private lateinit var database: StarWarsAppDatabase
    private lateinit var characterDao: StarWarsAppCharacterDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            StarWarsAppDatabase::class.java
        ).allowMainThreadQueries().build()
        characterDao = database.characterDao
    }

    @Test
    fun `given when characters are inserted in database then check characters exist in database`() {
        val characters = CharacterFactory.generateCharacterList(requiredAmount = 3)
        runTest {
            characterDao.insertAllCharacters(characters)
            val savedCharacters = characterDao.getAllCharacters()
            assertEquals(characters, savedCharacters)
        }
    }

    @Test
    fun `given when clearDatabase option is called then database is empty`() {
        val characters = CharacterFactory.generateCharacterList(requiredAmount = 3)

        runTest {
            characterDao.insertAllCharacters(characters)
            characterDao.clearAllCharacters()

            val result = characterDao.getAllCharacters()

            assertTrue(result.isEmpty())
        }
    }

    @After
    fun tearDown() {
        database.close()
    }
}