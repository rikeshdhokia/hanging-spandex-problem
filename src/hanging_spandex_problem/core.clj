(ns hanging-spandex-problem.core
  (:require [qbits.spandex :as spandex])
  (:gen-class))

(def host "http://localhost:9200")
(def client (memoize (fn [] (spandex/client {:hosts [host]}))))

(defn go-spandex-go []
  (spandex/request (client) {:url "/_cat/indices?v" :method :get}))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (try (go-spandex-go)
    (catch Exception ex (println ex)))
  (println "Hello, World!"))
