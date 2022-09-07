package dev.vusi.android.swapp.testutils

import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import dev.vusi.android.swapp.testutils.factory.DataFactory

object CharacterFactory {

    fun generateCharacterList(requiredAmount: Int): List<EntityStarWarsCharacter> {
        val charactersList = mutableListOf<EntityStarWarsCharacter>()
        repeat(times = requiredAmount) {
            charactersList.add(
                EntityStarWarsCharacter(
                    name = DataFactory.randomString(),
                    url = DataFactory.randomString(),
                    height = DataFactory.randomString(),
                    mass = DataFactory.randomString(),
                    hairColor = DataFactory.randomString(),
                    skinColor = DataFactory.randomString(),
                    eyeColor = DataFactory.randomString(),
                    birthYear = DataFactory.randomString(),
                    gender = DataFactory.randomString(),
                    homeWorld = DataFactory.randomString(),
                    films = generateRandomStringsList(requiredAmount),
                    species = generateRandomStringsList(requiredAmount),
                    vehicles = generateRandomStringsList(requiredAmount),
                    starShips = generateRandomStringsList(requiredAmount),
                    created = DataFactory.randomString(),
                    edited = DataFactory.randomString()
                )
            )
        }
        return charactersList.toList()
    }

    private fun generateRandomStringsList(requiredNumber: Int): List<String> {
        val charactersList = mutableListOf<String>()
        repeat(requiredNumber) {
            charactersList.add(DataFactory.randomString())
        }
        return charactersList.toList()
    }
}