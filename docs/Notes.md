# Note
* Extension configure lazy load while plugin task executing
```gradle
    turquoise{
        //config will load while plugin task executing
        config = { project.config }
    }
```