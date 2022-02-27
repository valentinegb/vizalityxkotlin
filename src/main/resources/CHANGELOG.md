All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- `CHANGELOG.md`, this changelog.
- `README.md`, which currently doesn't contain anything useful.

## [0.1.0] - 2022-02-27
### Added
- `Entities.kt`, where the `Entities` class described in the Vizality API is partially converted to a Kotlin class.
- `Main.kt`, where the plugin's class is defined, extending `Plugin` from `Entities.kt`.
  - Currently, simply contains `start()` and `stop()` functions that log "Hello" and "Goodbye".
- `manifest.json`, which is the same as any normal manifest in a JavaScript plugin.

[Unreleased]: https://github.com/valentinegb/vizalityxkotlin/compare/v0.1.0...HEAD
[0.1.0]: https://github.com/valentinegb/vizalityxkotlin/releases/v0.1.0