package dev.vusi.android.swapp.domain.model

import dev.vusi.android.swapp.datasource.cache.models.EntityStarWarsCharacter
import dev.vusi.android.swapp.datasource.network.model.DTOStarWarsCharacter

object StarWarsCharacterDataMapper {

    fun DTOStarWarsCharacter.toEntityStarWarsCharacter(): EntityStarWarsCharacter {
        return EntityStarWarsCharacter(
            name = this.name.orEmpty(),
            height = this.height.orEmpty(),
            mass = this.mass.orEmpty(),
            hairColor = this.hairColor.orEmpty(),
            skinColor = this.skinColor.orEmpty(),
            eyeColor = this.eyeColor.orEmpty(),
            birthYear = this.birthYear.orEmpty(),
            gender = this.gender.orEmpty(),
            homeWorld = this.homeWorld.orEmpty(),
            films = this.films.orEmpty(),
            species = this.species.orEmpty(),
            vehicles = this.vehicles.orEmpty(),
            starShips = this.starShips.orEmpty(),
            created = this.created.orEmpty(),
            edited = this.edited.orEmpty(),
            this.url.orEmpty()
        )
    }

    fun EntityStarWarsCharacter.toStarWarsCharacter(): StarWarsCharacter {
        return StarWarsCharacter(
            name = this.name.orEmpty(),
            height = this.height.orEmpty(),
            mass = this.mass.orEmpty(),
            hairColor = this.hairColor.orEmpty(),
            skinColor = this.skinColor.orEmpty(),
            eyeColor = this.eyeColor.orEmpty(),
            birthYear = this.birthYear.orEmpty(),
            gender = this.gender.orEmpty(),
            homeWorld = this.homeWorld.orEmpty(),
            movies = this.films.orEmpty(),
            species = this.species.orEmpty(),
            vehicles = this.vehicles.orEmpty(),
            starShips = this.starShips.orEmpty(),
            created = this.created.orEmpty(),
            edited = this.edited.orEmpty(),
            this.url.orEmpty()
        )
    }
}