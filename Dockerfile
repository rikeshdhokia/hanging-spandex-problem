FROM clojure:lein-2.4.3-alpine

COPY . /usr/src/app
WORKDIR /usr/src/app

CMD ["lein", "midje"]
