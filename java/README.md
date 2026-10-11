# Java Learning Journal

The exercises are separate Maven modules under a Java 21 parent project. Build
all exercises from this directory with:

```shell
mvn clean package
```

Run an exercise from this directory with its module's artifact ID:

```shell
mvn -pl day-01-records compile exec:java -Dexec.mainClass=Main
mvn -pl day-02-sealed-types compile exec:java -Dexec.mainClass=Main
```

Use JDK 21 or later. The Maven compiler is configured with `--release 21`.
