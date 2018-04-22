# hanging-spandex-problem

Run `lein midje` and watch as your process doesn't terminate

Can also run `./run-docker.sh` and tweak the docker image used in `Dockerfile`

Things I have tried:
- Progressively trying leiningen versions all the way down to 2.4.3 (oldest available in Clojure docker)
- Downgrade spandex to 0.5.0
- Use `clojure.deps` (see `deps.edn` and run `clj -C:test -R:midje -e "(require 'hanging-spandex-problem.core-test)"`)

