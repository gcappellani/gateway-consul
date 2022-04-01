package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable

@Client(id="service2", path="/books")
@CircuitBreaker(delay = "5s", attempts = "5", multiplier = "3", reset = "300s")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}