package com.example.superheroes.data

import com.google.gson.annotations.SerializedName

class SuperheroResponse (
    val response: String,
    val results: List<Superhero>
)

class Superhero (
    val id: String,
    val name: String,
    val biography: Biography,
    val work: Work,
    val appearance: Appearance,
    val image: Image
)

class Biography (
    val publisher: String,
    @SerializedName("full-name") val realName: String,
    @SerializedName("place-of-birth") val placeOfBirth: String,
    val alignment: String
)

class Work (
    val occupation: String,
    val base: String
)

class Appearance (
    val gender: String,
    val race: String,
    @SerializedName("eye-color") val eyeColor: String,
    @SerializedName("hair-color") val hairColor: String,
    val height: List<String>,
    val weight: List<String>,
) {
    fun getWeightKg(): String {
        return weight[1]
    }

    fun getHeightCm(): String {
        return height[1]
    }
}

class Image (val url: String)