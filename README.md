Konvert is a sample Android application written in Kotlin. It mimics the [Revolut](https://www.revolut.com/) currency converter.

# Screenshots

<p>
  <img src="art/screenshot.png" width="45%">
  <img src="art/screencast.gif" width="45%">
</p>


# Technologies used

This project is developped in Kotlin, and uses [the CLEAN architecture.](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html)

![cleanarchitecture](https://user-images.githubusercontent.com/4358453/50484958-7966e480-09f3-11e9-8ac6-bb138e2595e9.jpg)

# Main libraries used

* Dagger2
* RxJava2
* Retrofit2

# Modules


* `data/` : contains the code to access to the data (repository pattern)
* `domain/` : contains the business logic and the usecases
* `app` : Presentation layer, contains the UI 
