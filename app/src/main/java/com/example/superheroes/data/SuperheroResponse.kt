package com.example.superheroes.data

class SuperheroResponse (
    val response: String,
    val results: List<Superhero>
    )
{
}
class Superhero (
    val id: String,
    val name: String,
    val image: Image
) {

}

class Image (
    val url: String)