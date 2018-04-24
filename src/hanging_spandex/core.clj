(ns hanging-spandex.core
  (:require [qbits.spandex :as spandex])
  (:gen-class))

(def host "http://localhost:9200")
(def spandex-client-atom (atom nil))

(defn go-spandex-go []
  (reset! spandex-client-atom (spandex/client {:hosts [host]}))
  )

(defn -main
  [& args]
  (println (go-spandex-go))
  ; (spandex/close! @spandex-client-atom)
  (println "You should see this and then quit!"))
