# hanging-spandex

Issue: App code does not quit when using the Spandex client

Steps to reproduce: 

Using lein: Run `lein run` and watch as your process doesn't terminate

Using clj: Install clojure CLI & Run `clj -m hanging-spandex.core`

Build a jar `lein uberjar` and `java -jar target/uberjar/hanging-spandex-problem-0.1.0-SNAPSHOT-standalone.jar`

Things I have tried:
- Progressively trying leiningen versions all the way down to 2.4.3 (oldest available in Clojure docker)
- Downgrade spandex to 0.5.0
- Clojure 1.8.0

