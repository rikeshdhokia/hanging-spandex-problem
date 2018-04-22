#!/bin/bash

docker build -t hanging-spandex-problem .
docker run -it -v ~/.m2:/root/.m2 --rm hanging-spandex-problem
