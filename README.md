# Seven Up
Seven Up is a Kotlin CLI application.This is done as a practice project to familiarize with the Kotlin language. Feedback is very much appreciated via Github Issues or Pull Requests.

## Tooling
If you use [asdf](http://asdf-vm.com/), `.tool-versions` is included in this project.

## Run application 
```
./gradlew assembleDist

kotlin -cp app/build/libs/app.jar practice.kotlin.AppKt
```

## Development

### Tests
Unit tests are written for `SevenUp.kt.` However, no tests are written for `App.kt` yet.