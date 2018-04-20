(ns hanging-spandex-problem.core-test
  (:use midje.sweet)
  (:require [qbits.spandex :as spandex]
            [hanging-spandex-problem.core :refer :all]))

(def host "http://127.0.0.1:9200")
(def client (memoize (fn [] (spandex/client {:hosts [host]}))))

(fact "something"
      (spandex/request (client) {:url "/_cat/indexes" :method :get})
      1 => 0)
