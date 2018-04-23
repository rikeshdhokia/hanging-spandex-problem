(ns hanging-spandex-problem.core-test
  ;;(:use midje.sweet)
  (:require [qbits.spandex :as spandex]
            [clojure.test :refer :all]
            [hanging-spandex-problem.core :refer :all]
            [clojure.java.shell :as shell]))

(def host "http://127.0.0.1:9200")
(def client (memoize (fn [] (spandex/client {:hosts [host]}))))

;; (fact "something"
;;       (spandex/request (client) {:url "/_cat/indexes" :method :get})

;;       1 => 0)

(deftest hanging-test
  (testing "hanging test"
    (spandex/request (client) {:url "/_cat/indexes" :method :get})
    (is (= 1 0))))
