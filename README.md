## Sangria playground

This is a fork of https://github.com/sangria-graphql/sangria-playground

* master branch has some upgraded libs
* scala-2.13 branch uses some Sangria libs that I built for Sangria with Scala 2.13.0 and published as snapshots to the maven groupId `com.github.pjfanning.sangria`
  *  the sangria jar is based on https://github.com/sangria-graphql/sangria/pull/453

```bash
$ git clone https://github.com/pjfanning/sangria-playground.git
$ git checkout scala-2.13
$ cd sangria-playground
$ sbt run
```

Now you are ready to point your browser to [http://localhost:9000](http://localhost:9000).
The only prerequisites are [SBT](http://www.scala-sbt.org/download.html) and [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
