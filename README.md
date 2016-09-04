<!-- ![Image](extras/logo.png) -->
# kotlin-pluralizer [![Build Status](https://travis-ci.org/cesarferreira/kotlin-pluralizer.svg?branch=master)](https://travis-ci.org/cesarferreira/kotlin-pluralizer)

**kotlin extension** to **pluralize** and **singularize** strings!


## Usage

**Pluralization:**

```kotlin
"person".pluralize()           # => "people"
"post".pluralize()             # => "posts"
"sheep".pluralize()            # => "sheep"
```

**Singuralization:**

```kotlin
"words".singularize()         # => "word"
"octopi".pluralize()          # => "octopus"

```

## Install

TODO

### Show some :heart:
[![GitHub followers](https://img.shields.io/github/followers/cesarferreira.svg?style=social&label=Follow)](https://github.com/cesarferreira/kotlin-pluralizer)   [![Twitter Follow](https://img.shields.io/twitter/follow/cesarmcferreira.svg?style=social)](https://twitter.com/cesarmcferreira)

## Contributing
I welcome and encourage all pull requests. It usually will take me within 24-48 hours to respond to any issue or request. Here are some basic rules to follow to ensure timely addition of your request:
  1. Match coding style (braces, spacing, etc.) This is best achieved using `CMD`+`Option`+`L` (Reformat code) on Mac (not sure for Windows) with Android Studio defaults.
  2. If its a feature, bugfix, or anything please only change code to what you specify.
  3. Please keep PR titles easy to read and descriptive of changes, this will make them easier to merge :)
  4. Pull requests _must_ be made against `develop` branch. Any other branch (unless specified by the maintainers) will get rejected.
  5. Check for existing [issues](https://github.com/cesarferreira/kotkotlin-pluralizer/issues) first, before filing an issue.  
  6. Have fun!


  ## Credits

  The pluralize and singularize methods are based on the code found in the following places.

  - https://github.com/atteo/evo-inflector/blob/master/src/main/java/org/atteo/evo/inflector/English.java
  - http://www.java2s.com/Tutorial/Java/0040__Data-Type/Transformswordstosingularpluralhumanizedhumanreadableunderscorecamelcaseorordinalform.htm
  - https://github.com/rails/rails/blob/26698fb91d88dca0f860adcb80528d8d3f0f6285/activesupport/lib/active_support/inflector/inflections.rb


### Created & Maintained By
[Cesar Ferreira](https://github.com/cesarferreira) ([@cesarmcferreira](https://www.twitter.com/cesarmcferreira))
