All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.3.0-alpha] - 2022-02-28
### Added
- Plugin settings page. *(Not yet working!)*

### Changed
- Plugin now works without any modifications to Vizality!

## [0.2.0] - 2022-02-27
### Added
- `CHANGELOG.md`, this changelog.
- `README.md`, which currently doesn't contain anything useful.
- More methods in `Plugin`.
- `Updatable` entity.
- `API.kt`, which currently contains some of the `Notifications` part of the API.

### Changed
- `Entities.kt`'s directory to `vizality`. All future Vizality code translations should be kept in this folder.
- Plugin `start()` to initiate a fun little notice interaction.

## [0.1.0] - 2022-02-27
### Added
- `Entities.kt`, where the `Entities` class described in the Vizality API is partially converted to a Kotlin class.
- `Main.kt`, where the plugin's class is defined, extending `Plugin` from `Entities.kt`.
  - Currently, simply contains `start()` and `stop()` functions that log "Hello" and "Goodbye".
- `manifest.json`, which is the same as any normal manifest in a JavaScript plugin.

[Unreleased]: https://github.com/valentinegb/vizalityxkotlin/compare/v0.3.0-alpha...HEAD
[0.3.0-alpha]: https://github.com/valentinegb/vizalityxkotlin/compare/v0.2.0...v0.3.0-alpha
[0.2.0]: https://github.com/valentinegb/vizalityxkotlin/compare/v0.1.0...v0.2.0
[0.1.0]: https://github.com/valentinegb/vizalityxkotlin/releases/v0.1.0