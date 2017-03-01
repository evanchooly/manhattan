# Manhattan


## What is it?
Manhattan is small library providing intellisense-compatible access to various values in `System.getProperties()`.  In certain targeted 
cases, functions exist to set those properties as well.  Most of the properties are "read only" as far as this project is concerned 
because it doesn't make sense to mutate those properties.

## Why is it?
In the Kotlin slack forums, Cedric Beust was bemoaning Kotlin's missed opportunity to expose certain properties as constants/functions.  
Some property names require frequent lookups to get correct and are seemingly impossible to remember.  Having members exposed to fetch 
values would allow for convenient autocomplete support removing some of those "burdens."

### Why 'Manhattan'?
Why the name?  Because this project is about the most popular properties.  And where do you find the most popular properties?  Manhattan,
 of course!